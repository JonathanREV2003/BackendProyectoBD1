package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.*;
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
