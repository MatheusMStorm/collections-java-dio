package map.operacoes_basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioPalavras;

    public Dicionario() {
        this.dicionarioPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String verbete, String definicao) {
        dicionarioPalavras.put(verbete, definicao);
    }

    public String removerPalavra(String verbete) {
        if (!dicionarioPalavras.isEmpty()) {
            dicionarioPalavras.remove(verbete);
            return "A palavra " + verbete + " foi removida com sucesso.";
        } 
        else {
            return "Dicionário vazio.";
        }
    }

    public void exibirDicionario() {
        System.out.println(dicionarioPalavras);
    }

    public String pesquisarPorVerbete(String verbete) {
        String definicaoPorVerbete = null;
        if (!dicionarioPalavras.isEmpty()) {
            definicaoPorVerbete = dicionarioPalavras.get(verbete);
        }
        else {
            System.out.println("Dicionário vazio.");
        }
        return definicaoPorVerbete;
    }
}
