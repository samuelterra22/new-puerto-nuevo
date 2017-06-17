package br.edu.ifmg.simulacao;

public class Exponencial extends Random{

    private Double lambda;

    public Exponencial(Double lambda) {
        this.lambda = lambda;
    }

    public Double getLambda() {
        return lambda;
    }

    public void setLambda(Double lambda) {
        this.lambda = lambda;
    }

    public Double getRandomDistribuicao(){
        return super.exponential(this.lambda);
    }

}
