package com.turingapi.turingapi.controller;

import java.util.List;

import com.turingapi.turingapi.model.AgendaTelefonica;
import com.turingapi.turingapi.repository.RepositorioAgenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    private RepositorioAgenda repositorioAgenda;

    @GetMapping(value = "/consultar")
    public List<AgendaTelefonica> agenda() {
        return repositorioAgenda.findAll();
    }

    @PostMapping(value = "/cadastrar")
    public AgendaTelefonica adicionar(@RequestBody AgendaTelefonica agenda) {
        return repositorioAgenda.save(agenda);
    }

    @DeleteMapping(value = "/apagar")
    public void apagar(@RequestBody AgendaTelefonica agenda) {
        repositorioAgenda.delete(agenda);
    }

    @PutMapping(value = "/alterar")
    public AgendaTelefonica alterar(@RequestBody AgendaTelefonica agenda) {
        return repositorioAgenda.save(agenda);
    }

}
