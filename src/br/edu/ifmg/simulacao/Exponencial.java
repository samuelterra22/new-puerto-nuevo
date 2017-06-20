package br.edu.ifmg.simulacao;

/**
 * Classe que representa uma distribuição exponencial na simulação.
 * */
public class Exponencial extends Random{

    private Double lambda;

    public Exponencial(Double lambda) {
        this.lambda = lambda;
    }

    // obtem o valor de lambda
    public Double getLambda() {
        return lambda;
    }

    // seta o valor de lambda
    public void setLambda(Double lambda) {
        this.lambda = lambda;
    }

    // retorna o valor de acordo com a distribuição
    public Double getRandomDistribuicao(){
        return super.exponential(this.lambda);
    }

}
