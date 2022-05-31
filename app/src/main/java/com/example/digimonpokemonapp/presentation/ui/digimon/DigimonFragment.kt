package com.example.digimonpokemonapp.presentation.ui.digimon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.digimonpokemonapp.R
import com.example.digimonpokemonapp.databinding.FragmentSlideshowBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DigimonFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textSlideshow.text = getString(R.string.hello_digimon_fragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}