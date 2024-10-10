package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Diagnostico;

import java.util.List;

public interface DiagnosticoRepository {
    List<Diagnostico> findAll();
    Diagnostico findById(Short id);
    void create(Diagnostico diagnostico);
    void update(Short id, Diagnostico diagnostico);
    void delete(Short id);
}
