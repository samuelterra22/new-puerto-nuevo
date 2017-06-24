package br.edu.ifmg.simulacao;


import br.edu.ifmg.simulacao.Eventos.EventNotice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta classe representa uma lista de agendamento de atividades futuras dos eventos do sistema
 * Segue
 * */
public class Fel{

    private List<EventNotice> eventNotices = new LinkedList<EventNotice>();

    public Fel() {    }

    public void insere(EventNotice eventNotice) {
        // realiza a inserção de um event notify na lista
        this.eventNotices.add(eventNotice);

        // coloca a lista em ordem crescente levando em consideração o tem de termino do evento
        Collections.sort(eventNotices, new Comparator<EventNotice>() {
            @Override
            public int compare(EventNotice eventNotice, EventNotice t1) {
                if(eventNotice.getHoraFim()>t1.getHoraFim()) return 1;
                if(eventNotice.getHoraFim()<t1.getHoraFim()) return -1;

                return 0;
            }
        });
    }

    // consome um event notice na fel
    public EventNotice consome() {
        return this.eventNotices.remove(0);
    }

    // verifica se a fel esta vazia
    public boolean vazia() {
        return this.eventNotices.size() == 0;
    }

    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (EventNotice e : eventNotices) {
            stringBuilder.append("Evento:          ").append(e.getEventoAtual()).append("\n");
            stringBuilder.append("Hora de inicio:  ").append(e.getHoraInicio()).append("\n");
            stringBuilder.append("Hora de fim:     ").append(e.getHoraFim()).append("\n");
            stringBuilder.append("Duração:         ").append(e.getDuracao()).append("\n");
            stringBuilder.append("Evento futuro:   ").append(e.getEnventoDeTermino()).append("\n");
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
