package com.turingapi.turingapi.repository;

import com.turingapi.turingapi.model.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioToDo extends JpaRepository<ToDo, String>{
    
}
