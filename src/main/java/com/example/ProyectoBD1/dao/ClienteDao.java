package com.example.ProyectoBD1.dao;

import com.example.ProyectoBD1.models.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, String> {
}