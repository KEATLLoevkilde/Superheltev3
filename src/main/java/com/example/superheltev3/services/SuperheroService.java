package com.example.superheltev3.services;

import com.example.superheltev3.models.Superhero;
import org.springframework.stereotype.Service;
import com.example.superheltev3.repositories.SuperheroRepository;

import java.util.List;

@Service
public class SuperheroService {
    private SuperheroRepository repository;

    public SuperheroService(SuperheroRepository repository) {
        this.repository = repository;
    }

    public List<Superhero> getAllSuperheroes(){
        return repository.getSuperheroes();
    }

    public Superhero getSuperhero(String heroName){
        return repository.getSuperhero(heroName);
    }

    public Superhero postSuperhero(Superhero superhero) {
        return repository.createSuperhero(superhero);

    }

    public Superhero putSuperhero(Superhero superhero){
        return repository.editSuperhero(superhero);
    }

    public Superhero deleteSuperhero(String heroName) {
        return repository.deleteSuperhero(heroName);
    }


}
