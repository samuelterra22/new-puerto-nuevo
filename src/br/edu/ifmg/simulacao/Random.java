package br.edu.ifmg.simulacao;

/**
 * Classe que implementa todos os metodos randomicos necessarios.
 * */
public class Random {
    private Double A = 69069.0;
    private int C = 1;
    private Double M = (Double)Math.pow(2, 32);
    private Double currentValue;

    public void setSeed(Double seed){
        this.currentValue = seed;
    }

    //distribuição uniforme e suas variações
    public Double uniform(){
        this.currentValue = ((Double)A*this.currentValue+C)%M;
        return (Double)this.currentValue;
    }

    public Double uniform(Double n){
        //this.currentValue = (Double)(A*this.currentValue+C)%M;
        return this.uniform()%n;
    }

    public Double uniform(Double m, Double n){
        //this.currentValue = (Double)(A*this.currentValue+C)%M;
        return m+this.uniform()%(n-m);
    }

    public Double percentual(){
        //this.currentValue = (C*this.currentValue+A)%M;
        return (Double)this.uniform()/M;
    }

    //funções derivadas da função percentual
    public Double normal(Double mean, Double variance){
        int i, n;
        Double sum;

        n = 128;
        sum = 0.0;
        for(i=0;i<n;i++){
            sum = sum+this.percentual();
        }

        return mean+variance*( ( (sum-(n/2)) / ((Math.sqrt(n/12.0)) ) ) );
    }

    public Double exponential(Double lambda){
        return -(1.0/lambda)*Math.log(1.0-this.percentual());
    }

    public Double triangular(Double a, Double b, Double c){
        Double x;

        x = this.percentual();
        if(x>=a && x<c){
            return (2*(x-a))/((b-a)*(c-a));
        }
        if(x>c && x<=b){
            return (2*(b-x))/((b-a)*(b-c));
        }
        else{
            return 2/(b-a);
        }
    }

    public Double poison(){     //ainda não implementada
        return 0.0;
    }
}
