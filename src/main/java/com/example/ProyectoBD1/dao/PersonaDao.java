package com.example.ProyectoBD1.dao;

import com.example.ProyectoBD1.models.entities.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona,Long> {

}
