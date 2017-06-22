package br.edu.ifmg.simulacao.model;

/**
 * Esta classe é herdada pelas demais entidades
 * */
public class Entidade {
    // true  = estidade livre
    // false = estidade ocupada
    private Boolean status;
    private String tipo;

    public Entidade(String tipo) {
        this.status = true; // inicia como livre
        this.tipo = tipo;
    }

    // obetem o status da entidade
    private Boolean getStatus() {
        return status;
    }

    // seta o status da entidade
    private void setStatus(Boolean status) {
        this.status = status;
    }

    // verifica se a entidade esta livre
    public Boolean isLivre(){
        return getStatus();
    }

    // reserva a entidade para determinada tarefa
    public void reserva(){
        this.status = false;
    }

    // libera a entidade, usado no fim de alguma atividade
    public void libera(){
        this.status = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
