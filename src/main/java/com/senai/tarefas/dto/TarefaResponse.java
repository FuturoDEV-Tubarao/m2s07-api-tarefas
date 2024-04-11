package com.senai.tarefas.dto;

import java.time.LocalDate;

import com.senai.tarefas.model.Prioridade;
import com.senai.tarefas.model.Status;
import com.senai.tarefas.model.Tarefa;

public class TarefaResponse {
    
    private Integer id;

    private String descricao;

    private LocalDate dataEntrega;

    private LocalDate dataInicio;

    private String responsavel;

    private Status status;

    private Prioridade prioridade;


    public TarefaResponse() { }

    public TarefaResponse(Tarefa tarefa) {
        this.id = tarefa.getId();
        this.descricao = tarefa.getDescricao();
        this.dataEntrega = tarefa.getDataEntrega();
        this.dataInicio = tarefa.getDataInicio();
        this.responsavel = tarefa.getResponsavel();
        this.status = tarefa.getStatus();
        this.prioridade = tarefa.getPrioridade();
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
