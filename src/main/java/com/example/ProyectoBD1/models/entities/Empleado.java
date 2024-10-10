package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Empleado")
@Getter
@Setter
public class Empleado {
    @Id
    @Column(name = "CodigoEmpleado", nullable = false)
    private Integer codigoEmpleado;

    @Column(name = "CodigoPersona", nullable = false)
    private Integer codigoPersona;

    @Column(name = "CodigoPuesto")
    private Short codigoPuesto;
}