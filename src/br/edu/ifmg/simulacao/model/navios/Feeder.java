package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo Feeder
 */
public class Feeder extends Navio {

    public Feeder() {
        this.setNome("Feedder");
        this.setDescricao("");
        this.setCapacidadeMinima(1001.0);
        this.setCapacidadeMaxima(2000.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
