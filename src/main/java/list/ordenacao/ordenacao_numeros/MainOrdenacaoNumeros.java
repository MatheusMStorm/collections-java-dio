package list.ordenacao.ordenacao_numeros;

public class MainOrdenacaoNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumeros(1);
        listaNumeros.adicionarNumeros(5);
        listaNumeros.adicionarNumeros(2);
        listaNumeros.adicionarNumeros(4);
        listaNumeros.adicionarNumeros(3);

        System.out.println(listaNumeros.ordemAscendente());
        System.out.println(listaNumeros.ordemDescendente());
    }
}
