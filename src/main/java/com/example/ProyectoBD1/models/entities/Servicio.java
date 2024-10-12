package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Servicio")
@Getter
@Setter
public class Servicio {
    @Id
    @Column(name = "CodigoServicio",nullable = false)
    private Long codigoServicio;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Tipo")
    private int tipo;

    @Column(name = "Precio")
    private float precio;
}
