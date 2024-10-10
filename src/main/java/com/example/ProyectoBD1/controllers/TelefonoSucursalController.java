package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.TelefonoSucursal;
import com.example.ProyectoBD1.repositories.TelefonoSucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/telefonosucursal")
public class TelefonoSucursalController {
    @Autowired
    TelefonoSucursalRepository telefonoSucursalRepository;

    @GetMapping
    public List<TelefonoSucursal> GetAll(){
        return telefonoSucursalRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public TelefonoSucursal GetById(@PathVariable Long id){
        return telefonoSucursalRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody TelefonoSucursal telefonoSucursal){
        telefonoSucursalRepository.create(telefonoSucursal);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody TelefonoSucursal telefonoSucursal) {
        telefonoSucursalRepository.update(id, telefonoSucursal);
    }


}
