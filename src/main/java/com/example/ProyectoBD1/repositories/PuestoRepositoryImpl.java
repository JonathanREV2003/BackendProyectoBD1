package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.PuestoDao;
import com.example.ProyectoBD1.models.entities.Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuestoRepositoryImpl implements PuestoRepository{

    @Autowired
    PuestoDao puestoDao;

    @Override
    public List<Puesto> findAll(){ return (List<Puesto>) puestoDao.findAll();}

    @Override
    public Puesto findById(Long Id) {
        return puestoDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Puesto puesto) {
        puestoDao.save(puesto);
    }

    @Override
    public void update(Long id, Puesto puesto) {
        if(puestoDao.existsById(id)){
            puesto.setCodigoPuesto(id);
            puestoDao.save(puesto);
        }
    }

    @Override
    public void delete(Long id) {
        puestoDao.deleteById(id);
    }
}
