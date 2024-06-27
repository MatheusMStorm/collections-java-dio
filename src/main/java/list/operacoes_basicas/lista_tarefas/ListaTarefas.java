package list.operacoes_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    // O construtor não receberá parâmetros, e iremos gerar um novo ArrayList
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    // Função add: adiciona um objeto
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Função removeAll: remove uma lista de objetos
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Função size: tamanho da lista
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
