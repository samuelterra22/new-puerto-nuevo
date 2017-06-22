package br.edu.ifmg.simulacao;


import br.edu.ifmg.simulacao.Eventos.EventNotice;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Fel{

    private List<EventNotice> eventNotices = new LinkedList<EventNotice>();

    public Fel() {    }

    public void insere(EventNotice eventNotice) {
        this.eventNotices.add(eventNotice);
        Collections.sort(eventNotices, new Comparator<EventNotice>() {
            @Override
            public int compare(EventNotice eventNotice, EventNotice t1) {
                if(eventNotice.getHoraFim()>t1.getHoraFim()) return 1;
                if(eventNotice.getHoraFim()<t1.getHoraFim()) return -1;

                return 0;
            }
        });
    }

    public EventNotice remove() {
        return this.eventNotices.remove(0);
    }

    public boolean vazia() {
        return this.eventNotices.size() == 0;
    }

    public String toString() {

        StringBuffer sb = new StringBuffer();

        for (EventNotice e : eventNotices) {
            sb.append(e.getHoraFim());
            sb.append("\n");
        }

        System.out.println(sb);

        return null;
    }
}
