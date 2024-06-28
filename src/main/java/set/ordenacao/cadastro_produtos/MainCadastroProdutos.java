package set.ordenacao.cadastro_produtos;

public class MainCadastroProdutos {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProdutos(1, "Manteiga", 19.99, 2);
        produtos.adicionarProdutos(2, "Chocolate", 4.99, 3);
        produtos.adicionarProdutos(2, "Chocolate Branco", 7.99, 5);
        produtos.adicionarProdutos(3, "Macarrão", 3.99, 8);

        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
