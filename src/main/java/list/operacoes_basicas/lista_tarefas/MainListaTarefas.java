package list.operacoes_basicas.lista_tarefas;

public class MainListaTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        // Conferindo se a lista está vazia
        System.out.println("Número de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());
        
        // Adicionando tarefas
        listaTarefa.adicionarTarefa("Limpar casa");
        listaTarefa.adicionarTarefa("Estudar");
        System.out.println("Número de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());
        
        // Exibindo as descrições
        listaTarefa.obterDescricoesTarefas();
    }
}
