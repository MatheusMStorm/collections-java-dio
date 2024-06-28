package list.ordenacao.ordenacao_pessoas;

public class MainOrdenacaoPessoas {
    public static void main(String[] args) {
        OrdenacaoPessoas listaOrdenacaoPessoas = new OrdenacaoPessoas();

        listaOrdenacaoPessoas.adicionarPessoa("Matheus Moura Rodrigues Costa", 21, 1.75);
        listaOrdenacaoPessoas.adicionarPessoa("Paulo Cezar Cruz Costa", 48, 1.84);
        listaOrdenacaoPessoas.adicionarPessoa("Juliana de Moura Rodrigues", 49, 1.60);

        System.out.println(listaOrdenacaoPessoas.ordenarPorIdade());
        System.out.println(listaOrdenacaoPessoas.ordenarPorAltura());
    }
}
