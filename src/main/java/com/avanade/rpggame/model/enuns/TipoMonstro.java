package com.avanade.rpggame.model.enuns;

public enum TipoMonstro {

    Orc(1L), Gigante(2L), Lobisomen(3L);
    private Long id;

    TipoMonstro(Long id){
        this.id = id;
    }
}
