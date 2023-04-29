package com.ps.registro.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Registro")
public class Registro {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="registro", nullable=false)
    private Date registro;

    @ManyToOne
    @JoinColumn(name="persona_id", referencedColumnName="id", nullable=false)
    private Persona persona_id;

}
