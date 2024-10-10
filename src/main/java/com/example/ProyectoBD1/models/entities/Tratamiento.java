package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Tratamiento")
@Getter
@Setter
public class Tratamiento {
    @Id
    @Column(name = "CodigoTratamiento",nullable = false)
    private Long codigoTratamiento;

    @Column(name = "Descripcion")
    private String descripcion;
}
