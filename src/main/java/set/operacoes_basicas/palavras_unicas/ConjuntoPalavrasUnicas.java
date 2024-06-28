package set.operacoes_basicas.palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra.toLowerCase());
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        for (String p : palavrasUnicas) {
            if (p.equalsIgnoreCase(palavra)) {
                System.out.println("A palavra '" + palavra + "' existe no set");
                break;
            }
            else {
                System.out.println("A palavra indicada não existe no set.");
            }
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasUnicas);
    }
}
