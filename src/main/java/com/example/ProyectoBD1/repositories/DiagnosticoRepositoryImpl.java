package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.DiagnosticoDao;
import com.example.ProyectoBD1.models.entities.Diagnostico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticoRepositoryImpl implements DiagnosticoRepository {

    @Autowired
    DiagnosticoDao diagnosticoDao;

    @Override
    public List<Diagnostico> findAll() {
        return (List<Diagnostico>) diagnosticoDao.findAll();
    }

    @Override
    public Diagnostico findById(Short id) {
        return diagnosticoDao.findById(id).orElse(null);
    }

    @Override
    public void create(Diagnostico diagnostico) {
        diagnosticoDao.save(diagnostico);
    }

    @Override
    public void update(Short id, Diagnostico diagnostico) {
        if (diagnosticoDao.existsById(id)) {
            diagnostico.setCodigoDiagnostico(id);
            diagnosticoDao.save(diagnostico);
        }
    }

    @Override
    public void delete(Short id) {
        if (diagnosticoDao.existsById(id)) {
            diagnosticoDao.deleteById(id);
        }
    }
}
