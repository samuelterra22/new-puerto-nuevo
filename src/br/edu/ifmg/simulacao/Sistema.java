package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.model.ConjuntoDeEntidades;
import br.edu.ifmg.simulacao.model.ConjuntoDeFilasDoSistema;

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
}
