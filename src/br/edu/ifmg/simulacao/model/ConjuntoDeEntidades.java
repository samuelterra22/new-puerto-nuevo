package br.edu.ifmg.simulacao.model;

import java.util.HashMap;
import java.util.Map;

/**
 ConjuntoDeEntidades é uma classe para agrupar todas as entidades do sistema em um
 conjunto de coleções de entidades
 */

public class ConjuntoDeEntidades {
    private Map<String,ColecaoDeEntidade> conjuntoDeEntidades;

    public ConjuntoDeEntidades(){
        this.conjuntoDeEntidades = new HashMap<>();
    }

    public void adicionarColecao(String chave, ColecaoDeEntidade collection){
        this.conjuntoDeEntidades.put(chave, collection);
        
    }

    // adiciona entidade no hash
    public void adicionarEntidade(String chave, Entidade entidade){

        // verifica se existe a fila
        if (this.conjuntoDeEntidades.containsKey(chave)){
            this.conjuntoDeEntidades.get(chave).addEntity(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.conjuntoDeEntidades.put(chave, new ColecaoDeEntidade());
            this.conjuntoDeEntidades.get(chave).addEntity(entidade);
        }
    }

    public ColecaoDeEntidade getColecao(String chave){
        return this.conjuntoDeEntidades.get(chave);
    }
    public Entidade getEntidade(String chave, int i){
        return this.getColecao(chave).getEntity(i);
    }

    // remove uma coleção inteira de entidades
    public void destroeColecao(int i){
        this.conjuntoDeEntidades.remove(i);
    }

    public void destreEntidade(String chave, int i){
        this.getColecao(chave).destroyEntity(i);
    }

    public void instanciaEntidades(String entidade, int quantidade){
        int i;

        for(i=0;i<quantidade;i++){
            switch (entidade.toUpperCase()){
                case "G": {
                    this.adicionarEntidade("G", new Grua());
                    break;
                }
                case "E": {
                    this.adicionarEntidade("E", new Equipe());
                    break;
                }
                case "Q": {
                    this.adicionarEntidade("Q", new Cais());
                    break;
                }
                case "C": {
                    this.adicionarEntidade("C", new Carreta());
                    break;
                }
                case "R": {
                    this.adicionarEntidade("R", new RTG());
                    break;
                }
                case "S": {
                    this.adicionarEntidade("S", new ReachStacker());
                    break;
                }
                case "F": {
                    this.adicionarEntidade("F", new TerminalDeCarga());
                    break;
                }
                case "T": {
                    this.adicionarEntidade("T", new ComposicaoFerroviaria());
                    break;
                }
            }
        }
    }
}
