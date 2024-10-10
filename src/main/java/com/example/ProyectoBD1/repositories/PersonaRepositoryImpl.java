package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.PersonaDao;
import com.example.ProyectoBD1.models.entities.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaRepositoryImpl implements PersonaRepository{

    @Autowired
    PersonaDao personaDao;

    @Override
    public List<Persona> findAll() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    public Persona findById(Long Id) {
        return personaDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    public void update(Long id, Persona persona) {
        if (personaDao.existsById(id)) {
            persona.setCodigoPersona(id);
            personaDao.save(persona);
        }
    }

    @Override
    public void delate(Long id) {
        if (personaDao.existsById(id)){
            personaDao.deleteById(id);
        }
    }
}
