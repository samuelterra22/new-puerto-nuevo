package br.edu.ifmg.simulacao.model;

import java.util.HashMap;
import java.util.Map;

/**
 ConjuntoDeEntidades is a class to group all system's entities
 in a set of entities collections
 */

public class ConjuntoDeEntidades {
    private Map<String,ColecaoDeEntidade> conjuntoDeEntidades;

    public ConjuntoDeEntidades(){
        this.conjuntoDeEntidades = new HashMap<>();
    }

    public void adicionarColecao(String key, ColecaoDeEntidade collection){
        this.conjuntoDeEntidades.put(key,collection);
        
    }

    public void adicionarEntidade(String key, Entidade entidade){

        // verifica se existe a fila
        if (this.conjuntoDeEntidades.containsKey(key)){
            this.conjuntoDeEntidades.get(key).addEntity(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.conjuntoDeEntidades.put(key, new ColecaoDeEntidade());
            this.conjuntoDeEntidades.get(key).addEntity(entidade);
        }
    }

    public ColecaoDeEntidade getColecao(String key){
        return this.conjuntoDeEntidades.get(key);
    }
    public Entidade getEntidade(String key, int i){
        return this.getColecao(key).getEntity(i);
    }

    public void destroeColecao(int i){
        this.conjuntoDeEntidades.remove(i);
    }

    public void destreEntidade(String key, int i){
        this.getColecao(key).destroyEntity(i);
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
