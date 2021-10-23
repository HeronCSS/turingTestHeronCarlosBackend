package com.turingapi.turingapi.controller;

import java.util.List;

import com.turingapi.turingapi.model.ToDo;
import com.turingapi.turingapi.repository.RepositorioToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/toDo")
public class ToDoController {

    @Autowired
    private RepositorioToDo repositorioToDo;

    @GetMapping(value="/tarefas")
    public List<ToDo> listarTarefas(){
        return repositorioToDo.findAll();
    }

    @PostMapping(value="/adicionartarefa")
    public ToDo cadastrarTarefa(@RequestBody ToDo todo){
        return repositorioToDo.save(todo);
    }

    @DeleteMapping(value="/excluirtarefa")
    public void apagarTarefa(@RequestBody ToDo todo){
        repositorioToDo.delete(todo);
    }
    
    @PutMapping(value="/atualizartarefa")
    public ToDo alterar(@RequestBody ToDo todo){
        return repositorioToDo.save(todo);
    }
}
