package com.example.pokemon.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.pokemon.PokemonCollectionActivity
import com.example.pokemon.PokemonDetailActivity
import com.example.pokemon.R
import com.example.pokemon.databinding.FragmentHomeBinding
import com.example.pokemon.viewModel.HomeViewModel


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    val viewModel: HomeViewModel by viewModels()
//    val viewModel: HomeViewModel by activityViewModels() // viewModel will attach to Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pokeballImageView.setOnClickListener {
            val intent = Intent(context, PokemonDetailActivity::class.java)
            intent.putExtra("Name", "JJ")
            startActivity(intent)
        }

        binding.backpackImageView.setOnClickListener {
            val action =
                R.id.action_homeFragment_to_pokemonCollectionFragment
            findNavController().navigate(action)
        }

        viewModel.getPokemonList()
    }
}