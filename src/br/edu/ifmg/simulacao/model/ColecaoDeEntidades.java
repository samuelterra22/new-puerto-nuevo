package br.edu.ifmg.simulacao.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Entitycolection
 * Esta é uma estrutura de dados projetada para itens de entidade não consumíveis na loja, ou seja, um item
 * persiste na estrutura de dados depois que foi acessado pelo método de obtenção
 */

public class ColecaoDeEntidades {
    private List<Entidade> colecaoDeEntidade;

    public ColecaoDeEntidades(){
        this.colecaoDeEntidade = new ArrayList<>();
    }

    public void addEntidade(Entidade entidade){
        this.colecaoDeEntidade.add(entidade);
    }

    public Entidade getEntidade(int i){
        return this.colecaoDeEntidade.get(i);
    }

    public Entidade destroeEntidade(int i){
        return this.colecaoDeEntidade.remove(i);
    }

    public List<Entidade> getColecaoDeEntidade(){
        return this.colecaoDeEntidade;
    }

    public boolean temEntidade(){
        return this.colecaoDeEntidade.size() > 0;
    }

    public Entidade reservaEntidade(){
        for (Entidade e : this.colecaoDeEntidade) {
            if (e.isLivre()){
                this.colecaoDeEntidade.remove(e);
                e.reserva();
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ColecaoDeEntidades{" +
                "colecaoDeEntidade=" + colecaoDeEntidade +
                '}';
    }
}