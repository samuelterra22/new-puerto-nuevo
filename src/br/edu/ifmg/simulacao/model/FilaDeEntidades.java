package br.edu.ifmg.simulacao.model;

import java.util.ArrayList;
import java.util.List;

/**
 * FilaDeEntidades
 *
 * Esta é uma estrutura de dados realiza as operações das politicas de Lista, Fila e Pilha.
 */

public class FilaDeEntidades {
    private static int LISTA = 0;
    private static int FILA = 1;
    private static int PILHA = 2;

    private int politica;
    private List<Entidade> listaDeEntidades;

    public FilaDeEntidades() {
        this.politica = LISTA;
        this.listaDeEntidades = new ArrayList<>();
    }

    public FilaDeEntidades(int politica) {
        this.politica = politica;
        this.listaDeEntidades = new ArrayList<>();
    }

    // metodo para adicionar entidade na lista de entidades
    public void addEntidade(Entidade entidade) {
        this.listaDeEntidades.add(entidade);
    }

    public void addEntidade(int i, Entidade Entidade) {
        if (this.politica == LISTA) {
            this.listaDeEntidades.add(i, Entidade);
        }
    }

    // metodo que indiferente do tipo de politica, retira da estrutura e retorna o objeto
    public Entidade getEntidade() {
        if (this.politica == PILHA) {
            return this.desempilha();
        } else {
            return this.tiraDaFila();
        }
    }

    // metodo que indiferente do tipo de politica, retira da estrutura e retorna o objeto desejado
    public Entidade getEntidade(int i) {
        if (this.politica == LISTA) {
            if (this.listaDeEntidades.size() >= i) {
                Entidade Entidade = this.listaDeEntidades.get(i);
                this.listaDeEntidades.remove(i);
                return Entidade;
            } else {
                return null;
            }
        } else if (this.politica == FILA) {
            return this.tiraDaFila();
        } else if (this.politica == PILHA) {
            return this.desempilha();
        }
        return null;
    }

    // metodo que retira da fila e retorna a entidade
    private Entidade tiraDaFila() {
        if (this.listaDeEntidades.size() > 0) {
            Entidade entidade = this.listaDeEntidades.get(0);
            this.listaDeEntidades.remove(0);
            return entidade;
        } else {
            return null;
        }
    }

    // metodo que desempilha e retorna o objeto
    private Entidade desempilha() {
        if (this.listaDeEntidades.size() > 0) {
            Entidade Entidade = this.listaDeEntidades.get(this.listaDeEntidades.size() - 1);
            this.listaDeEntidades.remove(this.listaDeEntidades.size() - 1);
            return Entidade;
        } else {
            return null;
        }
    }

    //retorna se possui entidades
    public boolean disponivel() {
        return this.listaDeEntidades.size() > 0;
    }

    // retorna o tamanho da lista de entidades
    public int getSize(){
        return listaDeEntidades.size();
    }
}
