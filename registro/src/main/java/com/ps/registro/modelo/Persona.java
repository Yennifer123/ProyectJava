package com.ps.registro.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Table
@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="identificacion", nullable=false, length=10)
    private String identificacion;

    @Column(name="nombres", nullable=false, length=100)
    private String nombres;

    @Column(name="apellidos", nullable=false, length=100)
    private String apellidos;

    @Column(name="fechaNacimiento", nullable=false)
    private Date fechaNacimiento;

    @Column(name="telefono", length=20)
    private String telefono;

    @Column(name="correo", length=100)
    private String correo;
}