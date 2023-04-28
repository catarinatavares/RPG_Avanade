package com.avanade.rpggame.model.enuns;

public enum TipoHeroi {

    Guerreiro(1L), Bárbaro(2L), Cavaleiro(3L);
    private Long id;

    TipoHeroi(Long id){
        this.id = id;
    }
}
