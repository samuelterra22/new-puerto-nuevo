package br.edu.ifmg.simulacao.model;

import java.util.Map;

/**
 * Created by dicus on 07/05/17.
 */
public class Entidade {
    // true  = estidade livre
    // false = estidade ocupada
    private Boolean status;
    private Map<String,Double> variables;

    private Boolean getStatus() {
        return status;
    }

    private void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean isLivre(){
        return getStatus();
    }

    public void reserva(){
        this.status = false;
    }

    public void libera(){
        this.status = true;
    }
}
