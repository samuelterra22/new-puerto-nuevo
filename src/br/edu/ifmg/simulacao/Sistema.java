package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.model.*;

/**
 * Classe que contem todas as variaveis do sistema para realizar a simulação.
 */
public class Sistema {

    // Distribuições obetidas apartir do arquivo de entrada
    private Distribuicoes distribuicoes;
    // Conjunto de entidades
    private ConjuntoDeEntidades conjuntoDeEntidades;
    // Quantidade minima de vagoes na composicao
    private Integer T_MIN;
    // Quantidade maxima de vagoes na composicao
    private Integer T_MAX;
    // Tempo da simulação
    private Double tempoDeSimulacao;
    // Conjunto de filas do sistema
    private ConjuntoDeFilasDoSistema filasDoSistema;

    public Sistema() {
        this.distribuicoes = new Distribuicoes();
        this.conjuntoDeEntidades = new ConjuntoDeEntidades();
    }

    /*******************************************************************************************************************
     * Distribuições
     ******************************************************************************************************************/
    public Distribuicoes getDistribuicoes() {
        return distribuicoes;
    }

    public void setDistribuicoes(Distribuicoes distribuicoes) {
        this.distribuicoes = distribuicoes;
    }

    /*******************************************************************************************************************
     * Conjuntos de entidades
     ******************************************************************************************************************/
    public ConjuntoDeEntidades getConjuntoDeEntidades() {
        return conjuntoDeEntidades;
    }

    public void setConjuntoDeEntidades(ConjuntoDeEntidades conjuntoDeEntidades) {
        this.conjuntoDeEntidades = conjuntoDeEntidades;
    }

    /*******************************************************************************************************************
     * Quantidade minima de vagoes na composição
     ******************************************************************************************************************/
    public Integer getT_MIN() {
        return T_MIN;
    }

    public void setT_MIN(Integer t_MIN) {
        T_MIN = t_MIN;
    }

    /*******************************************************************************************************************
     * Quantidade maxima de vagoes na composição
     ******************************************************************************************************************/
    public Integer getT_MAX() {
        return T_MAX;
    }

    public void setT_MAX(Integer t_MAX) {
        T_MAX = t_MAX;
    }

    /*******************************************************************************************************************
     * Tempo de simulação
     ******************************************************************************************************************/
    public Double getTempoDeSimulacao() {
        return tempoDeSimulacao;
    }

    public void setTempoDeSimulacao(Double tempoDeSimulacao) {
        this.tempoDeSimulacao = tempoDeSimulacao;
    }


    /*******************************************************************************************************************
     * Conjunto de filas do sistema
     ******************************************************************************************************************/
    public ConjuntoDeFilasDoSistema getFilasDoSistema() {
        return filasDoSistema;
    }

    public void setFilasDoSistema(ConjuntoDeFilasDoSistema filasDoSistema) {
        this.filasDoSistema = filasDoSistema;
    }

    /*******************************************************************************************************************
     *                              Manipulação das Entidades do Sistema
     ******************************************************************************************************************/
    // grua
    public boolean temGruaDisponivel(){
        return this.conjuntoDeEntidades.gruaDisponivel();
    }

    public Grua getGruaDisponivel(){
        return this.conjuntoDeEntidades.getGruaDisponivel();
    }

    public Grua reservaGrua(){
        return this.conjuntoDeEntidades.reservaGrua();
    }

    // equipe
    public boolean temEquipeDisponivel(){
        return this.conjuntoDeEntidades.equipeDisponivel();
    }

    public Equipe getEquipeDisponivel(){
        return this.conjuntoDeEntidades.getEquipeDisponivel();
    }

    public Equipe reservaEquipe(){
        return this.conjuntoDeEntidades.reservaEquipe();
    }

    // cais
    public boolean temCaisDisponivel(){
        return this.conjuntoDeEntidades.caisDisponivel();
    }

    public Cais getCaisDisponivel(){
        return this.conjuntoDeEntidades.getCaisDisponivel();
    }

    public Cais reservaCais(){
        return this.conjuntoDeEntidades.reservaCais();
    }

    // carreta
    public boolean temCarretaDisponivel(){
        return this.conjuntoDeEntidades.carretaDisponivel();
    }

    public Carreta getCarretaDisponivel(){
        return this.conjuntoDeEntidades.getCarretaDisponivel();
    }

    public Carreta reservaCarreta(){
        return this.conjuntoDeEntidades.reservaCarreta();
    }

    // RTG
    public boolean temRtgDisponivel(){
        return this.conjuntoDeEntidades.rtgDisponivel();
    }

    public RTG getRtgDisponivel(){
        return this.conjuntoDeEntidades.getRtgDisponivel();
    }

    public RTG reservaRtg(){
        return this.conjuntoDeEntidades.reservaRtg();
    }

    // Reach Stacker
    public boolean temReachStackerDisponivel(){
        return this.conjuntoDeEntidades.reachStackerDisponivel();
    }

    public ReachStacker getReachStackerDisponivel(){
        return this.conjuntoDeEntidades.getReachStackerDisponivel();
    }

    public ReachStacker reservaReachStacker(){
        return this.conjuntoDeEntidades.reservaReachStacker();
    }

    // Terminal de carga
    public boolean temTerminalDeCArgaDisponivel(){
        return this.conjuntoDeEntidades.terminalDeCargaDisponivel();
    }

    public TerminalDeCarga getTerminalDeCargaDisponivel(){
        return this.conjuntoDeEntidades.getTerminalDeCargaDisponivel();
    }

    public TerminalDeCarga reservaTerminalDeCarga(){
        return this.conjuntoDeEntidades.reservaTerminalDeCarga();
    }
}
