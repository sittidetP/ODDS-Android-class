package com.example.pokemon.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.databinding.PokemonCardItemBinding
import com.example.pokemon.model.Pokemon

class PokemonViewHolder( //bind item in recyclerView
    private val binding: PokemonCardItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(pokemon: Pokemon) {
        binding.nameTextView.text = pokemon.name.english
        binding.typeTextView.text = pokemon.types.joinToString(", ")
    }
}