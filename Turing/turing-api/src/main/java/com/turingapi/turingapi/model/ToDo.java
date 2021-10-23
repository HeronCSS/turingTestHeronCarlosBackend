package com.turingapi.turingapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nomeTarefa;

    @Column
    private String descricao;

    @Column(nullable = false)
    private String status;




    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ToDo id(Long id) {
        setId(id);
        return this;
    }

    public String getNomeTarefa() {
        return this.nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public ToDo nomeTarefa(String nomeTarefa) {
        setNomeTarefa(nomeTarefa);
        return this;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ToDo descricao(String descricao) {
        setDescricao(descricao);
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ToDo status(String status) {
        setStatus(status);
        return this;
    }
    

}
