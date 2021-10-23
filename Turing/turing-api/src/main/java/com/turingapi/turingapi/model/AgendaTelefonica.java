package com.turingapi.turingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





/**
 * AgendaTelefonica
 */

 
 @Entity
public class AgendaTelefonica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String telefone;

    public AgendaTelefonica(Long id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.nome = telefone;
    }

    public AgendaTelefonica(){

    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AgendaTelefonica id(long id) {
        setId(id);
        return this;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AgendaTelefonica nome(String nome) {
        setNome(nome);
        return this;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AgendaTelefonica telefone(String telefone) {
        setTelefone(telefone);
        return this;
    }
    
}


