package br.edu.ifmg.simulacao;

/**
 * Classe que guarda todas as informações sobre as entidades do sistema.
 * */
public class Entidades {

    // qtd de cada entidade
    // entidades disponiveis
    // ocupa entidades
    // libera entidades
    // verifica disponivel

    private int qtdGrua;
    private int qtdEquipe;
    private int qtdCais;
    private int qtdCarreta;
    private int qtdRTG;
    private int qtdReachStacker;
    private int qtdTerminalCarga;

    public Entidades() {    }

    public int getQtdGrua() {
        return qtdGrua;
    }

    public void setQtdGrua(int qtdGrua) {
        this.qtdGrua = qtdGrua;
    }

    public int getQtdEquipe() {
        return qtdEquipe;
    }

    public void setQtdEquipe(int qtdEquipe) {
        this.qtdEquipe = qtdEquipe;
    }

    public int getQtdCais() {
        return qtdCais;
    }

    public void setQtdCais(int qtdCais) {
        this.qtdCais = qtdCais;
    }

    public int getQtdCarreta() {
        return qtdCarreta;
    }

    public void setQtdCarreta(int qtdCarreta) {
        this.qtdCarreta = qtdCarreta;
    }

    public int getQtdRTG() {
        return qtdRTG;
    }

    public void setQtdRTG(int qtdRTG) {
        this.qtdRTG = qtdRTG;
    }

    public int getQtdReachStacker() {
        return qtdReachStacker;
    }

    public void setQtdReachStacker(int qtdReachStacker) {
        this.qtdReachStacker = qtdReachStacker;
    }

    public int getQtdTerminalCarga() {
        return qtdTerminalCarga;
    }

    public void setQtdTerminalCarga(int qtdTerminalCarga) {
        this.qtdTerminalCarga = qtdTerminalCarga;
    }
}
