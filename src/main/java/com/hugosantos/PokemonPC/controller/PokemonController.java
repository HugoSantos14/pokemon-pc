package com.hugosantos.PokemonPC.controller;

import com.hugosantos.PokemonPC.model.Pokemon;
import com.hugosantos.PokemonPC.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public List<Pokemon> getAll() {
        return pokemonService.getAll();
    }

    @PostMapping
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return pokemonService.save(pokemon);
    }
}
