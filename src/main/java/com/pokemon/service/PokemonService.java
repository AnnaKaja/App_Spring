package com.pokemon.service;

import com.pokemon.dto.PokemonDto;

import java.io.IOException;

public interface PokemonService {

    PokemonDto getPokemonDto(String id);

    void addToDb(PokemonDto pokemonDto);

    PokemonDto getPokemonById(String id);

    PokemonDto getPokemonDto(int id) throws IOException;
    void addToDb(PokemonDto pokemonDto, int id);

    PokemonDto getPokemonById(int id);
}