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

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getRandomDistribuicao(){
        return super.triangular(this.a, this.b, this.c);
    }
}
