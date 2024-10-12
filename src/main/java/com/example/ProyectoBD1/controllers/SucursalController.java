package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Persona;
import com.example.ProyectoBD1.models.entities.Sucursal;
import com.example.ProyectoBD1.repositories.PersonaRepository;
import com.example.ProyectoBD1.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/sucursal")
public class SucursalController {
    @Autowired
    SucursalRepository sucursalRepository;

    @GetMapping
    public List<Sucursal> GetAll(){
        return sucursalRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Sucursal GetById(@PathVariable Long id){
        return sucursalRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Sucursal sucursal){
        sucursalRepository.create(sucursal);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Sucursal sucursal) {
        sucursalRepository.update(id, sucursal);
    }

    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        sucursalRepository.delete(id);
    }
}
