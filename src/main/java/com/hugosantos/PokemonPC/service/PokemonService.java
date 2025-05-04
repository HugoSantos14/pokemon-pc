package com.hugosantos.PokemonPC.service;

import com.hugosantos.PokemonPC.model.Pokemon;
import com.hugosantos.PokemonPC.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    //LISTAR
    public List<Pokemon> getAll() {
        return pokemonRepository.findAll();
    }

    // CRIAR
    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    // DELETAR
    public void delete(Long id) {
        pokemonRepository.deleteById(id);
    }
}
