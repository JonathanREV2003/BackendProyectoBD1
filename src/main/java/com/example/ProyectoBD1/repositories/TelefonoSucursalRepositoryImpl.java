package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.TelefonoSucursalDao;
import com.example.ProyectoBD1.models.entities.TelefonoSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoSucursalRepositoryImpl implements TelefonoSucursalRepository{
    @Autowired
    TelefonoSucursalDao telefonoSucursalDao;

    @Override
    public List<TelefonoSucursal> findAll() {
        return (List<TelefonoSucursal>) telefonoSucursalDao.findAll();
    }

    @Override
    public TelefonoSucursal findById(Long id) {
        return telefonoSucursalDao.findById(id).orElse(null);
    }

    @Override
    public void create(TelefonoSucursal telefonoSucursal) {
        telefonoSucursalDao.save(telefonoSucursal);
    }

    @Override
    public void update(Long id, TelefonoSucursal telefonoSucursal) {
        if(telefonoSucursalDao.existsById(id)){
            telefonoSucursal.setCorrelativoTel(id);
            telefonoSucursalDao.save(telefonoSucursal);
        }
    }


}
