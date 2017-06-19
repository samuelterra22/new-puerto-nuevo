package br.edu.ifmg.simulacao.model.navios;

public abstract class Navio {

    private String nome;
    private String descricao;
    private Double capacidadeMinima;
    private Double capacidadeMaxima;
    private int numeroContainer;

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

    public int getNumeberOfContainers() {
        return this.numeroContainer;
    }

    public void setNumeberOfContainers(int numeroContainer) {
        this.numeroContainer = numeroContainer;
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
}
