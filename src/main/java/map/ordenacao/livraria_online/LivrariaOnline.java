package map.ordenacao.livraria_online;

import java.util.*;

public class LivrariaOnline {
    private Map<Long, Livro> estoqueLivros;

    public LivrariaOnline() {
        this.estoqueLivros = new HashMap<>();
    }

    public void adicionarLivro(long isbn, String link, String titulo, String autor, double preco) {
        estoqueLivros.put(isbn, new Livro(link, titulo, autor, preco));
    }    

    public void removerLivro(String titulo) {
        Long isbnParaExcluir = null;
        if (!estoqueLivros.isEmpty()) {
            for (Map.Entry<Long, Livro> entry : estoqueLivros.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    isbnParaExcluir = entry.getKey();
                    estoqueLivros.remove(isbnParaExcluir);
                    break;
                }
            }
        }
    }

    public Set<Map.Entry<Long, Livro>> exibirLivrosOrdenadosPorPreco() {
        Set<Map.Entry<Long, Livro>> livrosOrdenadosPorPreco = new TreeSet<>(new ComparatorPreco());
        if (!estoqueLivros.isEmpty()) {
            for (Map.Entry<Long, Livro> entry : estoqueLivros.entrySet()) {
                livrosOrdenadosPorPreco.add(entry);
            }
        }
        return livrosOrdenadosPorPreco;
    }

    public Set<Map.Entry<Long, Livro>> pesquisarLivroPorAutor(String autor) {
        Set<Map.Entry<Long, Livro>> livrosPorAutor = new HashSet<>();
        if (!estoqueLivros.isEmpty()) {
            for (Map.Entry<Long, Livro> entry : estoqueLivros.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(entry);
                }
            }
        }
        return livrosPorAutor;
    }
    
    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueLivros.isEmpty()) {
            for (Map.Entry<Long, Livro> entry : estoqueLivros.entrySet()) {
                if (entry.getValue().getPreco() > maiorPreco) {
                    livroMaisCaro = entry.getValue();
                    maiorPreco = entry.getValue().getPreco();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueLivros.isEmpty()) {
            for (Map.Entry<Long, Livro> entry : estoqueLivros.entrySet()) {
                if (entry.getValue().getPreco() < menorPreco) {
                    livroMaisBarato = entry.getValue();
                    menorPreco = entry.getValue().getPreco();
                }
            }
        }
        return livroMaisBarato;
    }
}