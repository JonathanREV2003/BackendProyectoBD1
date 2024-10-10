package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.DetalleCita;
import com.example.ProyectoBD1.repositories.DetalleCitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/detallecita")
public class DetalleCitaController {

    @Autowired
    DetalleCitaRepository detalleCitaRepository;

    @GetMapping
    public List<DetalleCita> getAll() {
        return detalleCitaRepository.findAll();
    }

    @GetMapping("/{id}")
    public DetalleCita getById(@PathVariable Integer id) {
        return detalleCitaRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody DetalleCita detalleCita) {
        detalleCitaRepository.create(detalleCita);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody DetalleCita detalleCita) {
        detalleCitaRepository.update(id, detalleCita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleCitaRepository.delete(id);
    }
}