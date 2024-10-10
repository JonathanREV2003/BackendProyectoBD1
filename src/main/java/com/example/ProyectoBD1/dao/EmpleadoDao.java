package com.example.ProyectoBD1.dao;

import com.example.ProyectoBD1.models.entities.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDao extends CrudRepository<Empleado, Integer> {
}