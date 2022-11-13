package com.example.pokedex

import android.app.Application
import com.example.pokedex.data.PokedexRepositoryImpl
import com.example.pokedex.model.PokedexApi
import com.example.pokedex.model.PokedexRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PokedexApplication:Application() {
    lateinit var pokedexRepository:PokedexRepository
    override fun onCreate() {
        super.onCreate()

        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.POKEDEX_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val pokedexApi = retrofit.create(PokedexApi::class.java)
        pokedexRepository = PokedexRepositoryImpl(pokedexApi)
    }
}