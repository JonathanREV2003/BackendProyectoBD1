package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Raza")
@Getter
@Setter
public class Raza {
    @Id
    @Column(name = "CodigoRaza",nullable = false)
    private Long codigoRaza;

    @Column(name = "Descripcion")
    private String descripcion;
}
