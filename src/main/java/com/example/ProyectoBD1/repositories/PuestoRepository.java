package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Puesto;

import java.util.List;

public interface PuestoRepository {
    public List<Puesto> findAll();
    public Puesto findById(Long Id);
    public void create(Puesto puesto);
    public void update(Long id, Puesto puesto);
    public void delete(Long id);

}
