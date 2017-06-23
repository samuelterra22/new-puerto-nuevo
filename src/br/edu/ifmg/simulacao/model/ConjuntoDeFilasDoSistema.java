package br.edu.ifmg.simulacao.model;

import br.edu.ifmg.simulacao.model.navios.Navio;

import java.util.HashMap;
import java.util.Map;

/**
 ConjuntoDeFilasDoSistema é um modelo de abstração para um conjunto de todas as filas do sistema
 Cada fila é uma forma especial de uma filaDeEntidades, oss itens são acessados em uma política FIFO

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
    private void addEntidade(String fila, Entidade entidade){

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
    private Entidade getEntidade(String fila){
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
     *                                    Manipulação das Filas do sistema
     ******************************************************************************************************************/

    // filas de navios aguardando no cais
    public void addFilaNavioAguardarCais (Navio navio){
        this.addEntidade("filaNavioAguardarCais", navio);
    }

    public Navio consomeFilaNavioAguardarCais (){
        return (Navio) getEntidade("filaNavioAguardarCais");
    }

    // fila de navios aguardando descarregar
    public void addFilaNavioAguardarDescarregar (Navio navio){
        this.addEntidade("filaNavioAguardarDescarregar", navio);
    }

    public Navio consomeFilaNavioAguardarDescarregar (){
        return (Navio) getEntidade("filaNavioAguardarDescarregar");
    }

    // fila de gruas aguardando o transporte
    public void addFilaGruaAguardarTransporte (Grua grua){
        this.addEntidade("filaGruaAguardarTransporte", grua);
    }

    public Grua consomeFilaGruaAguardarTransporte (){
        return (Grua) getEntidade("filaGruaAguardarTransporte");
    }

    // filas de carretas aguardando a grua
    public void addFilaCarretaNaGrua (Carreta carreta){
        this.addEntidade("filaCarretaNaGrua", carreta);
    }

    public Carreta consomeFilaCarretaNaGrua (){
        return (Carreta) getEntidade("filaCarretaNaGrua");
    }

    // filas de carretas aguardando descarregar no patio
    public void addFilaCarretaAguardarDescargaPatio (Carreta carreta){
        this.addEntidade("filaCarretaAguardarDescargaPatio", carreta);
    }

    public Carreta consomeFilaCarretaAguardarDescargaPatio (){
        return (Carreta) getEntidade("filaCarretaAguardarDescargaPatio");
    }

    // fila de RTGs aguardando para empilhar
    public void addFilaRTGParaEmpilhar (RTG rtg){
        this.addEntidade("filaRTGParaEmpilhar", rtg);
    }

    public RTG consomeFilaRTGParaEmpilhar (){
        return (RTG) getEntidade("filaRTGParaEmpilhar");
    }

    // fila de reachs aguardando para empilhar
    public void addFilaReachParaDesempilhar (ReachStacker reach){
        this.addEntidade("filaReachParaDesempilhar", reach);
    }

    public ReachStacker consomeFilaReachParaDesempilhar (){
        return (ReachStacker) getEntidade("filaReachParaDesempilhar");
    }

    // fila de reach aguardando para desempilhar
    public void addFilaReachAguardaDesempilhar (ReachStacker reach){
        this.addEntidade("filaReachAguardaDesempilhar", reach);
    }

    public ReachStacker consomeFilaReachAguardaDesempilhar (){
        return (ReachStacker) getEntidade("filaReachAguardaDesempilhar");
    }

    // fila de composições aguardando no patio de manobra
    public void addFilaComposicaoPatioManobra (ComposicaoFerroviaria composicao){
        this.addEntidade("filaComposicaoPatioManobra", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoPatioManobra (){
        return (ComposicaoFerroviaria) getEntidade("filaComposicaoPatioManobra");
    }

    // fila de composiçõoes aguardando reach
    public void addFilaComposicaoAguardarReach (ComposicaoFerroviaria composicao){
        this.addEntidade("filaComposicaoAguardarReach", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoAguardarReach (){
        return (ComposicaoFerroviaria) getEntidade("filaComposicaoAguardarReach");
    }

    // fila de composições aguardando liberação
    public void addFilaComposicaoAguardaLiberacao (ComposicaoFerroviaria composicao){
        this.addEntidade("filaComposicaoAguardaLiberacao", composicao);
    }

    public ComposicaoFerroviaria consomeFilaComposicaoAguardaLiberacao (){
        return (ComposicaoFerroviaria) getEntidade("filaComposicaoAguardaLiberacao");
    }

}
