package com.example.pokedex.model.pokemon.info


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)