package br.edu.ifmg.simulacao;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Simulacao s = new Simulacao();

        s.leArquivo( System.getProperty("user.dir")+"/cenario.txt");

    }
}
