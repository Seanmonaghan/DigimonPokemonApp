package com.example.digimonpokemonapp.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Digimon(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 1,
    val name: String
)
