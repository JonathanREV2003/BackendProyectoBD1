package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Diagnostico")
@Getter
@Setter
public class Diagnostico {
    @Id
    @Column(name = "CodigoDiagnostico", nullable = false)
    private Short codigoDiagnostico;

    @Column(name = "Descripcion", length = 256)
    private String descripcion;
}
