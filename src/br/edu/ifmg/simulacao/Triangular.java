package br.edu.ifmg.simulacao;

/**
 * Classe que representa uma distribuição triângular na simulação.
 * */
public class Triangular extends Random{

    private Double a;
    private Double b;
    private Double c;

    public Triangular(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // obtem o valor de A
    public Double getA() {
        return a;
    }

    // seta o valor de A
    public void setA(Double a) {
        this.a = a;
    }

    // obtem o valor de B
    public Double getB() {
        return b;
    }

    // seta o valor de B
    public void setB(Double b) {
        this.b = b;
    }

    // obtem o valor de C
    public Double getC() {
        return c;
    }

    // seta o valor de C
    public void setC(Double c) {
        this.c = c;
    }

    // obetem o valor random de acordo com a distribuição
    public Double getRandomDistribuicao(){
        return super.triangular(this.a, this.b, this.c);
    }
}
