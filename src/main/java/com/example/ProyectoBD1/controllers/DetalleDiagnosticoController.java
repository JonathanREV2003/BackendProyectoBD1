package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.DetalleDiagnostico;
import com.example.ProyectoBD1.repositories.DetalleDiagnosticoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/detallediagnostico")
public class DetalleDiagnosticoController {

    @Autowired
    DetalleDiagnosticoRepository detalleDiagnosticoRepository;

    @GetMapping
    public List<DetalleDiagnostico> getAll() {
        return detalleDiagnosticoRepository.findAll();
    }

    @GetMapping("/{id}")
    public DetalleDiagnostico getById(@PathVariable Integer id) {
        return detalleDiagnosticoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody DetalleDiagnostico detalleDiagnostico) {
        detalleDiagnosticoRepository.create(detalleDiagnostico);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody DetalleDiagnostico detalleDiagnostico) {
        detalleDiagnosticoRepository.update(id, detalleDiagnostico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleDiagnosticoRepository.delete(id);
    }
}
