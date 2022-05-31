package com.example.digimonpokemonapp.data.remote.service

import com.example.digimonpokemonapp.data.remote.dto.PokemonDTO
import retrofit2.http.GET

interface PokemonService {

    @GET("pokemon?limit=151")
    suspend fun getAll151Pokemon(): PokemonDTO

}