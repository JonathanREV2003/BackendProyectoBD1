package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Cita;
import com.example.ProyectoBD1.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/cita")
public class CitaController {

    @Autowired
    CitaRepository citaRepository;

    @GetMapping
    public List<Cita> getAll() {
        return citaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cita getById(@PathVariable Long id) {
        return citaRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Cita cita) {
        citaRepository.create(cita);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Cita cita) {
        citaRepository.update(id, cita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        citaRepository.delete(id);
    }
}
