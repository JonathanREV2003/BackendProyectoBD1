package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Especie")
@Getter
@Setter
public class Especie {
    @Id
    @Column(name = "CodigoEspecie", nullable = false)
    private Short codigoEspecie;

    @Column(name = "Descripcion", length = 256)
    private String descripcion;
}
