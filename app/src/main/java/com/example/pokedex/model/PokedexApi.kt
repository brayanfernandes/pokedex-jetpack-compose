package com.example.pokedex.model

import com.example.pokedex.model.pokemon.PokemonsResult
import retrofit2.http.GET

interface PokedexApi {
    @GET("pokemon")
    suspend fun getPokemons():PokemonsResult
}