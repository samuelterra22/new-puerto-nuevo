package br.edu.ifmg.simulacao.model.navios;

import br.edu.ifmg.simulacao.model.Entidade;

/**
 * Classe abstrata que implementa os metodos do navio
 */
public abstract class Navio extends Entidade{

    private String nome;
    private String descricao;
    private Double capacidadeMinima;
    private Double capacidadeMaxima;
    private int quantidadeDeContainers;

    public Navio() {
        super("Navio");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeDeContainers() {
        return this.quantidadeDeContainers;
    }

    private void setQuantidadeDeContainers(int numeroContainer) {
        this.quantidadeDeContainers = numeroContainer;
    }

    public Double getCapacidadeMinima() {
        return capacidadeMinima;
    }

    public void setCapacidadeMinima(Double capacidadeMinima) {
        this.capacidadeMinima = capacidadeMinima;
    }

    public Double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Double capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void sorteiaQuantidadeDeContainers(){
        int qtdContainers = (int) ((Math.random() * (this.getCapacidadeMaxima() - this.getCapacidadeMinima())) +
                this.getCapacidadeMinima());
        this.setQuantidadeDeContainers(qtdContainers);
    }

    @Override
    public String toString() {
        return "Navio{" +
                "livre='" + super.isLivre() + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", capacidadeMinima=" + capacidadeMinima +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", quantidadeDeContainers=" + quantidadeDeContainers +
                '}';
    }
}
