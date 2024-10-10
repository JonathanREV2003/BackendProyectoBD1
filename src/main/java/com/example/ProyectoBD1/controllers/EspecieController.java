package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Especie;
import com.example.ProyectoBD1.repositories.EspecieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/especie")
public class EspecieController {

    @Autowired
    EspecieRepository especieRepository;

    @GetMapping
    public List<Especie> getAll() {
        return especieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Especie getById(@PathVariable Short id) {
        return especieRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Especie especie) {
        especieRepository.create(especie);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Short id, @RequestBody Especie especie) {
        especieRepository.update(id, especie);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Short id) {
        especieRepository.delete(id);
    }
}
