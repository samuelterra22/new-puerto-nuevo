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

    public void addCollection (String key, ColecaoDeEntidade collection){
        this.conjuntoDeEntidades.put(key,collection);
        
    }

    public void addEntity(String key, Entidade entidade){

        // verifica se existe a fila
        if (this.conjuntoDeEntidades.containsKey(key)){
            this.conjuntoDeEntidades.get(key).addEntity(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.conjuntoDeEntidades.put(key, new ColecaoDeEntidade());
            this.conjuntoDeEntidades.get(key).addEntity(entidade);
        }
    }

    public ColecaoDeEntidade getCollection (String key){
        return this.conjuntoDeEntidades.get(key);
    }
    public Entidade getEntity(String key, int i){
        return this.getCollection(key).getEntity(i);
    }

    public void destroyCollection(int i){
        this.conjuntoDeEntidades.remove(i);
    }
    public void destroyEntity(String key, int i){
        this.getCollection(key).destroyEntity(i);
    }
}
