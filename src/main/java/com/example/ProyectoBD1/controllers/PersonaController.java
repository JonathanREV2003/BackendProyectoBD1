package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Persona;
import com.example.ProyectoBD1.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    //OBTENER por todos
    @GetMapping
    public List<Persona> GetAll(){
        return personaRepository.findAll();
    }
    //OBTENER por ID
    @GetMapping(value="/{id}")
    public Persona GetById(@PathVariable Long id){
        return personaRepository.findById(id);
    }
    //crear
    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Persona persona){
        personaRepository.create(persona);
    }
    //editar ejemplo:  <localhost:8080/api/persona/1>
    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Persona persona) {
        personaRepository.update(id, persona);
    }
    // eliminar solo por ID ejemplo: <localhost:8080/api/persona/1>
    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        personaRepository.delate(id);
    }
}
