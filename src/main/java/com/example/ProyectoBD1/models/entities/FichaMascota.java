package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "FichaMascota")
@Getter
@Setter
public class FichaMascota {
    @Id
    @Column(name = "NumeroFicha", nullable = false)
    private Integer numeroFicha;

    @Column(name = "CodigoEspecie")
    private Short codigoEspecie;

    @Column(name = "CodigoRaza")
    private Short codigoRaza;

    @Column(name = "Nombre", length = 64)
    private String nombre;

    @Column(name = "FechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "Talla")
    private Short talla;
}
