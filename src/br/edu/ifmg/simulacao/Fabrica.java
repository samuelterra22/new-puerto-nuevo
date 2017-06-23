package br.edu.ifmg.simulacao;


import br.edu.ifmg.simulacao.model.navios.*;


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
                break;
            }
            case FEEDER_MAX: {
                return  new FeederMax();
                break;
            }
            case NEW_PANAMAX: {
                return new NewPanamax();
                break;
            }
            case PANAMAX: {
                return new Panamax();
                break;
            }
            case POST_PANAMAX: {
                return new PostPanamax();
                break;
            }
            case SMALL_FEEDER: {
                return new SmallFeeder();
                break;
            }
            case ULTRA_LARGE: {
                return new UltraLarge();
                break;
            }
            default:{
                throw new IllegalArgumentException("Tipo invalido!");
                break;
            }
        }

    }

    public static Navio criaNavio(){
        int tipo = (int) ((Math.random() * 7) + 0); // faz o sorteio de 0 a 6
        return instanciaNavio(tipo);
    }

}
