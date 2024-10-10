package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.DetalleCitaDao;
import com.example.ProyectoBD1.models.entities.DetalleCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetalleCitaRepositoryImpl implements DetalleCitaRepository {

    @Autowired
    DetalleCitaDao detalleCitaDao;

    @Override
    public List<DetalleCita> findAll() {
        return (List<DetalleCita>) detalleCitaDao.findAll();
    }

    @Override
    public DetalleCita findById(Integer id) {
        return detalleCitaDao.findById(id).orElse(null);
    }

    @Override
    public void create(DetalleCita detalleCita) {
        detalleCitaDao.save(detalleCita);
    }

    @Override
    public void update(Integer id, DetalleCita detalleCita) {
        if (detalleCitaDao.existsById(id)) {
            detalleCita.setCorrelativo(id);
            detalleCitaDao.save(detalleCita);
        }
    }

    @Override
    public void delete(Integer id) {
        if (detalleCitaDao.existsById(id)) {
            detalleCitaDao.deleteById(id);
        }
    }
}
