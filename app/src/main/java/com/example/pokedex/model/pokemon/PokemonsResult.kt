package com.example.pokedex.model.pokemon


import com.google.gson.annotations.SerializedName

data class PokemonsResult(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String?,
    @SerializedName("previous")
    val previous: String?,
    @SerializedName("results")
    val pokemonBasicInfos: List<PokemonBasicInfo>
)