package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Cliente;
import java.util.List;

public interface ClienteRepository {
    List<Cliente> findAll();
    Cliente findById(String id);
    void create(Cliente cliente);
    void update(String id, Cliente cliente);
    void delete(String id);
}
