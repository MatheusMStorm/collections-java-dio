package map.pesquisa.estoque_produtos;

public class MainEstoqueProdutos {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProdutos(1, "Manteiga", 29.0, 5);
        estoque.adicionarProdutos(2, "Chocolate", 3.0, 10);
        estoque.adicionarProdutos(3, "Feijão", 10.0, 2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade por valor total no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
