package com.example.digimonpokemonapp.data.repo

import com.example.digimonpokemonapp.data.local.database.AppDatabase
import com.example.digimonpokemonapp.data.local.entity.Digimon
import com.example.digimonpokemonapp.data.local.entity.Pokemon
import com.example.digimonpokemonapp.data.remote.service.DigimonService
import com.example.digimonpokemonapp.data.remote.service.PokemonService
import dagger.Module
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AppRepository @Inject constructor(
    private val pokemon_service: PokemonService,
    private val digimon_service: DigimonService,
    private val database: AppDatabase
) {

    suspend fun getAllDigimon(): List<Digimon> = withContext(Dispatchers.IO) {
        return@withContext database.digimonDao().getAllDigimon().ifEmpty {
            val digimonList = digimon_service.getAllDigimon().map {
                Digimon(
                    name = it.name
                )
            }
            database.digimonDao().insertDigimon(digimonList)
            return@ifEmpty digimonList
        }
    }

    suspend fun getAllPokemon(): List<Pokemon> = withContext(Dispatchers.IO) {
        return@withContext database.pokemonDao().getAllPokemon().ifEmpty {
            val pokemonList = pokemon_service.getAll151Pokemon().results.map {
                Pokemon(
                    name = it.name
                )
            }
            database.pokemonDao().insertPokemon(pokemonList)
            return@ifEmpty pokemonList
        }
    }
}