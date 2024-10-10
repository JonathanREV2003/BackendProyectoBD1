package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.EmpleadoDao;
import com.example.ProyectoBD1.models.entities.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    @Autowired
    EmpleadoDao empleadoDao;

    @Override
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    public Empleado findById(Integer id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    public void create(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    public void update(Integer id, Empleado empleado) {
        if (empleadoDao.existsById(id)) {
            empleado.setCodigoEmpleado(id);
            empleadoDao.save(empleado);
        }
    }

    @Override
    public void delete(Integer id) {
        if (empleadoDao.existsById(id)) {
            empleadoDao.deleteById(id);
        }
    }
}

