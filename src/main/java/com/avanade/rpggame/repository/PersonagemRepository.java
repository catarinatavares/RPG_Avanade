package com.avanade.rpggame.repository;

import com.avanade.rpggame.model.Personagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem, Long> {
}
