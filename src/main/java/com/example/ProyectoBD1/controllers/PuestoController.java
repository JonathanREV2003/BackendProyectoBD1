package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Puesto;
import com.example.ProyectoBD1.repositories.PuestoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/puesto")
public class PuestoController {

    @Autowired
    PuestoRepository puestoRepository;

    @GetMapping
    public List<Puesto> GetAll(){
        return puestoRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Puesto GetById(@PathVariable Long id){
        return puestoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Puesto puesto){
        puestoRepository.create(puesto);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Puesto puesto) {
        puestoRepository.update(id, puesto);
    }

    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        puestoRepository.delete(id);
    }



}
