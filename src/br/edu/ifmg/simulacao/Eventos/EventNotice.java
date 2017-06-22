package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Tag;

public class EventNotice {

    private Double horaInicio;
    private Double horaFim;

    private Tag eventoAtual;
    private Tag proximoEvento;

    public EventNotice() {    }

    public Double getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Double horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Double getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(Double horaFim) {
        this.horaFim = horaFim;
    }

    public Double getDuracao() {
        return horaFim-horaInicio;
    }

    public Tag getEventoAtual() {
        return eventoAtual;
    }

    public void setEventoAtual(Tag eventoAtual) {
        this.eventoAtual = eventoAtual;
    }

    public Tag getProximoEvento() {
        return proximoEvento;
    }

    public void setProximoEvento(Tag proximoEvento) {
        this.proximoEvento = proximoEvento;
    }
}
