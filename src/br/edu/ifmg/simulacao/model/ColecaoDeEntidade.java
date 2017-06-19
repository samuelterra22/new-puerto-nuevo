package br.edu.ifmg.simulacao.model;



import java.util.ArrayList;
import java.util.List;

/**
    Entitycolection

    this is a data structure designed for store
    non consumable entity items, in other words,
    an iten persists into data estructure after 
    it was accessed by the get method
 */

public class ColecaoDeEntidade {
    private List<Entidade> colecaoDeEntidade;

    public ColecaoDeEntidade(){
        this.colecaoDeEntidade = new ArrayList<>();
    }

    public void addEntity(Entidade entidade){
        this.colecaoDeEntidade.add(entidade);
    }

    public Entidade getEntity(int i){
        return this.colecaoDeEntidade.get(i);
    }

    public Entidade destroyEntity(int i){
        return this.colecaoDeEntidade.remove(i);
    }
}