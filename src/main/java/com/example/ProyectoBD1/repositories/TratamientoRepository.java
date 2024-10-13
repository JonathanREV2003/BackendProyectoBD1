package com.example.ProyectoBD1.repositories;


import com.example.ProyectoBD1.models.entities.Tratamiento;

import java.util.List;

public interface TratamientoRepository {
    public List<Tratamiento> findAll();
    public Tratamiento findById(Long id);
    public void create (Tratamiento tratamiento);
}
