package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Cita;
import java.util.List;

public interface CitaRepository {
    List<Cita> findAll();
    Cita findById(Long id);
    void create(Cita cita);
    void update(Long id, Cita cita);
    void delete(Long id);
}