package com.example.digimonpokemonapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.digimonpokemonapp.data.local.entity.Pokemon

@Dao
abstract class PokemonDao {
    @Query("SELECT * FROM pokemon")
    abstract fun getAllPokemon(): List<Pokemon>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertPokemon(pokemon: List<Pokemon>)
}