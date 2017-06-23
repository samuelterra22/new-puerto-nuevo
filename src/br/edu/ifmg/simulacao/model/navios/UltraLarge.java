package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo Ultra Large
 */
public class UltraLarge extends Navio {

    public UltraLarge() {
        setNome("Ultra Large");
        setDescricao("");
        setCapacidadeMinima(14501.0);
        setCapacidadeMaxima(18270.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
