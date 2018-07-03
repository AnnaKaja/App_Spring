package com.pokemon.rest;


import com.pokemon.dto.PokemonDto;
import com.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@RestController
public class PokemonRest {

    private PokemonService pokemonService;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    public PokemonRest(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @RequestMapping("/pokemon")
    public PokemonDto getPokemon(@RequestParam(value="id") String id) throws IOException {
        return pokemonService.getPokemonDto(id);
    }


    @PostMapping("/addPokemon")
    public ResponseEntity<String> addPokemon(@RequestBody PokemonDto pokemonDto) {
        pokemonService.addToDb(pokemonDto);
        return new ResponseEntity<>(HttpStatus.CREATED);

        //TODO
        // /addPokemon -> post tworzacy
        //pokemon zapisany do bazy
    }

        @GetMapping("/getAll")
        public List<PokemonDto> getPokemon() {
            return null;
        }


        //get ktory to wyswietli //getAllPokemons


}
