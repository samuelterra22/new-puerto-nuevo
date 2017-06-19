package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.model.ConjuntoDeFilasDoSistema;
import br.edu.ifmg.simulacao.model.FilaDeEntidades;
import br.edu.ifmg.simulacao.model.Grua;

import java.util.List;

/**
 * Classe principal da aplicação.
 * */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Entrada e = new Entrada(System.getProperty("user.dir")+"/cenario.txt");
        Sistema s = e.leArquivo();

        //Distribuicoes d = new Distribuicoes();
        //Distribuicoes d = s.getDistribuicoes();
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

        //ConjuntoDeFilasDoSistema conjuntoDeFilasDoSistema = new ConjuntoDeFilasDoSistema();
        //Grua grua1 = new Grua();
        //Grua grua2 = new Grua();
        //conjuntoDeFilasDoSistema.addEntidade("G", grua1);
        //conjuntoDeFilasDoSistema.addEntidade("G", grua2);

        //FilaDeEntidades a = conjuntoDeFilasDoSistema.getFilaDeEntidades("G");
        //Grua g = (Grua)conjuntoDeFilasDoSistema.getEntidade("G");
        //Grua g1 = (Grua)conjuntoDeFilasDoSistema.getEntidade("G");
        //Grua g2 = (Grua)conjuntoDeFilasDoSistema.getEntidade("G");

        //System.out.println(a.getSize());

    }
}
