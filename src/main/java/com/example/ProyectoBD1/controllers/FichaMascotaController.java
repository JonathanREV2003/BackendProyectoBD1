package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.FichaMascota;
import com.example.ProyectoBD1.repositories.FichaMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/fichamascota")
public class FichaMascotaController {

    @Autowired
    FichaMascotaRepository fichaMascotaRepository;

    @GetMapping
    public List<FichaMascota> getAll() {
        return fichaMascotaRepository.findAll();
    }

    @GetMapping("/{id}")
    public FichaMascota getById(@PathVariable Integer id) {
        return fichaMascotaRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody FichaMascota fichaMascota) {
        fichaMascotaRepository.create(fichaMascota);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody FichaMascota fichaMascota) {
        fichaMascotaRepository.update(id, fichaMascota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        fichaMascotaRepository.delete(id);
    }
}