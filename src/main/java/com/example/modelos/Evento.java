package com.example.modelos;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

    public static final long serialVersionId= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cogido" , unique = true)
    private long codigo;
    @Column(name = "nome" , nullable = false)
    private String nome;
    @Column(name = "sobrenome" , nullable = false)
    private String sobreNome;
}
