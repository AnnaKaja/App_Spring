package com.pokemon.service;
import com.pokemon.dto.PokemonDto;

import java.io.IOException;
public class PokemonServiceImplTest implements PokemonService {

    @Override
    public PokemonDto getPokemonDto(String id) {
        return new PokemonDto();
    }

    @Override
    public void addToDb(PokemonDto pokemonDto) {

    }

    @Override
    public PokemonDto getPokemonById(String id) {
        return null;
    }
}