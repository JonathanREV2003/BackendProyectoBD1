package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.EspecieDao;
import com.example.ProyectoBD1.models.entities.Especie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EspecieRepositoryImpl implements EspecieRepository {

    @Autowired
    EspecieDao especieDao;

    @Override
    public List<Especie> findAll() {
        return (List<Especie>) especieDao.findAll();
    }

    @Override
    public Especie findById(Short id) {
        return especieDao.findById(id).orElse(null);
    }

    @Override
    public void create(Especie especie) {
        especieDao.save(especie);
    }

    @Override
    public void update(Short id, Especie especie) {
        if (especieDao.existsById(id)) {
            especie.setCodigoEspecie(id);
            especieDao.save(especie);
        }
    }

    @Override
    public void delete(Short id) {
        if (especieDao.existsById(id)) {
            especieDao.deleteById(id);
        }
    }
}
