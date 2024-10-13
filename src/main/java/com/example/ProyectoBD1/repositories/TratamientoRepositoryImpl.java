package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.TratamientoDao;
import com.example.ProyectoBD1.models.entities.TelefonoSucursal;
import com.example.ProyectoBD1.models.entities.Tratamiento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TratamientoRepositoryImpl implements TratamientoRepository{
    TratamientoDao tratamientoDao;

    @Override
    public List<Tratamiento> findAll() {
        return (List<Tratamiento>) tratamientoDao.findAll();
    }

    @Override
    public Tratamiento findById(Long id) {
        return tratamientoDao.findById(id).orElse(null);
    }

    @Override
    public void create(Tratamiento tratamiento) {
        tratamientoDao.save(tratamiento);
    }
}
