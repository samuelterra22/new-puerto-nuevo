package br.edu.ifmg.simulacao.model.navios;

/**
 * Entidade navio do tipo Post Panamax
 */
public class PostPanamax extends Navio {

    public PostPanamax() {
        setNome("Post Panamax");
        setDescricao("");
        setCapacidadeMinima(5.101);
        setCapacidadeMaxima(10000.0);
        super.sorteiaQuantidadeDeContainers();
    }
}
