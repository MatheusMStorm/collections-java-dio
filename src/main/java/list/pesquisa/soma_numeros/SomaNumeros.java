package list.pesquisa.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer n: listaNumeros) {
                soma = soma + n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maior = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n > maior) {
                    maior = n;
                }
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            for (Integer n : listaNumeros) {
                if (n < menor) {
                    menor = n;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }
}
