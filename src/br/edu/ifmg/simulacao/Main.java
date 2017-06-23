package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.Eventos.EventNotice;
import br.edu.ifmg.simulacao.model.*;
import br.edu.ifmg.simulacao.model.navios.Navio;
import br.edu.ifmg.simulacao.model.navios.Panamax;

import java.util.*;
import java.util.Random;

/**
 * Classe principal da aplicação.
 * */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Entrada e = new Entrada(System.getProperty("user.dir")+"/cenario.txt");
        //Sistema s = e.leArquivo();

        //int max = 1000;
        //double min = max*0.7;

        //int x = (int) ((Math.random() * (max - min)) + min);

        //System.out.println(x);

        //Navio navio = new Panamax();

        //System.out.println("Qtd min: "+navio.getCapacidadeMinima());
        //System.out.println("Qtd max: "+navio.getCapacidadeMaxima());
        //System.out.println(navio.getQuantidadeDeContainers());

        //System.out.println(s.getDistribuicoes().getTempoNavioChegada().getRandomDistribuicao());

        //ConjuntoDeEntidades conjuntoDeEntidades = s.getConjuntoDeEntidades();

        //System.out.println(conjuntoDeEntidades.getColecao("G").getColecaoDeEntidade().size());
        //Grua g = s.reservaGrua();
        //System.out.println(conjuntoDeEntidades.getColecao("G").getColecaoDeEntidade().size());
        //Grua g1 = s.liberaGrua(g);
        //System.out.println(conjuntoDeEntidades.getColecao("G").getColecaoDeEntidade().size());

        //System.out.println(conjuntoDeEntidades.toString());
        //System.out.println(g.toString());

        //System.out.println(s.toString());

        //ConjuntoDeEntidades ce = s.getConjuntoDeEntidades();
        //Grua g = s.reservaGrua();
        //Grua g1 = s.reservaGrua();
        //Grua g2 = s.reservaGrua();
        //Grua g3 = s.reservaGrua();
        //Grua g4 = s.reservaGrua();
        //Grua g5 = s.reservaGrua();
        //System.out.println(g2.toString());

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
        //ConjuntoDeEntidades ce = s.getConjuntoDeEntidades();
        //Grua g = ce.getGruaDisponivel();

        //System.out.println(ce.gruaDisponivel());

        //EventNotice eventNotice = new EventNotice();
        //eventNotice.setHoraInicio(1.5);
        //eventNotice.setHoraFim(2.6);

        //EventNotice eventNotice1 = new EventNotice();
        //eventNotice1.setHoraInicio(6.5);
        //eventNotice1.setHoraFim(13.6);

        //EventNotice eventNotice3 = new EventNotice();
        //eventNotice3.setHoraInicio(0.1);
        //eventNotice3.setHoraFim(1.6);

        //Fel fel = new Fel();

        //fel.insere(eventNotice1);
        //fel.insere(eventNotice);
        //fel.insere(eventNotice3);
        //fel.remove();
        //fel.toString();

        //ConjuntoDeFilasDoSistema conjuntoDeFilasDoSistema = new ConjuntoDeFilasDoSistema();
        //Panamax panamax = new Panamax();
        //System.out.println(panamax.toString());
        //conjuntoDeFilasDoSistema.addFilaNavioAguardarCais(panamax);
        //Navio g = conjuntoDeFilasDoSistema.consomeFilaNavioAguardarCais();
        //System.out.println(g.toString());

    }
}
