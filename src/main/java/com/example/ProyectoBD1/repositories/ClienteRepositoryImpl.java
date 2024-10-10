package com.example.ProyectoBD1.repositories;

import com.example.ProyectoBD1.dao.ClienteDao;
import com.example.ProyectoBD1.models.entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    ClienteDao clienteDao;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    public Cliente findById(String id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void create(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    public void update(String id, Cliente cliente) {
        if (clienteDao.existsById(id)) {
            cliente.setCodigoCliente(id);
            clienteDao.save(cliente);
        }
    }

    @Override
    public void delete(String id) {
        if (clienteDao.existsById(id)) {
            clienteDao.deleteById(id);
        }
    }
}