package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.FichaMascotaDao;
import com.example.ProyectoBD1.models.entities.FichaMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FichaMascotaRepositoryImpl implements FichaMascotaRepository {

    @Autowired
    FichaMascotaDao fichaMascotaDao;

    @Override
    public List<FichaMascota> findAll() {
        return (List<FichaMascota>) fichaMascotaDao.findAll();
    }

    @Override
    public FichaMascota findById(Integer id) {
        return fichaMascotaDao.findById(id).orElse(null);
    }

    @Override
    public void create(FichaMascota fichaMascota) {
        fichaMascotaDao.save(fichaMascota);
    }

    @Override
    public void update(Integer id, FichaMascota fichaMascota) {
        if (fichaMascotaDao.existsById(id)) {
            fichaMascota.setNumeroFicha(id);
            fichaMascotaDao.save(fichaMascota);
        }
    }

    @Override
    public void delete(Integer id) {
        if (fichaMascotaDao.existsById(id)) {
            fichaMascotaDao.deleteById(id);
        }
    }
}