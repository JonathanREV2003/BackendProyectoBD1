package com.example.ProyectoBD1.dao;

import com.example.ProyectoBD1.models.entities.Especie;
import org.springframework.data.repository.CrudRepository;

public interface EspecieDao extends CrudRepository<Especie, Short> {
}
