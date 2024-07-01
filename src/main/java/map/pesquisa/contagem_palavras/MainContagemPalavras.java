package map.pesquisa.contagem_palavras;

public class MainContagemPalavras {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("Manteiga", 12);
        contagem.adicionarPalavra("Chocolate", 9);
        contagem.adicionarPalavra("Pão", 9);

        contagem.exibirContagemPalavras();

        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}
