package com.example.digimonpokemonapp.data.remote.dto


data class PokemonDTO(
    val count: Int,
    val next: String,
    val previous: Any?,
    val results: List<Result>
)

data class Result(
    val name: String,
    val url: String
)