package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.ServicioDao;
import com.example.ProyectoBD1.models.entities.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioRepositoryImpl implements ServicioRepository{
    @Autowired
    ServicioDao servicioDao;
    @Override
    public List<Servicio> findAll() {
        return (List<Servicio>) servicioDao.findAll();
    }

    @Override
    public Servicio findById(Long Id) {
        return servicioDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Servicio servicio) {
        servicioDao.save(servicio);
    }
}
