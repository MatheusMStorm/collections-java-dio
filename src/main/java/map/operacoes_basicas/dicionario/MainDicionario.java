package map.operacoes_basicas.dicionario;

public class MainDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Juventude", "Idade entre a infância e o desenvolvimento do organismo humano de forma plena");
        dicionario.adicionarPalavra("Bonança", "Tranquilidade, calma, esp. após um período agitado");
        dicionario.adicionarPalavra("Graduação", "Curso de nível universitário; faculdade, bacharelado, terceiro grau");

        dicionario.exibirDicionario();

        System.out.println(dicionario.pesquisarPorVerbete("Graduação"));

        System.out.println(dicionario.removerPalavra("Juventude"));
    }
}
