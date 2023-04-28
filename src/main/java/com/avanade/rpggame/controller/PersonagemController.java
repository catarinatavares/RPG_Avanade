package com.avanade.rpggame.controller;

import com.avanade.rpggame.service.PersonagemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Api(value = "Api RPG")
@Controller("/personagens")
public class PersonagemController {

    @Autowired
    PersonagemService personagemService;

    @ApiOperation(value = "Retorna uma lista de personagens")
    @GetMapping
    public ResponseEntity findAll(){
        return new ResponseEntity<>( personagemService.findAll(), HttpStatus.OK );
    }
}
