package com.example.digimonpokemonapp.di.remote_module

import com.example.digimonpokemonapp.data.remote.service.DigimonService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDigimonModule {

    private const val BASE_URL = "https://digimon-api.vercel.app/api/"

    @Provides
    @Singleton
    fun providesDigimonService(): DigimonService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(DigimonService::class.java)
}