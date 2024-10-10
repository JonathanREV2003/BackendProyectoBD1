package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "DetalleCita")
@Getter
@Setter
public class DetalleCita {
    @Id
    @Column(name = "Correlativo", nullable = false)
    private Integer correlativo;

    @Column(name = "NumeroCita", nullable = false)
    private Integer numeroCita;

    @Column(name = "NumeroFicha", nullable = false)
    private Integer numeroFicha;

    @Column(name = "CodigoServicio")
    private Short codigoServicio;

    @Column(name = "Inicio")
    private LocalDateTime inicio;

    @Column(name = "Fin")
    private LocalDateTime fin;

    @Column(name = "CodigoEmpleado")
    private Integer codigoEmpleado;

    @Column(name = "CodigoSucursal", nullable = false)
    private Short codigoSucursal;
}