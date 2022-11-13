package com.example.pokedex.model

import com.example.pokedex.data.PokedexRepositoryImpl
import com.example.pokedex.model.pokemon.PokemonsResult

interface PokedexRepository {
    suspend fun getPokemons():PokemonsResult


}