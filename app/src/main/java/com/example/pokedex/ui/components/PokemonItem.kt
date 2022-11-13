package com.example.pokedex.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.pokedex.model.pokemon.info.PokemonCompleteInfo

@Composable
fun PokemonItem(
    modifier: Modifier = Modifier,
    pokemonInfo:PokemonCompleteInfo,
){
    Row(modifier = modifier
        .clickable { }
        .padding(16.dp)) {
        AsyncImage(
            modifier=Modifier.padding(end=16.dp),
            model = pokemonInfo.sprites.frontDefault,
            contentDescription = null
        )
        Text(pokemonInfo.name)
    }
}