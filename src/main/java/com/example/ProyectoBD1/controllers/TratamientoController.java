package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Telefono;
import com.example.ProyectoBD1.models.entities.Tratamiento;
import com.example.ProyectoBD1.repositories.TratamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/tratamiento")
public class TratamientoController {
    @Autowired
    TratamientoRepository tratamientoRepository;

    @GetMapping
    public List<Tratamiento> GetAll(){
        return tratamientoRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Tratamiento GetById(@PathVariable Long id){
        return tratamientoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Tratamiento tratamiento){
        tratamientoRepository.create(tratamiento);
    }
}
