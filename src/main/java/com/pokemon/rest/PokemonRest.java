package com.pokemon.rest;

import com.pokemon.dto.PokemonDto;
import com.pokemon.service.PokemonJdbcService;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class PokemonRest {

    private PokemonService pokemonService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public PokemonRest(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping("/admin/pokemon")
    public PokemonDto getPokemon(@RequestParam(value = "id") int id) throws IOException {

        PokemonDto pokemonDto1 = pokemonService.getPokemonById(id);
        if (pokemonDto1 != null) return pokemonDto1;

        PokemonDto pokemonDto = pokemonService.getPokemonDto(id);
        pokemonService.addToDb(pokemonDto, id);
        return pokemonDto;

    }

    @GetMapping("/user/getAll")

    public List<PokemonDto> getPokemon() {
       return asList(new PokemonDto());
    }

    //get ktory to wyswietli //getAllPokemons


}