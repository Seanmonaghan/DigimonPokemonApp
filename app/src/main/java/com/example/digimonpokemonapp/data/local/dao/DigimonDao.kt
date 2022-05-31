package com.example.digimonpokemonapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.digimonpokemonapp.data.local.entity.Digimon

@Dao
abstract class DigimonDao {

    @Query("SELECT * FROM digimon")
    abstract fun getAllDigimon(): List<Digimon>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertDigimon(digimon: List<Digimon>)

}