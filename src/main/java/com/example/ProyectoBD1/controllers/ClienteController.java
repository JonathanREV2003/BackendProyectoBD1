package com.example.ProyectoBD1.controllers;

import com.example.ProyectoBD1.models.entities.Cliente;
import com.example.ProyectoBD1.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:8080/")
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getById(@PathVariable String id) {
        return clienteRepository.findById(id);
    }

    @PostMapping(consumes = "application/json")
    public void create(@RequestBody Cliente cliente) {
        clienteRepository.create(cliente);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody Cliente cliente) {
        clienteRepository.update(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        clienteRepository.delete(id);
    }
}
