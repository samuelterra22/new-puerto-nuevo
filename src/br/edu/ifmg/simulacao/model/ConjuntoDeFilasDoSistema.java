package br.edu.ifmg.simulacao.model;

import java.util.HashMap;
import java.util.Map;

import entities.Entity;

/**
 ConjuntoDeFilasDoSistema is an abstraction model for a set
 of all system's queues

 Each queue is an especial form of an FilaDeEntidades
 itens are acessed in a FIFO policy

 */

public class ConjuntoDeFilasDoSistema {

    // hash table que representa o conjunto de filas
    private Map<String, FilaDeEntidades> entityQueue;

    // contrutor
    public ConjuntoDeFilasDoSistema(){
        this.entityQueue = new HashMap<>();
    }

    // adiciona a entidade em determinada fila, se a entidade nao existir, create uma nova
    public void addEntity(String queue, Entity entity){

        // verifica se existe a fila
        if (this.entityQueue.containsKey(queue)){
            this.entityQueue.get(queue).addEntity(entity);
        }else{
            // adciona uma fila nova e ja adiciona a entity
            this.entityQueue.put(queue, new FilaDeEntidades(FilaDeEntidades.FILA));
            this.entityQueue.get(queue).addEntity(entity);
        }
    }

    // retorna uma entidade da frente da fila de determinada tipo de entidade (ex. navio, equipe)
    public Entity getEntity(String queue){
        if (this.entityQueue.containsKey(queue)){
            return this.entityQueue.get(queue).getEntity();
        }
        return null;
    }

    // retorna uma lista de entidades
    public FilaDeEntidades getEntityQueue(String queue){
        return this.entityQueue.get(queue);
    }
}
