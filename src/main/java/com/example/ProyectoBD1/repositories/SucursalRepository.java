package com.example.ProyectoBD1.repositories;


import com.example.ProyectoBD1.models.entities.Sucursal;

import java.util.List;

public interface SucursalRepository {
    public List<Sucursal> findAll();
    public Sucursal findById(Long Id);
    public void create(Sucursal sucursal);
    public void update(Long id,Sucursal sucursal);
    public void delete(Long id);
}
