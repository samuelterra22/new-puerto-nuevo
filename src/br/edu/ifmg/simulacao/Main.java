package br.edu.ifmg.simulacao;

/**
 * Classe principal da aplicação.
 * */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Entrada e = new Entrada(System.getProperty("user.dir")+"/cenario.txt");
        Sistema s = e.leArquivo();

        //Distribuicoes d = new Distribuicoes();
        Distribuicoes d = s.getDistribuicoes();
        //d.setTempoChegadaNavio(2.2);
        //System.out.println(d.getTempoChegadaNavio());
        //System.out.println(d.getTempoEquipeAtracamento().getA());
        //System.out.println(d.getTempoEquipeAtracamento().getB());
        //System.out.println(d.getTempoEquipeAtracamento().getC());

        //Entidades en = e.getEntidades();
        //System.out.println(en.getTempoSimulacao());
        //System.out.println(en.getQtdGrua());

        //Distribuicoes d = e.getDistribuicoes();
        //Triangular t = d.getTempoGruaRetornaGuindasteVazio();
        //System.out.println(t.getA());
        //System.out.println(t.getB());
        //System.out.println(t.getC());
        //System.out.println(t.getRandomDistribuicao());

    }
}
