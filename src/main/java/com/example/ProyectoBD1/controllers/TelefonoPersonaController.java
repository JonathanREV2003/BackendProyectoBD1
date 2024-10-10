package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.TelefonoPersona;
import com.example.ProyectoBD1.repositories.TelefonoPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/telefonopersona")
public class TelefonoPersonaController {
    @Autowired
    TelefonoPersonaRepository telefonoPersonaRepository;

    @GetMapping
    public List<TelefonoPersona> GetAll(){
        return telefonoPersonaRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public TelefonoPersona GetById(@PathVariable Long id){
        return telefonoPersonaRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody TelefonoPersona telefonoPersona){
        telefonoPersonaRepository.create(telefonoPersona);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody TelefonoPersona telefonoPersona) {
        telefonoPersonaRepository.update(id, telefonoPersona);
    }
}
