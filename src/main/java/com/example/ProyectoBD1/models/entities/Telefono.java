package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Telefono")
@Getter
@Setter
public class Telefono {
    @Id
    @Column(name = "CorrelativoTelefono",nullable = false)
    private Long correlativoTel;

    @Column(name = "NumeroTelefono")
    private String numero;
}
