package com.example.digimonpokemonapp.presentation.ui.digimon

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.digimonpokemonapp.data.local.entity.Digimon
import com.example.digimonpokemonapp.data.local.entity.Pokemon
import com.example.digimonpokemonapp.data.repo.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class DigimonViewModel @Inject constructor(
    private val appRepository: AppRepository
) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text

    private val _digimonData = MutableLiveData<List<Digimon>>()
    val digimonData : LiveData<List<Digimon>> get() = _digimonData

    private val _pokemonData = MutableLiveData<List<Pokemon>>()
    val pokemonData: LiveData<List<Digimon>> get() = pokemonData

    private fun getAllDigimon() {
        viewModelScope.launch {
            _digimonData.value = appRepository.getAllDigimon()
        }
    }

    private fun getAllPokemon() {
        viewModelScope.launch {
            _pokemonData.value = appRepository.getAllPokemon()
        }
    }
}