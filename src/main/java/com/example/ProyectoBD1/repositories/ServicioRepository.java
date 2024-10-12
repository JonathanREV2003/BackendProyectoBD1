package com.example.ProyectoBD1.repositories;



import com.example.ProyectoBD1.models.entities.Servicio;

import java.util.List;

public interface ServicioRepository {
    public List<Servicio> findAll();
    public Servicio findById(Long Id);
    public void create(Servicio servicio);
}
