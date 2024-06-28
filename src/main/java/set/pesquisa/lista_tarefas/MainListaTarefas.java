package set.pesquisa.lista_tarefas;

public class MainListaTarefas {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        // Adicionando tarefas
        tarefas.adicionarTarefa("Limpar a casa");
        tarefas.adicionarTarefa("Estudar");
        tarefas.adicionarTarefa("Cozinhar");
        tarefas.adicionarTarefa("Tirar o lixo");
        tarefas.adicionarTarefa("Dar push do projeto para o GitHub");

        // Exibindo tarefas
        tarefas.exibirTarefas();

        // Já estudei
        tarefas.marcarTarefaConcluida("Estudar");

        // Atualiza a tabela!
        tarefas.exibirTarefas();

        // Posso excluir da tabela 
        tarefas.removerTarefa("Estudar");

        // Atualiza
        tarefas.exibirTarefas();

        // Quantas coisas ainda faltam?
        System.out.println("Restam " + tarefas.contarTarefas() + " tarefas");

        // Já dei push do projeto
        tarefas.marcarTarefaConcluida("Dar push do projeto para o GitHub");

        // Atualiza
        tarefas.exibirTarefas();

        // Ops, na verdade ainda não dei push 😬
        tarefas.marcarTarefaPendente("Dar push do projeto para o GitHub");

        // Atualiza
        tarefas.exibirTarefas();

        // Fim do dia
        tarefas.limparListaTarefas();
    }
}
