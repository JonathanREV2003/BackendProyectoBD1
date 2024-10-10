package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.DetalleDiagnosticoDao;
import com.example.ProyectoBD1.models.entities.DetalleDiagnostico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleDiagnosticoRepositoryImpl implements DetalleDiagnosticoRepository {

    @Autowired
    DetalleDiagnosticoDao detalleDiagnosticoDao;

    @Override
    public List<DetalleDiagnostico> findAll() {
        return (List<DetalleDiagnostico>) detalleDiagnosticoDao.findAll();
    }

    @Override
    public DetalleDiagnostico findById(Integer id) {
        return detalleDiagnosticoDao.findById(id).orElse(null);
    }

    @Override
    public void create(DetalleDiagnostico detalleDiagnostico) {
        detalleDiagnosticoDao.save(detalleDiagnostico);
    }

    @Override
    public void update(Integer id, DetalleDiagnostico detalleDiagnostico) {
        if (detalleDiagnosticoDao.existsById(id)) {
            detalleDiagnostico.setCorrelativo(id);
            detalleDiagnosticoDao.save(detalleDiagnostico);
        }
    }

    @Override
    public void delete(Integer id) {
        if (detalleDiagnosticoDao.existsById(id)) {
            detalleDiagnosticoDao.deleteById(id);
        }
    }
}
