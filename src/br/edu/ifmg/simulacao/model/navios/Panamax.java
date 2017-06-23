package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo Panamax
 */
public class Panamax extends Navio {

    public Panamax() {
        super();
        setNome("Panamax");
        setDescricao("");
        setCapacidadeMinima(3001.0);
        setCapacidadeMaxima(5000.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
