package map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    // O LocalDate usa uma interface derivada do Comparable, ordenando automaticamente os elementos.
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        System.out.println(eventosOrdenados);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now(); // retorna a data atual do sistema
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        for(Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) { // o entrySet retorna um conjunto de pares chave-valor
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }
}
