package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo Small Feeder
 */
public class SmallFeeder extends Navio {

    public SmallFeeder() {
        setNome("Small Feedder");
        setDescricao("");
        setCapacidadeMinima(0.0);
        setCapacidadeMaxima(1000.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
