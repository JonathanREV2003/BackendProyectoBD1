package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Cita")
@Getter
@Setter
public class Cita {
    @Id
    @Column(name = "NumeroCita", nullable = false)
    private Long numeroCita;

    @Column(name = "CodigoSucursal", nullable = false)
    private Short codigoSucursal;

    @Column(name = "FechaCita")
    private LocalDateTime fechaCita;

    @Column(name = "Observaciones", length = 512)
    private String observaciones;

    @Column(name = "CodigoEmpleado")
    private Integer codigoEmpleado;

    @Column(name = "TipoCita", length = 1)
    private String tipoCita;

    @Column(name = "CodigoCliente", length = 10)
    private Integer codigoCliente;
}