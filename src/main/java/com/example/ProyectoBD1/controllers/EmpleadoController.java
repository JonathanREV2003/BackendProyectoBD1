package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Empleado;
import com.example.ProyectoBD1.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Empleado getById(@PathVariable Integer id) {
        return empleadoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Empleado empleado) {
        empleadoRepository.create(empleado);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Empleado empleado) {
        empleadoRepository.update(id, empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        empleadoRepository.delete(id);
    }
}
