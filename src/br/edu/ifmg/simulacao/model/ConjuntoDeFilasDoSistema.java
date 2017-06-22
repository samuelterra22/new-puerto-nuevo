package br.edu.ifmg.simulacao.model;

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

    // adiciona a entidade em determinada fila, se a entidade nao existir, create uma nova
    public void addEntidade(String fila, Entidade entidade){

        // verifica se existe a fila
        if (this.filaDeEntidades.containsKey(fila)){
            this.filaDeEntidades.get(fila).addEntity(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.filaDeEntidades.put(fila, new FilaDeEntidades(FILA));
            this.filaDeEntidades.get(fila).addEntity(entidade);
        }
    }

    // retorna uma entidade da frente da fila de determinada tipo de entidade (ex. navio, equipe)
    public Entidade getEntidade(String fila){
        if (this.filaDeEntidades.containsKey(fila)){
            return this.filaDeEntidades.get(fila).getEntidade();
        }
        return null;
    }

    // retorna uma lista de entidades
    public FilaDeEntidades getFilaDeEntidades(String fila){
        return this.filaDeEntidades.get(fila);
    }

}
