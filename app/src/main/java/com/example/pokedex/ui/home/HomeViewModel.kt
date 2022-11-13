package com.example.pokedex.ui.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.pokedex.model.PokedexRepository
import com.example.pokedex.model.pokemon.PokemonsResult
import com.example.pokedex.model.pokemon.info.PokemonCompleteInfo
import kotlinx.coroutines.launch

private const val TAG = "HomeViewModel"

data class HomeUiState(
    val loading:Boolean = false,
    val pokemons:List<PokemonCompleteInfo>? = null,
    val error:String? = null
)
class HomeViewModel(private val pokedexRepository: PokedexRepository): ViewModel() {
    var uiState:MutableState<HomeUiState> = mutableStateOf(HomeUiState())
        private set

    init {
        loadPokemons()
    }

    fun loadPokemons(){
        viewModelScope.launch {
            uiState.value = HomeUiState(loading = true)
            val pokemonsResult = pokedexRepository.getPokemons()
            val pokemons:MutableList<PokemonCompleteInfo> = mutableListOf()
            pokemonsResult.pokemonBasicInfos.forEach {
                val result = pokedexRepository.getPokemonInfo(it.name)
                pokemons.add(result)
            }
            uiState.value = HomeUiState(pokemons = pokemons)
        }
    }
}

class MyHomeViewModelFactory(private val pokedexRepository: PokedexRepository):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return HomeViewModel(pokedexRepository = pokedexRepository) as T
    }
}