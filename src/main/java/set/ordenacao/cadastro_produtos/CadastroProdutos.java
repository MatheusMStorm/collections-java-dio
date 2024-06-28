package set.ordenacao.cadastro_produtos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProdutos(int cod, String nome, double preco, int quantidade) {
        setProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    // Para deixar organizado por nome, utilizamos o TreeSet (o HashSet desorganizaria a lista novamente)
    // Não precisamos do Collections.sort() nesse caso, porque estamos trabalhando já com um set organizado
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }

    class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
        
    }
}
