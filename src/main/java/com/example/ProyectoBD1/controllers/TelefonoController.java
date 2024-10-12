package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Sucursal;
import com.example.ProyectoBD1.models.entities.Telefono;
import com.example.ProyectoBD1.repositories.TelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/telefono")
public class TelefonoController {
    @Autowired
    TelefonoRepository telefonoRepository;

    @GetMapping
    public List<Telefono> GetAll(){
        return telefonoRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Telefono GetById(@PathVariable Long id){
        return telefonoRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Telefono telefono){
        telefonoRepository.create(telefono);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Telefono telefono) {
        telefonoRepository.update(id, telefono);
    }

    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Long id){
        telefonoRepository.delete(id);
    }
}
