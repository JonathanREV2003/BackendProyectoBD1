package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.models.entities.TelefonoSucursal;

import java.util.List;

public interface TelefonoSucursalRepository {
    public List<TelefonoSucursal> findAll();
    public TelefonoSucursal findById(Long id);
    public void create (TelefonoSucursal telefonoSucursal);
    public void update (Long id, TelefonoSucursal telefonoSucursal);
}
