package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DetalleDiagnostico")
@Getter
@Setter
public class DetalleDiagnostico {
    @Id
    @Column(name = "Correlativo", nullable = false)
    private Integer correlativo;

    @Column(name = "NumeroCita", nullable = false)
    private Integer numeroCita;

    @Column(name = "NumeroFicha", nullable = false)
    private Integer numeroFicha;

    @Column(name = "CodigoDiagnostico", nullable = false)
    private Short codigoDiagnostico;

    @Column(name = "CodigoSucursal", nullable = false)
    private Short codigoSucursal;
}