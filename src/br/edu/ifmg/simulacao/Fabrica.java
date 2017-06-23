package br.edu.ifmg.simulacao;


import br.edu.ifmg.simulacao.model.ComposicaoFerroviaria;
import br.edu.ifmg.simulacao.model.navios.*;

/**
 * Classe Fabrica responsável por ser os 'nascedouros' de navios e composições ferroviárias da simulação.
 * */
public class Fabrica {

    private static final int FEEDER       = 0;
    private static final int FEEDER_MAX   = 1;
    private static final int NEW_PANAMAX  = 2;
    private static final int PANAMAX      = 3;
    private static final int POST_PANAMAX = 4;
    private static final int SMALL_FEEDER = 5;
    private static final int ULTRA_LARGE  = 6;

    private static Navio instanciaNavio(int tipo){

        switch (tipo){
            case FEEDER: {
                return new Feeder();
            }
            case FEEDER_MAX: {
                return  new FeederMax();
            }
            case NEW_PANAMAX: {
                return new NewPanamax();
            }
            case PANAMAX: {
                return new Panamax();
            }
            case POST_PANAMAX: {
                return new PostPanamax();
            }
            case SMALL_FEEDER: {
                return new SmallFeeder();
            }
            case ULTRA_LARGE: {
                return new UltraLarge();
            }
            default:{
                throw new IllegalArgumentException("Tipo invalido!");
            }
        }

    }

    public static Navio criaNavio(){
        int tipo = (int) ((Math.random() * 7) + 0); // faz o sorteio de 0 a 6
        return instanciaNavio(tipo);
    }

    public static ComposicaoFerroviaria criaComposicaoFerroviaria(Integer min, Integer max){
        int capacidadeDeVagoes = (int) ((Math.random() * (max - min)) + min);
        ComposicaoFerroviaria composicaoFerroviaria = new ComposicaoFerroviaria();
        composicaoFerroviaria.setCapacidadeDeVagoes(capacidadeDeVagoes);
        return composicaoFerroviaria;
    }

}
