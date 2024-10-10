package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.FichaMascota;

import java.util.List;

public interface FichaMascotaRepository {
    List<FichaMascota> findAll();
    FichaMascota findById(Integer id);
    void create(FichaMascota fichaMascota);
    void update(Integer id, FichaMascota fichaMascota);
    void delete(Integer id);
}
