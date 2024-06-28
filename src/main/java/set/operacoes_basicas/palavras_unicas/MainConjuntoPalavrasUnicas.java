package set.operacoes_basicas.palavras_unicas;

public class MainConjuntoPalavrasUnicas {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("pato");
        palavrasUnicas.adicionarPalavra("cachorro");
        palavrasUnicas.adicionarPalavra("esquilo");

        palavrasUnicas.verificarPalavra("pato");

        palavrasUnicas.exibirPalavras();

        palavrasUnicas.removerPalavra("esquilo");

        palavrasUnicas.exibirPalavras();
    }
}
