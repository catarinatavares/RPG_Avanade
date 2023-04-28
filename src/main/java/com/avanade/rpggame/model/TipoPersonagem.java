package com.avanade.rpggame.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name= "TIPO_PERSONAGEM")
@Getter
@Setter
@Entity
public class TipoPersonagem {
    @Id
    @Column(name="ID_TIPO_PERSONAGEM")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CATEGORIA")
    private String categoria;
}
