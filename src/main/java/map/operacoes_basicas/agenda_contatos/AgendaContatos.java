package map.operacoes_basicas.agenda_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Como o Map trabalha com chave-valor, não há necessidade de criar uma classe para os atributos de contato
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    // Como as chaves são únicas, não necessita de um loop
    public void removerContato(String nome) {
        if (!agendaContatos.isEmpty()) {
            agendaContatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatos.isEmpty()) {
            numeroPorNome = agendaContatos.get(nome);
        }
        return numeroPorNome;
    }
}
