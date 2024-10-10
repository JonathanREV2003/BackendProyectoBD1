package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.DetalleTratamiento;
import com.example.ProyectoBD1.repositories.DetalleTratamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/detalletratamiento")
public class DetalleTratamientoController {

    @Autowired
    DetalleTratamientoRepository detalleTratamientoRepository;

    @GetMapping
    public List<DetalleTratamiento> getAll() {
        return detalleTratamientoRepository.findAll();
    }

    @GetMapping("/{id}")
    public DetalleTratamiento getById(@PathVariable Integer id) {
        return detalleTratamientoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody DetalleTratamiento detalleTratamiento) {
        detalleTratamientoRepository.create(detalleTratamiento);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody DetalleTratamiento detalleTratamiento) {
        detalleTratamientoRepository.update(id, detalleTratamiento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleTratamientoRepository.delete(id);
    }
}
