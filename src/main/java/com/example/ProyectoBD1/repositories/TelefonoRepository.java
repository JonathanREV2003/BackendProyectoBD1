package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Telefono;

import java.util.List;

public interface TelefonoRepository {
    public List<Telefono> findAll();
    public Telefono findById(Long id);
    public void create(Telefono telefono);
    public void update(Long id, Telefono telefono);
    public void delete(Long id);
}
