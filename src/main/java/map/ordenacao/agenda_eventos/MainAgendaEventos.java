package map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.time.Month;

public class MainAgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 7, 1), "Rock in Rio", "Imagine Dragons");
        agenda.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 27), "Lollapalooza", "Coldplay");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "BBC Big Weekend", "Taylor Swift");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
