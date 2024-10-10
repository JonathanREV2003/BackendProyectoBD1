package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Especie;

import java.util.List;

public interface EspecieRepository {
    List<Especie> findAll();
    Especie findById(Short id);
    void create(Especie especie);
    void update(Short id, Especie especie);
    void delete(Short id);
}