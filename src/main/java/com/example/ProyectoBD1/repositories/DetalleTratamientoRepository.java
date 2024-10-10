package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.DetalleTratamiento;

import java.util.List;

public interface DetalleTratamientoRepository {
    List<DetalleTratamiento> findAll();
    DetalleTratamiento findById(Integer id);
    void create(DetalleTratamiento detalleTratamiento);
    void update(Integer id, DetalleTratamiento detalleTratamiento);
    void delete(Integer id);
}

