package set.pesquisa.lista_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefas;

    public ListaTarefas() {
        this.setTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        setTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        setTarefas.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(setTarefas);
    }

    public int contarTarefas() {
        return setTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if (t.isFoiConcluido() == true) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : setTarefas) {
            if (t.isFoiConcluido() == false) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFoiConcluido(true);
                tarefaConcluida = t;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : setTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFoiConcluido(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        for (Tarefa t : setTarefas) {
            setTarefas.remove(t);
            break;
        }
        System.out.println("Lista limpa!");
    }
}