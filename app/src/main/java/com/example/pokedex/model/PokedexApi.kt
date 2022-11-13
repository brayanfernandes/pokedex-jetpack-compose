package com.example.pokedex.model

import com.example.pokedex.model.pokemon.PokemonsResult
import com.example.pokedex.model.pokemon.info.PokemonCompleteInfo
import retrofit2.http.GET
import retrofit2.http.Path

interface PokedexApi {

    @GET("pokemon")
    suspend fun getPokemons():PokemonsResult

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(@Path("name")name:String):PokemonCompleteInfo

}