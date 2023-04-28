package com.avanade.rpggame.service;

import com.avanade.rpggame.model.Personagem;
import com.avanade.rpggame.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    PersonagemRepository personagemRepository;

    public List<Personagem> findAll(){
        return (List<Personagem>) personagemRepository.findAll();
    }
}
