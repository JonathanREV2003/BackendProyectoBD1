package com.example.ProyectoBD1.controllers;


import com.example.ProyectoBD1.models.entities.Raza;
import com.example.ProyectoBD1.repositories.RazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/raza")
public class RazaController {
    @Autowired
    RazaRepository razaRepository;

    @GetMapping
    public List<Raza> GetAll(){
        return razaRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Raza GetById(@PathVariable Long id){
        return razaRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Raza raza){
        razaRepository.create(raza);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Raza raza) {
        razaRepository.update(id, raza);
    }

    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        razaRepository.delete(id);
    }
}
