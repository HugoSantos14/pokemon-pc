package com.hugosantos.PokemonPC.repository;

import com.hugosantos.PokemonPC.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
