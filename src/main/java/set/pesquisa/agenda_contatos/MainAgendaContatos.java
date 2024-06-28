package set.pesquisa.agenda_contatos;

public class MainAgendaContatos {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        // Adicionando contatos
        agenda.adicionarContato("Matheus", 983003190);
        agenda.adicionarContato("Matheus", 986023810);
        agenda.adicionarContato("Matheus Barbosa", 987750980);
        agenda.adicionarContato("Matheus Faculdade", 988005080);
        agenda.adicionarContato("Marcos", 991850090);

        // Exibindo contatos
        agenda.exibirContatos();

        // Pesquisando contatos
        System.out.println(agenda.pesquisarPorNome("Matheus"));

        // Atualizando contato
        System.out.println(agenda.atualizarNumeroContato("Marcos", 991175687));

        agenda.exibirContatos();
    }
}
