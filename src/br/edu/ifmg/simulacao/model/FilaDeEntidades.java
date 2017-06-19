package br.edu.ifmg.simulacao.model;

import java.util.ArrayList;
import java.util.List;

/**
 * FilaDeEntidades
 *
 * Esta é uma estrutura de dados projetada para itens de entidade consumíveis na loja, em outras palavras,
 * uma vez que um item foi acessado pelo método get, ele é removido da lista de entidades.
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

    public void addEntity(Entidade entidade) {
        this.listaDeEntidades.add(entidade);
    }

    public void addEntity(int i, Entidade Entidade) {
        if (this.politica == LISTA) {
            this.listaDeEntidades.add(i, Entidade);
        }
    }

    public Entidade getEntidade() { // rever o nome do metodo
        if (this.politica == PILHA) {
            return this.desempilha();
        } else {
            return this.tiraDaFila();
        }
    }

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

    private Entidade tiraDaFila() {
        if (this.listaDeEntidades.size() > 0) {
            Entidade Entidade = this.listaDeEntidades.get(0);
            this.listaDeEntidades.remove(0);
            return Entidade;
        } else {
            return null;
        }
    }

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

    public int getSize(){
        return listaDeEntidades.size();
    }
}
