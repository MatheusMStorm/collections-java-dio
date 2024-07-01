package map.pesquisa.contagem_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavra;

    public ContagemPalavras() {
        this.contagemPalavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavra.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavra.isEmpty()) {
            contagemPalavra.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavra);
    }

    public String encontrarPalavraMaisFrequente() {
        int maiorFrequencia = Integer.MIN_VALUE;
        String palavraMaisFrequente = null;
        if (!contagemPalavra.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavra.entrySet()) { // utilizamos Map.Entry para navegar por cada par de chaves e valores
                if (entry.getValue() > maiorFrequencia) {
                    maiorFrequencia = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }
}
