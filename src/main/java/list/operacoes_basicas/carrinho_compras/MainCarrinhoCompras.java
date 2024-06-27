package list.operacoes_basicas.carrinho_compras;

public class MainCarrinhoCompras {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        // Adicionando itens
        carrinho.adicionarItem("Manteiga DaVaca", 29.99, 1);
        carrinho.adicionarItem("Nesquik", 1.65, 4);

        // Exibindo valor total
        System.out.println("O valor total da compra é de R$ " + carrinho.calcularValorTotal());

        // Removendo itens
        carrinho.removerItem("Nesquik");
        System.out.println("O valor total da compra é de R$ " + carrinho.calcularValorTotal());

        // Exibindo itens
        carrinho.exibirItens();
    }
}
