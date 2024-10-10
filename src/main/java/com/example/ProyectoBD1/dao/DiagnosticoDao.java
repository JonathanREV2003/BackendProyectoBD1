package com.example.ProyectoBD1.dao;

import com.example.ProyectoBD1.models.entities.Diagnostico;
import org.springframework.data.repository.CrudRepository;

public interface DiagnosticoDao extends CrudRepository<Diagnostico, Short> {
}
