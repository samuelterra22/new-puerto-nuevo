package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Tag;

public class EventNotice {

    private Double horaInicio;
    private Double horaFim;

    private Tag eventoAtual;
    private Tag enventoDeTermino;

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

    public Tag getEnventoDeTermino() {
        return enventoDeTermino;
    }

    public void setEnventoDeTermino(Tag enventoDeTermino) {
        this.enventoDeTermino = enventoDeTermino;
    }

    public Tag getEventoAtual() {
        return eventoAtual;
    }

    public void setEventoAtual(Tag eventoAtual) {
        this.eventoAtual = eventoAtual;
    }

    @Override
    public String toString() {
        return "EventNotice{" +
                "horaInicio=" + horaInicio +
                ", horaFim=" + horaFim +
                ", enventoDeTermino=" + enventoDeTermino +
                '}';
    }
}
