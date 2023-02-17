package com.example.superheltev3.controllers;

import com.example.superheltev3.models.Superhero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.superheltev3.services.SuperheroService;

import java.util.List;

@Controller
@RequestMapping(path = "superhero")
public class SuperheroController {
    private SuperheroService superheroService;

    public SuperheroController(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<Superhero>> allSuperheroes(){
        List <Superhero> superheroes = superheroService.getAllSuperheroes();
        return new ResponseEntity<>(superheroes, HttpStatus.OK);
    }

    @GetMapping(path = "/{heroName}")
    public ResponseEntity<Superhero> getSuperhero(@PathVariable String heroName){
        Superhero superhero = superheroService.getSuperhero(heroName);
        return new ResponseEntity<>(superhero, HttpStatus.OK);
    }

    @PostMapping(path = "opret")
    public ResponseEntity<Superhero> postSuperhero(@RequestBody Superhero superhero){
        Superhero newSuperhero = superheroService.postSuperhero(superhero);
        return new ResponseEntity<>(newSuperhero, HttpStatus.OK);
    }

    @PutMapping(path = "ret")
    public ResponseEntity<Superhero> putSuperhero(@RequestBody Superhero superhero){
        Superhero newSuperhero = superheroService.putSuperhero(superhero);
        return new ResponseEntity<>(newSuperhero, HttpStatus.OK);
    }

    @DeleteMapping(path = "/slet/{heroName}")
    public ResponseEntity<Superhero> deleteSuperhero(@PathVariable String heroName){
        Superhero deletedSuperhero = superheroService.deleteSuperhero(heroName);
        return new ResponseEntity<>(deletedSuperhero, HttpStatus.OK);
    }





}
