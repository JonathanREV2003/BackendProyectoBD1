package com.example.ProyectoBD1.models.entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Persona")
@Getter
@Setter
public class Persona {

    @Id
    @Column(name = "CodigoPersona",nullable = false) // nombre exacto de la columna en sql server
    private Long codigoPersona; // Es recomendable usar camelCase en el atributo

    @Column(name = "PrimerNombre")
    private String primerNombre;

    @Column(name = "SegundoNombre")
    private String segundoNombre;

    @Column(name = "TercerNombre")
    private String tercerNombre;

    @Column(name = "PrimerApellido")
    private String primerApellido;

    @Column(name = "SegundoApellido")
    private String segundoApellido;

    @Column(name = "TercerApellido")
    private String tercerApellido;

    @Column(name = "TipoPersona")
    private String tipoPersona;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "FechaNacimiento")
    private String fechaNacimiento;
}
