package com.example.pokedex.model

import com.example.pokedex.data.PokedexRepositoryImpl
import com.example.pokedex.model.pokemon.PokemonsResult
import com.example.pokedex.model.pokemon.info.PokemonCompleteInfo

interface PokedexRepository {
    suspend fun getPokemons():PokemonsResult
    suspend fun getPokemonInfo(name:String):PokemonCompleteInfo

}