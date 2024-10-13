package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.TelefonoPersonaDao;
import com.example.ProyectoBD1.models.entities.TelefonoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoPersonaRepositoryImpl implements TelefonoPersonaRepository{
    @Autowired
    TelefonoPersonaDao telefonoPersonaDao;

    @Override
    public List<TelefonoPersona> findAll() {
        return (List<TelefonoPersona>) telefonoPersonaDao.findAll();
    }

    @Override
    public TelefonoPersona findById(Long id) {
        return telefonoPersonaDao.findById(id).orElse(null);
    }

    @Override
    public void create(TelefonoPersona telefonoPersona) {
        telefonoPersonaDao.save(telefonoPersona);
    }

    @Override
    public void update(Long id, TelefonoPersona telefonoPersona) {
        if(telefonoPersonaDao.existsById(id)){
            telefonoPersona.setCorrelativoTel(id);
            telefonoPersonaDao.save(telefonoPersona);
        }
    }
}
