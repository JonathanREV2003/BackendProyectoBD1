package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Persona;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonaRepository  {
    public List<Persona> findAll();
    public Persona findById(Long Id);

    //CRUD OPERATIONS
    public void create(Persona persona);
    public void update(Long id,Persona persona);
    public void delate(Long id);
}
