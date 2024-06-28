package list.ordenacao.ordenacao_numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumeros(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordemAscendente() {
        if (!listaNumeros.isEmpty()) {
            List<Integer> numerosAscendentes = new ArrayList<>(listaNumeros);
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        }
        else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> ordemDescendente() {
        if (!listaNumeros.isEmpty()) {
            List<Integer> numerosDescendentes = new ArrayList<>(listaNumeros);
            Collections.sort(numerosDescendentes, Collections.reverseOrder());
            return numerosDescendentes;
        }
        else {
            throw new RuntimeException("Lista vazia.");
        }
    }
}
