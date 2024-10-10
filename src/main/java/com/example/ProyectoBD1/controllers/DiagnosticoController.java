package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Diagnostico;
import com.example.ProyectoBD1.repositories.DiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/diagnostico")
public class DiagnosticoController {

    @Autowired
    DiagnosticoRepository diagnosticoRepository;

    @GetMapping
    public List<Diagnostico> getAll() {
        return diagnosticoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Diagnostico getById(@PathVariable Short id) {
        return diagnosticoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Diagnostico diagnostico) {
        diagnosticoRepository.create(diagnostico);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Short id, @RequestBody Diagnostico diagnostico) {
        diagnosticoRepository.update(id, diagnostico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Short id) {
        diagnosticoRepository.delete(id);
    }
}
