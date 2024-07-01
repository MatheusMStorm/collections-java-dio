package map.pesquisa.estoque_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque() {
        double valorEstoqueTotal = 0.0;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                valorEstoqueTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorEstoqueTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE; // MIN_VALUE é o menor valor possível de um double
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() > maiorValor) {
                    produtoMaisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE; // MAX_VALUE é o maior valor possível de um double
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() < menorValor) {
                    produtoMaisBarato = p;
                    menorValor = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotal = null;
        double maiorQuantidadeValorTotal = Double.MIN_VALUE;
        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                double precoPorQuantidade = p.getPreco() * p.getQuantidade();
                if (precoPorQuantidade > maiorQuantidadeValorTotal) {
                    produtoMaiorQuantidadeValorTotal = p;
                    maiorQuantidadeValorTotal = precoPorQuantidade;
                }
            }
        }
        return produtoMaiorQuantidadeValorTotal;
    }   
}
