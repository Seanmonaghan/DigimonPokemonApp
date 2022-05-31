package com.example.digimonpokemonapp.data.remote.service

import com.example.digimonpokemonapp.data.remote.dto.DigimonDTO
import retrofit2.http.GET

interface DigimonService {

    @GET("digimon")
    suspend fun getAllDigimon(): DigimonDTO

}