package com.turingapi.turingapi.repository;

import com.turingapi.turingapi.model.AgendaTelefonica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioAgenda extends JpaRepository<AgendaTelefonica, Long> {
    
}