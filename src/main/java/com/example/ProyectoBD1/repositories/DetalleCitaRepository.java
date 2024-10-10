package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.DetalleCita;
import java.util.List;

public interface DetalleCitaRepository {
    List<DetalleCita> findAll();
    DetalleCita findById(Integer id);
    void create(DetalleCita detalleCita);
    void update(Integer id, DetalleCita detalleCita);
    void delete(Integer id);
}
