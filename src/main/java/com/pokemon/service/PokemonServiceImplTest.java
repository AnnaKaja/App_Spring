package com.pokemon.service;
import com.pokemon.dto.PokemonDto;

import java.io.IOException;

public class PokemonServiceImplTest implements PokemonService {

    @Override
    public PokemonDto getPokemonDto(String id) {
        return new PokemonDto("bublbasaur","20");
    }

    @Override
    public void addToDb(PokemonDto pokemonDto) {

    }
}