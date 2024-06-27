package list.operacoes_basicas.carrinho_compras;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(i);
            }
        }
        carrinho.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double soma = 0.0;
        for (Item i : carrinho) {
            double totalProduto = i.getPreco() * i.getQuantidade();
            soma = soma + totalProduto;
        }
        BigDecimal bd = new BigDecimal(soma).setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
    }

    public void exibirItens() {
        System.out.println(carrinho);
    }
}
