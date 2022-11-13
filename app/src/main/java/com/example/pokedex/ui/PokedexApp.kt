package com.example.pokedex.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pokedex.model.PokedexRepository
import com.example.pokedex.ui.home.Home
import com.example.pokedex.ui.home.HomeViewModel
import com.example.pokedex.ui.home.MyHomeViewModelFactory
import com.example.pokedex.ui.theme.PokedexTheme

@Composable
fun PokedexApp(
    pokedexRepository:PokedexRepository
){
    PokedexTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {Text("Home")}
                )
            }
        ) {
            val homeViewModel:HomeViewModel = viewModel(factory = MyHomeViewModelFactory(pokedexRepository = pokedexRepository))
            Home(viewModel = homeViewModel)
        }
    }
}