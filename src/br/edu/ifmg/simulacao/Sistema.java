package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.model.ConjuntoDeEntidades;

public class Sistema {

    private Distribuicoes distribuicoes;
    private ConjuntoDeEntidades conjuntoDeEntidades;
    //  Quantidade minima de vagoes na composicao
    private Integer T_MIN;
    //Quantidade maxima de vagoes na composicao
    private Integer T_MAX;
    private Double tempoDeSimulacao;

    public Sistema() {
        this.distribuicoes = new Distribuicoes();
        this.conjuntoDeEntidades = new ConjuntoDeEntidades();
    }

    public Distribuicoes getDistribuicoes() {
        return distribuicoes;
    }

    public void setDistribuicoes(Distribuicoes distribuicoes) {
        this.distribuicoes = distribuicoes;
    }

    public ConjuntoDeEntidades getConjuntoDeEntidades() {
        return conjuntoDeEntidades;
    }

    public void setConjuntoDeEntidades(ConjuntoDeEntidades conjuntoDeEntidades) {
        this.conjuntoDeEntidades = conjuntoDeEntidades;
    }

    public Integer getT_MIN() {
        return T_MIN;
    }

    public void setT_MIN(Integer t_MIN) {
        T_MIN = t_MIN;
    }

    public Integer getT_MAX() {
        return T_MAX;
    }

    public void setT_MAX(Integer t_MAX) {
        T_MAX = t_MAX;
    }

    public Double getTempoDeSimulacao() {
        return tempoDeSimulacao;
    }

    public void setTempoDeSimulacao(Double tempoDeSimulacao) {
        this.tempoDeSimulacao = tempoDeSimulacao;
    }
}
