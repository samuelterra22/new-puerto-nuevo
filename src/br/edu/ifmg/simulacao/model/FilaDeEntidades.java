package br.edu.ifmg.simulacao.model;

import java.util.ArrayList;
import java.util.List;

import entities.Entity;

/**
    FilaDeEntidades

    this is a data structure designed for store
    consumable entity items, in other words,
    once an item was accessed by the get method
    it is purged from the entity list.
 */

public class FilaDeEntidades {
    public static int LISTA = 0;
    public static int FILA = 1;
    public static int PILHA = 2;

    private int politica;
    private List<Entidade> listaDeEntidades;

    public FilaDeEntidades(){
        this.politica = this.LISTA;
        this.listaDeEntidades = new ArrayList<>();
    }

    public FilaDeEntidades(int politica){
        this.politica = politica;
        this.entityList = new ArrayList<>();
    }

    public void addEntity(Entidade Entidade){
        this.entityList.add(entity);
    }

    public void addEntity(int i, Entidade Entidade){
        if(this.politica ==this.LISTA){
            this.entityList.add(i, Entidade);
        }
    }

    public Entidade getEntity(){ /// rever o nome do metodo
        if(this.politica ==this.PILHA){
            return this.unstack();
        }
        else{
            return this.dequeue();
        }
    }

    public Entidade getEntity(int i){
        if(this.politica ==this.LISTA){
            if(this.entityList.size()>=i){
                Entidade Entidade = this.entityList.get(i);
                this.entityList.remove(i);
                return Entidade;
            }
            else{
                return null;
            }
        }
        else if(this.politica ==this.FILA){
            return this.dequeue();
        }
        else if(this.politica ==this.PILHA){
            return this.unstack();
        }
        return null;
    }

    private Entidade dequeue(){
        if(this.entityList.size()>0){
            Entidade Entidade = this.entityList.get(0);
            this.entityList.remove(0);
            return Entidade;
        }
        else{
            return null;
        }
    }
    private Entidade unstack(){
        if(this.entityList.size()>0){
            Entidade Entidade = this.entityList.get(this.entityList.size()-1);
            this.entityList.remove(this.entityList.size()-1);
            return Entidade;
        }
        else{
            return null;
        }
    }

    //retorna se possui entidades
    public boolean available(){
        return this.entityList.size()>0;
    }
}
