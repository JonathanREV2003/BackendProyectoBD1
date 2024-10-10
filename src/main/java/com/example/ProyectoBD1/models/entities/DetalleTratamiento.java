package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DetalleDeTratamiento")
@Getter
@Setter
public class DetalleTratamiento {
    @Id
    @Column(name = "Correlativo", nullable = false)
    private Integer correlativo;

    @Column(name = "NumeroCita", nullable = false)
    private Integer numeroCita;

    @Column(name = "NumeroFicha", nullable = false)
    private Integer numeroFicha;

    @Column(name = "CodigoDiagnostico", nullable = false)
    private Short codigoDiagnostico;

    @Column(name = "CodigoTratamiento", nullable = false)
    private Short codigoTratamiento;

    @Column(name = "CodigoSucursal", nullable = false)
    private Short codigoSucursal;
}
