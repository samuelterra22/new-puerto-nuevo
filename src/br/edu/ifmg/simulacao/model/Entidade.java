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

    public Boolean isFree(){
        return getStatus();
    }

    public void lock(){
        this.status = false;
    }

    public void unlock(){
        this.status = true;
    }



    public void setVariable(String variable, Double value){
        this.variables.put(variable, value);
    }

    public void incrementVariable(String variable, Double value){
        this.variables.put(variable, this.variables.get(variable)+value);
    }

    public Double getVariable(String variable){
        if (this.variables.containsKey(variable)){
            return this.variables.get(variable);
        }

        return null;
    }
}
