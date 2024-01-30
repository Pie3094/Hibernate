package com.example.Hibernate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {

    @GetMapping(path = "/nome")
    public String getNome(@PathVariable String nome){
        return "ciao il mio nome è " + nome;
    }
}
