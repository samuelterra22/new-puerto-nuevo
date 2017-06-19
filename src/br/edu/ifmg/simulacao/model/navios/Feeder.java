package br.edu.ifmg.simulacao.model.navios;

/**
 * Created by samuel on 13/03/17.
 */
public class Feeder extends Navio {

    public Feeder() {
        this.setNome("Feedder");
        this.setDescricao("");
        this.setCapacidadeMinima(1001.0);
        this.setCapacidadeMaxima(2000.0);
    }
}
