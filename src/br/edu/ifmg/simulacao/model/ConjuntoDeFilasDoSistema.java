package br.edu.ifmg.simulacao.model;

import br.edu.ifmg.simulacao.model.navios.Navio;

import java.util.HashMap;
import java.util.Map;

/**
 ConjuntoDeFilasDoSistema é um modelo de abstração para um conjunto de todas as filas do sistema. Cada fila é uma forma
 especial de uma filaDeEntidades, os itens são acessados em uma política FIFO.
 */
public class ConjuntoDeFilasDoSistema {
    private static int LISTA = 0;
    private static int FILA  = 1;
    private static int PILHA = 2;

    // hash table que representa o conjunto de filas
    private Map<String, FilaDeEntidades> filaDeEntidades;

    // contrutor
    public ConjuntoDeFilasDoSistema(){
        this.filaDeEntidades = new HashMap<String, FilaDeEntidades>();
    }

    // adiciona a entidade em determinada fila, se a entidade nao existir, cria uma nova
    private void addEntidadeNaFila(String fila, Entidade entidade){

        // verifica se existe a fila
        if (this.filaDeEntidades.containsKey(fila)){
            this.filaDeEntidades.get(fila).addEntidade(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.filaDeEntidades.put(fila, new FilaDeEntidades(FILA));
            this.filaDeEntidades.get(fila).addEntidade(entidade);
        }
    }

    // retorna uma entidade da frente da fila de determinada tipo de entidade (ex. navio, equipe)
    private Entidade getEntidadeDaFila(String fila){
        if (this.filaDeEntidades.containsKey(fila)){
            return this.filaDeEntidades.get(fila).getEntidade();
        }
        return null;
    }

    // retorna uma lista de entidades
    private FilaDeEntidades getFilaDeEntidades(String fila){
        return this.filaDeEntidades.get(fila);
    }

    /*******************************************************************************************************************
     *                                    Manipulação das Filas de Entidades
     ******************************************************************************************************************/

    // filas de navios aguardando no cais
    public void addFilaNavioAguardarCais (Navio navio){
        this.addEntidadeNaFila("filaNavioAguardarCais", navio);
    }

    public Navio consomeFilaNavioAguardarCais (){
        return (Navio) getEntidadeDaFila("filaNavioAguardarCais");
    }

    public boolean temEntidadeFilaNavioAguardarCais (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaNavioAguardarCais");
        return fila.getSize() > 0;
    }

    // fila de navios aguardando descarregar
    public void addFilaNavioAguardarDescarregar (Navio navio){
        this.addEntidadeNaFila("filaNavioAguardarDescarregar", navio);
    }

    public Navio consomeFilaNavioAguardarDescarregar (){
        return (Navio) getEntidadeDaFila("filaNavioAguardarDescarregar");
    }

    public boolean temEntidadeFilaNavioAguardarDescarregar (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaNavioAguardarDescarregar");
        return fila.getSize() > 0;
    }

    // fila de gruas aguardando o transporte
    public void addFilaGruaAguardarTransporte (Grua grua){
        this.addEntidadeNaFila("filaGruaAguardarTransporte", grua);
    }

    public Grua consomeFilaGruaAguardarTransporte (){
        return (Grua) getEntidadeDaFila("filaGruaAguardarTransporte");
    }

    public boolean temEntidadeFilaGruaAguardarTransporte (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaGruaAguardarTransporte");
        return fila.getSize() > 0;
    }

    // filas de carretas aguardando a grua
    public void addFilaCarretaNaGrua (Carreta carreta){
        this.addEntidadeNaFila("filaCarretaNaGrua", carreta);
    }

    public Carreta consomeFilaCarretaNaGrua (){
        return (Carreta) getEntidadeDaFila("filaCarretaNaGrua");
    }

    public boolean temEntidadeFilaCarretaNaGrua (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaCarretaNaGrua");
        return fila.getSize() > 0;
    }

    // filas de carretas aguardando descarregar no patio
    public void addFilaCarretaAguardarDescargaPatio (Carreta carreta){
        this.addEntidadeNaFila("filaCarretaAguardarDescargaPatio", carreta);
    }

    public Carreta consomeFilaCarretaAguardarDescargaPatio (){
        return (Carreta) getEntidadeDaFila("filaCarretaAguardarDescargaPatio");
    }

    public boolean temEntidadeFilaCarretaAguardarDescargaPatio (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaCarretaAguardarDescargaPatio");
        return fila.getSize() > 0;
    }

    // fila de RTGs aguardando para empilhar
    public void addFilaRTGParaEmpilhar (RTG rtg){
        this.addEntidadeNaFila("filaRTGParaEmpilhar", rtg);
    }

    public RTG consomeFilaRTGParaEmpilhar (){
        return (RTG) getEntidadeDaFila("filaRTGParaEmpilhar");
    }

    public boolean temEntidadeFilaRTGParaEmpilhar (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaRTGParaEmpilhar");
        return fila.getSize() > 0;
    }

    // fila de reachs aguardando para empilhar
    public void addFilaReachParaDesempilhar (ReachStacker reach){
        this.addEntidadeNaFila("filaReachParaDesempilhar", reach);
    }

    public ReachStacker consomeFilaReachParaDesempilhar (){
        return (ReachStacker) getEntidadeDaFila("filaReachParaDesempilhar");
    }

    public boolean temEntidadeFilaReachParaDesempilhar (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaReachParaDesempilhar");
        return fila.getSize() > 0;
    }

    // fila de reach aguardando para desempilhar
    public void addFilaReachAguardaDesempilhar (ReachStacker reach){
        this.addEntidadeNaFila("filaReachAguardaDesempilhar", reach);
    }

    public ReachStacker consomeFilaReachAguardaDesempilhar (){
        return (ReachStacker) getEntidadeDaFila("filaReachAguardaDesempilhar");
    }

    public boolean temEntidadeFilaReachAguardaDesempilhar (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaReachAguardaDesempilhar");
        return fila.getSize() > 0;
    }

    // fila de composições aguardando no patio de manobra
    public void addFilaComposicaoPatioManobra (ComposicaoFerroviaria composicao){
        this.addEntidadeNaFila("filaComposicaoPatioManobra", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoPatioManobra (){
        return (ComposicaoFerroviaria) getEntidadeDaFila("filaComposicaoPatioManobra");
    }

    public boolean temEntidadeFilaComposicaoPatioManobra (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaComposicaoPatioManobra");
        return fila.getSize() > 0;
    }

    // fila de composiçõoes aguardando reach
    public void addFilaComposicaoAguardarReach (ComposicaoFerroviaria composicao){
        this.addEntidadeNaFila("filaComposicaoAguardarReach", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoAguardarReach (){
        return (ComposicaoFerroviaria) getEntidadeDaFila("filaComposicaoAguardarReach");
    }

    public boolean temEntidadeFilaComposicaoAguardarReach (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaComposicaoAguardarReach");
        return fila.getSize() > 0;
    }

    // fila de composições aguardando liberação
    public void addFilaComposicaoAguardaLiberacao (ComposicaoFerroviaria composicao){
        this.addEntidadeNaFila("filaComposicaoAguardaLiberacao", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoAguardaLiberacao (){
        return (ComposicaoFerroviaria) getEntidadeDaFila("filaComposicaoAguardaLiberacao");
    }

    public boolean temEntidadeFilaComposicaoAguardaLiberacao (){
        FilaDeEntidades fila = this.getFilaDeEntidades("filaComposicaoAguardaLiberacao");
        return fila.getSize() > 0;
    }

}
