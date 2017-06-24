package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Tag;
import br.edu.ifmg.simulacao.model.*;
import br.edu.ifmg.simulacao.model.navios.Navio;

import java.util.HashMap;
import java.util.Map;

public class EventNotice {

    private Double horaInicio;
    private Double horaFim;

    private Tag eventoAtual;
    private Tag enventoDeTermino;

    private Map<String, Entidade> entidades;

    public EventNotice() {
        this.entidades = new HashMap<String, Entidade>();
    }

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

    public Map<String, Entidade> getEntidades() {
        return entidades;
    }

    public void setEntidades(Map<String, Entidade> entidades) {
        this.entidades = entidades;
    }

    private void setEntidade(String tipoEntidade, Entidade entidade){
        this.entidades.put(tipoEntidade, entidade);
    }

    private Entidade getEntidade(String tipoEntidade){
        return this.entidades.get(tipoEntidade);
    }

    public void setNavio(Navio navio){
        this.setEntidade("Navio", navio);
    }

    public Navio getNavio(){
        return (Navio) this.getEntidade("Navio");
    }

    public void setGrua(Grua grua){
        this.setEntidade("Grua", grua);
    }

    public Grua getGrua(){
        return (Grua) this.getEntidade("Grua");
    }

    public void setCais(Cais cais){
        this.setEntidade("Cais", cais);
    }

    public Cais getCais(){
        return (Cais) this.getEntidade("Cais");
    }

    public void setCarreta(Carreta carreta){
        this.setEntidade("Carreta", carreta);
    }

    public Carreta getCarreta(){
        return (Carreta) this.getEntidade("Carreta");
    }

    public void setComposicaoFerroviaria(ComposicaoFerroviaria composicaoFerroviaria){
        this.setEntidade("ComposicaoFerroviaria", composicaoFerroviaria);
    }

    public ComposicaoFerroviaria getComposicaoFerroviaria(){
        return (ComposicaoFerroviaria) this.getEntidade("ComposicaoFerroviaria");
    }

    public void setEquipe(Equipe equipe){
        this.setEntidade("Equipe", equipe);
    }

    public Equipe getEquipe(){
        return (Equipe) this.getEntidade("Equipe");
    }

    public void setRtg(RTG rtg){
        this.setEntidade("RTG", rtg);
    }

    public RTG getRtg(){
        return (RTG) this.getEntidade("RTG");
    }

    public void setReachStacker(ReachStacker reachStacker){
        this.setEntidade("ReachStacker", reachStacker);
    }

    public ReachStacker getReachStacker(){
        return (ReachStacker) this.getEntidade("ReachStacker");
    }

    public void setTerminalDeCarga(TerminalDeCarga terminalDeCarga){
        this.setEntidade("TerminalDeCarga", terminalDeCarga);
    }

    private TerminalDeCarga getTerminalDeCarga(){
        return (TerminalDeCarga) this.getEntidade("TerminalDeCarga");
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
