package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Raza;

import java.util.List;

public interface RazaRepository {
    public List<Raza> findAll();
    public Raza findById(Long Id);
    public void create(Raza raza);
    public void update(Long id, Raza raza);
    public void delete(Long id);
}
