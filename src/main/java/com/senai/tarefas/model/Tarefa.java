package com.senai.tarefas.model;

import java.time.LocalDate;

public class Tarefa {
    
    private Integer id;

    private String descricao;

    private LocalDate dataEntrega;

    private LocalDate dataInicio;

    private String responsavel;

    private Status status;

    private Prioridade prioridade;

    
    public Tarefa() { }

    public Tarefa(String descricao, LocalDate dataEntrega, LocalDate dataInicio, String responsavel, 
            Prioridade prioridade) {
        this(descricao, dataEntrega, dataInicio, responsavel, null, prioridade);
    }

    public Tarefa(String descricao, LocalDate dataEntrega, LocalDate dataInicio, String responsavel, 
            Status status, Prioridade prioridade) {
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.dataInicio = dataInicio;
        this.responsavel = responsavel;
        this.status = status;
        this.prioridade = prioridade;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }


}
