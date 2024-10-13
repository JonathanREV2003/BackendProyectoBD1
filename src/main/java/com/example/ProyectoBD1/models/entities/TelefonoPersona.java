package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TelefonoPersona")
@Getter
@Setter
public class TelefonoPersona {
    @Id
    @Column(name = "CorrelativoTelefono",nullable = false)
    private Long correlativoTel;

    @Column(name = "CodigoPersona",nullable = false)
    private Long codigoPersona;
}
