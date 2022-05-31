package com.example.digimonpokemonapp.data.remote.dto
import com.google.gson.annotations.SerializedName


class DigimonDTO : ArrayList<DigimonDTOItem>()

data class DigimonDTOItem(
    val img: String,
    val level: String,
    val name: String
)
