package com.senai.tarefas.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.senai.tarefas.model.Status;
import com.senai.tarefas.model.Tarefa;

@Repository
public class TarefaRepository {
    
    // Simula uma colecao de dados do banco de dados
    private List<Tarefa> lista = new ArrayList<>(); 

    private int geradorDeId = 1;

    
    public List<Tarefa> consultar() {
        return lista;
    }

    public Tarefa adicionar(Tarefa tarefa) {
        tarefa.setId(geradorDeId++);
        tarefa.setStatus(Status.PENDENTE);
        lista.add(tarefa);
        return tarefa;
    }

    public Optional<Tarefa> obter(Integer id) {
        for (var tarefa : lista) {
            if (tarefa.getId().intValue() == id.intValue())
                return Optional.of(tarefa);
        }
        return Optional.empty();
    }

    public void atualizar(Tarefa atualizada) {
        List<Tarefa> nova = new ArrayList<>();
        for (var tarefa : lista) {
            if (tarefa.getId().intValue() == atualizada.getId().intValue())
                nova.add(atualizada);
            else
                nova.add(tarefa);
        }
        this.lista = nova;
        // mesma coisa que:
        // lista.removeIf(t -> t.getId().intValue() == atualizada.getId().intValue());
        // lista.add(atualizada);
    }

    public void excluir(Tarefa tarefaExcluida) {
        // lista.removeIf(t -> t.getId().intValue() == tarefaExcluida.getId().intValue());
        List<Tarefa> nova = new ArrayList<>();
        for (var tarefa : lista) {
            if (tarefa.getId().intValue() == tarefaExcluida.getId().intValue())
                continue;
            nova.add(tarefa);
        }
        this.lista = nova;
    }

}
