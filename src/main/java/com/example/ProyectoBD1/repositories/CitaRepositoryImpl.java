package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.CitaDao;
import com.example.ProyectoBD1.models.entities.Cita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaRepositoryImpl implements CitaRepository {

    @Autowired
    CitaDao citaDao;

    @Override
    public List<Cita> findAll() {
        return (List<Cita>) citaDao.findAll();
    }

    @Override
    public Cita findById(Long id) {
        return citaDao.findById(id).orElse(null);
    }

    @Override
    public void create(Cita cita) {
        citaDao.save(cita);
    }

    @Override
    public void update(Long id, Cita cita) {
        if (citaDao.existsById(id)) {
            cita.setNumeroCita(id);
            citaDao.save(cita);
        }
    }

    @Override
    public void delete(Long id) {
        if (citaDao.existsById(id)) {
            citaDao.deleteById(id);
        }
    }
}
