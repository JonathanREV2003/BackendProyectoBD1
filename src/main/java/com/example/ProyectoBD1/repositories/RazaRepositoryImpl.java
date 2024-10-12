package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.RazaDao;
import com.example.ProyectoBD1.models.entities.Raza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RazaRepositoryImpl implements RazaRepository{

    @Autowired
    RazaDao razadao;

    @Override
    public List<Raza> findAll() {
        return (List<Raza>) razadao.findAll();
    }

    @Override
    public Raza findById(Long Id) {
        return razadao.findById(Id).orElse(null);
    }

    @Override
    public void create(Raza raza) {
        razadao.save(raza);
    }

    @Override
    public void update(Long id, Raza raza) {
        if(razadao.existsById(id)){
            raza.setCodigoRaza(id);
            razadao.save(raza);
        }
    }

    @Override
    public void delete(Long id) {
        razadao.deleteById(id);
    }
}
