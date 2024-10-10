package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.DetalleTratamientoDao;
import com.example.ProyectoBD1.models.entities.DetalleTratamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetalleTratamientoRepositoryImpl implements DetalleTratamientoRepository {

    @Autowired
    DetalleTratamientoDao detalleTratamientoDao;

    @Override
    public List<DetalleTratamiento> findAll() {
        return (List<DetalleTratamiento>) detalleTratamientoDao.findAll();
    }

    @Override
    public DetalleTratamiento findById(Integer id) {
        return detalleTratamientoDao.findById(id).orElse(null);
    }

    @Override
    public void create(DetalleTratamiento detalleTratamiento) {
        detalleTratamientoDao.save(detalleTratamiento);
    }

    @Override
    public void update(Integer id, DetalleTratamiento detalleTratamiento) {
        if (detalleTratamientoDao.existsById(id)) {
            detalleTratamiento.setCorrelativo(id);
            detalleTratamientoDao.save(detalleTratamiento);
        }
    }

    @Override
    public void delete(Integer id) {
        if (detalleTratamientoDao.existsById(id)) {
            detalleTratamientoDao.deleteById(id);
        }
    }
}
