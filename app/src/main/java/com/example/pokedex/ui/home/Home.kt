package com.example.pokedex.ui.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.pokedex.ui.components.PokemonItem

@Composable
fun Home(
    viewModel: HomeViewModel
){
    val uiState = viewModel.uiState.value

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        if(uiState.loading){
            CircularProgressIndicator()
        }
        if(uiState.error!= null){
            Text("An error occurred")
        }
        if(uiState.pokemons != null){
            LazyColumn(){
                items(uiState.pokemons){ pokemon->
                    PokemonItem(
                        modifier=Modifier.fillMaxWidth(),
                        pokemonInfo = pokemon
                    )
                }
            }
        }
    }
}