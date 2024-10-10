package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.TelefonoPersona;

import java.util.List;

public interface TelefonoPersonaRepository {
    public List<TelefonoPersona> findAll();
    public TelefonoPersona findById(Long id);
    public void create (TelefonoPersona telefonoPersona);
    public void update (Long id, TelefonoPersona telefonoPersona);

}
