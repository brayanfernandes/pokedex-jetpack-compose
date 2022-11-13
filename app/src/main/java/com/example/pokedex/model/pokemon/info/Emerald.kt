package com.example.pokedex.model.pokemon.info


import com.google.gson.annotations.SerializedName

data class Emerald(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_shiny")
    val frontShiny: String
)