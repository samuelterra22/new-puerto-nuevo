package br.edu.ifmg.simulacao.model;

/**
 * Entidade Composição ferroviária
 * */
public class ComposicaoFerroviaria extends Entidade{

    private int capacidadeDeVagoes;

    public ComposicaoFerroviaria() {
        super("Composição Ferroviária");
    }

    public int getCapacidadeDeVagoes() {
        return capacidadeDeVagoes;
    }

    public void setCapacidadeDeVagoes(int capacidadeDeVagoes) {
        this.capacidadeDeVagoes = capacidadeDeVagoes;
    }



}
