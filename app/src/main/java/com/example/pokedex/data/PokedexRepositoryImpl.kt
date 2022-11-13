package com.example.pokedex.data

import com.example.pokedex.model.PokedexApi
import com.example.pokedex.model.PokedexRepository
import com.example.pokedex.model.pokemon.PokemonsResult

class PokedexRepositoryImpl(private val pokedexApi:PokedexApi):PokedexRepository {
    override suspend fun getPokemons(): PokemonsResult {
        return pokedexApi.getPokemons()
    }
}