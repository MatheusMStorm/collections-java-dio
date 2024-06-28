package set.pesquisa.agenda_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        setContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(setContatos);
    }

    // Pesquisar somente pelo início do nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : setContatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    // Atualizar contato
    public Contato atualizarNumeroContato(String nome, int numeroNovo) {
        Contato contatoAtualizado = null;
        for (Contato c : setContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numeroNovo);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
