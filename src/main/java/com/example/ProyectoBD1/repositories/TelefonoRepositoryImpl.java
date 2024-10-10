package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.TelefonoDao;
import com.example.ProyectoBD1.models.entities.Telefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoRepositoryImpl implements TelefonoRepository{
    @Autowired
    TelefonoDao telefonoDao;


    @Override
    public List<Telefono> findAll() {
        return (List<Telefono>) telefonoDao.findAll();
    }

    @Override
    public Telefono findById(Long id) {
        return telefonoDao.findById(id).orElse(null);
    }

    @Override
    public void create(Telefono telefono) {
        telefonoDao.save(telefono);
    }

    @Override
    public void update(Long id, Telefono telefono) {
        if(telefonoDao.existsById(id)){
            telefono.setCorrelativoTel(id);
            telefonoDao.save(telefono);
        }
    }

    @Override
    public void delete(Long id) {
        telefonoDao.deleteById(id);
    }
}
