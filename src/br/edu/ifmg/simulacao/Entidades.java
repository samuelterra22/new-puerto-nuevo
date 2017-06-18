package br.edu.ifmg.simulacao;

/**
 * Classe que guarda todas as informações sobre as entidades do sistema.
 * */
public class Entidades {

    // qtd de cada entidade     ok
    // entidades disponiveis    ok
    // ocupa entidades          ok
    // libera entidades         ok
    // verifica disponivel      ok

    private int qtdGrua;
    private int qtdEquipe;
    private int qtdCais;
    private int qtdCarreta;
    private int qtdRTG;
    private int qtdReachStacker;
    private int qtdTerminalCarga;

    private int qtdMinVagoesComposicao;
    private int qtdMaxVagoesComposicao;

    private Double tempoSimulacao;


    public Entidades() {    }

    /*******************************************************************************************************************
     * Geral
     ******************************************************************************************************************/

    public Double getTempoSimulacao() {
        return tempoSimulacao;
    }

    public void setTempoSimulacao(Double tempoSimulacao) {
        this.tempoSimulacao = tempoSimulacao;
    }

    /*******************************************************************************************************************
     * Grua
     ******************************************************************************************************************/

    public int getQtdGrua() {
        return qtdGrua;
    }

    public void setQtdGrua(int qtdGrua) {
        this.qtdGrua = qtdGrua;
    }

    public void reservaGrua(){
        if (this.qtdGrua > 0)
            this.qtdGrua--;
    }

    public void liberaGrua(){
        if (this.qtdGrua > 0)
            this.qtdGrua++;
    }

    public Boolean gruaDisponivel(){
        return qtdGrua > 0;
    }

    /*******************************************************************************************************************
     * Equipe
     ******************************************************************************************************************/

    public int getQtdEquipe() {
        return qtdEquipe;
    }

    public void setQtdEquipe(int qtdEquipe) {
        this.qtdEquipe = qtdEquipe;
    }

    public void reservaEquipe(){
        if (this.qtdEquipe > 0)
            this.qtdEquipe--;
    }

    public void liberaEquipe(){
        if (this.qtdEquipe > 0)
            this.qtdEquipe++;
    }

    public Boolean equipeDisponivel(){
        return qtdEquipe > 0;
    }

    /*******************************************************************************************************************
     * Cais
     ******************************************************************************************************************/

    public int getQtdCais() {
        return qtdCais;
    }

    public void setQtdCais(int qtdCais) {
        this.qtdCais = qtdCais;
    }

    public void reservaCais(){
        if (this.qtdCais > 0)
            this.qtdCais--;
    }

    public void liberaCais(){
        if (this.qtdCais > 0)
            this.qtdCais++;
    }

    public Boolean caisDisponivel(){
        return qtdCais > 0;
    }

    /*******************************************************************************************************************
     * Carreta
     ******************************************************************************************************************/

    public int getQtdCarreta() {
        return qtdCarreta;
    }

    public void setQtdCarreta(int qtdCarreta) {
        this.qtdCarreta = qtdCarreta;
    }

    public void reservaCarreta(){
        if (this.qtdCarreta > 0)
            this.qtdCarreta--;
    }

    public void liberaCarreta(){
        if (this.qtdCarreta > 0)
            this.qtdCarreta++;
    }

    public Boolean carretaDisponivel(){
        return qtdCarreta > 0;
    }

    /*******************************************************************************************************************
     * RTG
     ******************************************************************************************************************/

    public int getQtdRTG() {
        return qtdRTG;
    }

    public void setQtdRTG(int qtdRTG) {
        this.qtdRTG = qtdRTG;
    }

    public void reservaRTG(){
        if (this.qtdRTG > 0)
            this.qtdRTG--;
    }

    public void liberaRTG(){
        if (this.qtdRTG > 0)
            this.qtdRTG++;
    }

    public Boolean rtgDisponivel(){
        return qtdRTG > 0;
    }

    /*******************************************************************************************************************
     * Reach Stacker
     ******************************************************************************************************************/

    public int getQtdReachStacker() {
        return qtdReachStacker;
    }

    public void setQtdReachStacker(int qtdReachStacker) {
        this.qtdReachStacker = qtdReachStacker;
    }

    public void reservaReachStacker(){
        if (this.qtdReachStacker > 0)
            this.qtdReachStacker--;
    }

    public void liberaReachStacker(){
        if (this.qtdReachStacker > 0)
            this.qtdReachStacker++;
    }

    public Boolean reachStackerDisponivel(){
        return qtdReachStacker > 0;
    }

    /*******************************************************************************************************************
     * Terminal de carga - Composição ferroviaria
     ******************************************************************************************************************/

    public int getQtdTerminalCarga() {
        return qtdTerminalCarga;
    }

    public void setQtdTerminalCarga(int qtdTerminalCarga) {
        this.qtdTerminalCarga = qtdTerminalCarga;
    }


    public int getQtdMinVagoesComposicao() {
        return qtdMinVagoesComposicao;
    }

    public void setQtdMinVagoesComposicao(int qtdMinVagoesComposicao) {
        this.qtdMinVagoesComposicao = qtdMinVagoesComposicao;
    }

    public int getQtdMaxVagoesComposicao() {
        return qtdMaxVagoesComposicao;
    }

    public void setQtdMaxVagoesComposicao(int qtdMaxVagoesComposicao) {
        this.qtdMaxVagoesComposicao = qtdMaxVagoesComposicao;
    }

    public void reservaTerminalCarga(){
        if (this.qtdTerminalCarga > 0)
            this.qtdTerminalCarga--;
    }

    public void liberaTerminalCarga(){
        if (this.qtdTerminalCarga > 0)
            this.qtdTerminalCarga++;
    }

    public Boolean terminalCargaDisponivel(){
        return qtdTerminalCarga > 0;
    }
}
