package com.example.digimonpokemonapp.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.digimonpokemonapp.data.local.dao.DigimonDao
import com.example.digimonpokemonapp.data.local.dao.PokemonDao
import com.example.digimonpokemonapp.data.local.entity.Digimon
import com.example.digimonpokemonapp.data.local.entity.Pokemon

@Database(entities = [Digimon::class, Pokemon::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun digimonDao(): DigimonDao

    abstract fun pokemonDao(): PokemonDao

}