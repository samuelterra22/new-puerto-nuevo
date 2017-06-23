package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo New Panamax
 */
public class NewPanamax extends Navio {

    public NewPanamax() {
        setNome("New Panamax");
        setDescricao("");
        setCapacidadeMinima(10001.0);
        setCapacidadeMaxima(14500.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
