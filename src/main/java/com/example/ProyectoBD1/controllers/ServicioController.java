package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Raza;
import com.example.ProyectoBD1.models.entities.Servicio;
import com.example.ProyectoBD1.repositories.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/servicio")
public class ServicioController {
    @Autowired
    ServicioRepository servicioRepository;

    @GetMapping
    public List<Servicio> GetAll(){
        return servicioRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Servicio GetById(@PathVariable Long id){
        return servicioRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Servicio servicio){
        servicioRepository.create(servicio);
    }
}
