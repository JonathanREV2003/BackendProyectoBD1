package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Sucursal")
@Getter
@Setter
public class Sucursal {
    @Id
    @Column(name = "CodigoSucursal",nullable = false)
    private Long codigoSucursal;

    @Column(name = "NombreSucursal",nullable = false)
    private String nombreSucursal;

    @Column(name = "Direccion",nullable = false)
    private String direccion;
}
