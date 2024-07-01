package map.operacoes_basicas.agenda_contatos;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Se eu cadastrar dois contatos com a mesma chave, o valor será o último que foi dado
        // O put também serve como atualização
        agendaContatos.adicionarContato("Matheus Moura", 983003190);
        agendaContatos.adicionarContato("Matheus Moura", 988829919);
        agendaContatos.adicionarContato("Matheus Duarte", 987762909);
        agendaContatos.adicionarContato("Cássio Romano", 998299000);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Matheus Duarte");

        System.out.println(agendaContatos.pesquisarPorNome("Matheus Moura"));
    }
}
