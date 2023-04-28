package com.avanade.rpggame.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personagem")
@Getter
@Setter
public class Personagem {

    @Id
    @Column(name="ID_PERSONAGEM")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @JoinColumn(name="TIPO_PERSONAGEM")
    @ManyToOne
    private TipoPersonagem tipoPersonagem;
    @Column(name="VIDA")
    private Integer vida;
    @Column(name="FORCA")
    private Integer forca;
    @Column(name="DEFESA")
    private Integer defesa;
    @Column(name="AGILIDADE")
    private Integer agilidade;
    @Column(name="QTD_DADOS")
    private Integer qtdDados;
    @Column(name="QTD_FACES_DADO")
    private Integer qtdFacesDado;

}

