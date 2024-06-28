package set.operacoes_basicas.conjunto_convidados;

public class MainConjuntoConvidados {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Contar convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no set.");

        conjuntoConvidados.adicionarConvidado("Camila", 1);
        conjuntoConvidados.adicionarConvidado("Henrique", 2);
        conjuntoConvidados.adicionarConvidado("Natália", 2);
        conjuntoConvidados.adicionarConvidado("João", 3);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados no set.");

    }
}
