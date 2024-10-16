package com.example.ProyectoBD1.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Cliente")
@Getter
@Setter
public class Cliente {
    @Id
    @Column(name = "CodigoCliente", length = 10, nullable = false)
    private String codigoCliente;

    @Column(name = "CodigoPersona", nullable = false)
    private Integer codigoPersona;
}
