package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.DetalleDiagnostico;
import java.util.List;

public interface DetalleDiagnosticoRepository {
    List<DetalleDiagnostico> findAll();
    DetalleDiagnostico findById(Integer id);
    void create(DetalleDiagnostico detalleDiagnostico);
    void update(Integer id, DetalleDiagnostico detalleDiagnostico);
    void delete(Integer id);
}
