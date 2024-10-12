package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Puesto")
@Getter
@Setter
public class Puesto {
    @Id
    @Column(name = "CodigoPuesto",nullable = false)
    private Long codigoPuesto;

    @Column(name = "Descripcion")
    private String descripcion;
}
