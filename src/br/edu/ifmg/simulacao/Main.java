package br.edu.ifmg.simulacao;

/**
 * Classe principal da aplicação.
 * */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Entrada e = new Entrada(System.getProperty("user.dir")+"/cenario.txt");

        //Distribuicoes d = new Distribuicoes();
        //d.setTempoChegadaNavio(2.2);
        //System.out.println(d.getTempoChegadaNavio());

        Entidades en = e.getEntidades();
        //System.out.println(en.getTempoSimulacao());
        //System.out.println(en.getQtdGrua());

    }
}
