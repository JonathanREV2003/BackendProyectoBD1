package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.Empleado;
import java.util.List;

public interface EmpleadoRepository {
    List<Empleado> findAll();
    Empleado findById(Integer id);
    void create(Empleado empleado);
    void update(Integer id, Empleado empleado);
    void delete(Integer id);
}
