package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.SucursalDao;
import com.example.ProyectoBD1.models.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalRepositoryImpl implements SucursalRepository{

    @Autowired
    SucursalDao sucursalDao;

    @Override
    public List<Sucursal> findAll() {
        return (List<Sucursal>) sucursalDao.findAll();
    }

    @Override
    public Sucursal findById(Long Id) {
        return sucursalDao.findById(Id).orElse(null);
    }

    @Override
    public void create(Sucursal sucursal) {
        sucursalDao.save(sucursal);
    }

    @Override
    public void update(Long id, Sucursal sucursal) {
        if(sucursalDao.existsById(id)){
            sucursal.setCodigoSucursal(id);
            sucursalDao.save(sucursal);
        }
    }

    @Override
    public void delete(Long id) {
        sucursalDao.deleteById(id);
    }
}
