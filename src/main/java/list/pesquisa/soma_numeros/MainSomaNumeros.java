package list.pesquisa.soma_numeros;

public class MainSomaNumeros {    
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(-10);
        numeros.adicionarNumero(5);

        numeros.exibirNumeros();
        System.out.println("---------------------------------");
        System.out.println("Soma: " + numeros.calcularSoma());
        System.out.println("---------------------------------");
        System.out.println("Maior valor: " + numeros.encontrarMaiorNumero());
        System.out.println("---------------------------------");
        System.out.println("Menor valor: " + numeros.encontrarMenorNumero());
    }
}
