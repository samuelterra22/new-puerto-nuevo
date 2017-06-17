package br.edu.ifmg.simulacao;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que guarda os valores do arquivo de entrada e retorna os valores das distribuições.
 */
public class Distribuicoes {

    /* HashMap para guardar as entradas com os valores das distibuições */
    private Map<Integer, Random> distribuicoes;

    /* Constantes */

    private final int N_CHG = 0;    // Tempo de chegada de navios

    private final int G_ICA = 1;    // Tempo de Icamento da Grua
    private final int G_MCH = 2;    // Tempo de Movimentar Container Cheio
    private final int G_MCA = 3;    // Tempo de Movimentar Container ate Caminhao
    private final int G_RET = 4;    // Tempo de Retornar Guindaste Vazio

    private final int E_ATR = 5;    // Tempo de atracamento da equipe
    private final int E_DTR = 6;    // Tempo de desatracamento da equipe

    private final int C_MVZ = 7;    // Tempo de Movimentar Vazio das carretas
    private final int C_MCH = 8;    // Tempo de Movimentando Carregado das carretas

    private final int R_DCG = 9;    // Tempo de descarga de container no patio, retirando do caminhao (RTG)
    private final int R_MCP = 10;    // Tempo de movimentar container para pilha de destino (RTG)
    private final int R_EMP = 11;    // Tempo de empilhamento de container na pilha do patio (RTG)

    private final int S_DCG = 12;    // Tempo de descarga de container no patio, retirando do caminhao (Reach)
    private final int S_MCP = 13;    // Tempo de movimentar ate pilha de origem ou destino (Reach)
    private final int S_EMP = 14;    // Tempo de empilhamento de container na pilha do patio (Reach)
    private final int S_DMP = 15;    // Tempo de desempilhamento de container da pilha (Reach)
    private final int S_MTF = 16;    // Tempo para movimentar container ate' terminal ferroviario (Reach)
    private final int S_MCV = 17;    // Tempo de carregar container em vagao (Reach)
    private final int S_MVP = 18;    // Tempo de movimentar vazio ate' o patio (Reach)

    private final int T_CHG = 19;    // Tempo de chegada de composicoes no terminal ferroviario (Comp. Ferroviaria)
    private final int T_POS = 20;    // Tempo para posicionar no terminal (Comp. Ferroviaria)
    private final int T_LIB = 21;    // Tempo para ser liberado do terminal (Comp. Ferroviaria)

    /* Construtor */
    public Distribuicoes() {
        this.distribuicoes = new HashMap<Integer, Random>();
    }

    /*******************************************************************************************************************
     *  Navio - Tempo de chegada de navios
     ******************************************************************************************************************/
    public void setTempoNavioChegada(Double lamb){
        distribuicoes.put(N_CHG, new Exponencial(lamb));
    }

    public Exponencial getTempoNavioChegada(){
        return (Exponencial) this.distribuicoes.get(N_CHG);
    }

    public Double getTempoRandomNavioChegada(){
        Exponencial e = (Exponencial) this.distribuicoes.get(N_CHG);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Grua - Tempo de Icamento da Grua
     ******************************************************************************************************************/
    public void setTempoGruaIcamento(Double a, Double b, Double c){
        distribuicoes.put(G_ICA, new Triangular(a,b,c));
    }

    public Triangular getTempoGruaIcamento(){
        return (Triangular) this.distribuicoes.get(G_ICA);
    }

    public Double getTempoRandomGruaIcamento(){
        Triangular e = (Triangular) this.distribuicoes.get(G_ICA);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Grua - Tempo de Movimentar Container Cheio
     ******************************************************************************************************************/
    public void setTempoGruaMovimentaContainerCheio(Double a, Double b, Double c){
        distribuicoes.put(G_MCH, new Triangular(a,b,c));
    }

    public Triangular getTempoGruaMovimentaContainerCheio(){
        return (Triangular) this.distribuicoes.get(G_MCH);
    }

    public Double getTempoRandomGruaMovimentaContainerCheio(){
        Triangular e = (Triangular) this.distribuicoes.get(G_MCH);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Grua - Tempo de Movimentar Container ate Caminhao
     ******************************************************************************************************************/
    public void setTempoGruaMovimentaContainerCaminhao(Double a, Double b, Double c){
        distribuicoes.put(G_MCA, new Triangular(a,b,c));
    }

    public Triangular getTempoGruaMovimentaContainerCaminhao(){
        return (Triangular) this.distribuicoes.get(G_MCA);
    }

    public Double getTempoRandomGruaMovimentaContainerCaminhao(){
        Triangular e = (Triangular) this.distribuicoes.get(G_MCA);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Grua - Tempo de Retornar Guindaste Vazio
     ******************************************************************************************************************/
    public void setTempoGruaRetornaGuindasteVazio(Double a, Double b, Double c){
        distribuicoes.put(G_RET, new Triangular(a,b,c));
    }

    public Triangular getTempoGruaRetornaGuindasteVazio(){
        return (Triangular) this.distribuicoes.get(G_RET);
    }

    public Double getTempoRandomGruaRetornaGuindasteVazio(){
        Triangular e = (Triangular) this.distribuicoes.get(G_RET);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Equipe - Tempo de atracamento da equipe
     ******************************************************************************************************************/
    public void setTempoEquipeAtracamento(Double a, Double b, Double c){
        distribuicoes.put(E_ATR, new Triangular(a,b,c));
    }

    public Triangular getTempoEquipeAtracamento(){
        return (Triangular) this.distribuicoes.get(E_ATR);
    }

    public Double getTempoRandomEquipeAtracamento(){
        Triangular e = (Triangular) this.distribuicoes.get(E_ATR);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Equipe - Tempo de desatracamento da equipe
     ******************************************************************************************************************/
    public void setTempoEquipeDesatracamento(Double a, Double b, Double c){
        distribuicoes.put(E_DTR, new Triangular(a,b,c));
    }

    public Triangular getTempoEquipeDesatracamento(){
        return (Triangular) this.distribuicoes.get(E_DTR);
    }

    public Double getTempoRandomEquipeDesatracamento(){
        Triangular e = (Triangular) this.distribuicoes.get(E_DTR);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Carretas - Tempo de Movimentar Vazio das carretas
     ******************************************************************************************************************/
    public void setTempoCarretaMovimentaVazio(Double a, Double b, Double c){
        distribuicoes.put(C_MVZ, new Triangular(a,b,c));
    }

    public Triangular getTempoCarretaMovimentaVazio(){
        return (Triangular) this.distribuicoes.get(C_MVZ);
    }

    public Double getTempoRandomCarretaMovimentaVazio(){
        Triangular e = (Triangular) this.distribuicoes.get(C_MVZ);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Carretas - Tempo de Movimentando Carregado das carretas
     ******************************************************************************************************************/
    public void setTempoCarretaMovimentaCarregado(Double a, Double b, Double c){
        distribuicoes.put(C_MCH, new Triangular(a,b,c));
    }

    public Triangular getTempoCarretaMovimentaCarregado(){
        return (Triangular) this.distribuicoes.get(C_MCH);
    }

    public Double getTempoRandomCarretaMovimentaCarregado(){
        Triangular e = (Triangular) this.distribuicoes.get(C_MCH);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  RTG - Tempo de descarga de container no patio, retirando do caminhao
     ******************************************************************************************************************/
    public void setTempoRtgDescarregaContainerPatio(Double a, Double b, Double c){
        distribuicoes.put(R_DCG, new Triangular(a,b,c));
    }

    public Triangular getTempoRtgDescarregaContainerPatio(){
        return (Triangular) this.distribuicoes.get(R_DCG);
    }

    public Double getTempoRandomRtgDescarregaContainerPatio(){
        Triangular e = (Triangular) this.distribuicoes.get(R_DCG);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  RTG - Tempo de movimentar container para pilha de destino
     ******************************************************************************************************************/
    public void setTempoRtgMovimentaPilhaDestino(Double a, Double b, Double c){
        distribuicoes.put(R_MCP, new Triangular(a,b,c));
    }

    public Triangular getTempoRtgMovimentaPilhaDestino(){
        return (Triangular) this.distribuicoes.get(R_MCP);
    }

    public Double getTempoRandomRtgMovimentaPilhaDestino(){
        Triangular e = (Triangular) this.distribuicoes.get(R_MCP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  RTG - Tempo de empilhamento de container na pilha do patio
     ******************************************************************************************************************/
    public void setTempoRtgEmpilhaContainerPatio(Double a, Double b, Double c){
        distribuicoes.put(R_EMP, new Triangular(a,b,c));
    }

    public Triangular getTempoRtgEmpilhaContainerPatio(){
        return (Triangular) this.distribuicoes.get(R_EMP);
    }

    public Double getTempoRandomRtgEmpilhaContainerPatio(){
        Triangular e = (Triangular) this.distribuicoes.get(R_EMP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de descarga de container no patio, retirando do caminhao
     ******************************************************************************************************************/
    public void setTempoReachDescarregaContainerPatio(Double a, Double b, Double c){
        distribuicoes.put(S_DCG, new Triangular(a,b,c));
    }

    public Triangular getTempoReachDescarregaContainerPatio(){
        return (Triangular) this.distribuicoes.get(S_DCG);
    }

    public Double getTempoRandomReachDescarregaContainerPatio(){
        Triangular e = (Triangular) this.distribuicoes.get(S_DCG);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de movimentar ate pilha de origem ou destino
     ******************************************************************************************************************/
    public void setTempoReachMovimentaPilhaDestino(Double a, Double b, Double c){
        distribuicoes.put(S_MCP, new Triangular(a,b,c));
    }

    public Triangular getTempoReachMovimentaPilhaDestino(){
        return (Triangular) this.distribuicoes.get(S_MCP);
    }

    public Double getTempoRandomReachMovimentaPilhaDestino(){
        Triangular e = (Triangular) this.distribuicoes.get(S_MCP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de empilhamento de container na pilha do patio
     ******************************************************************************************************************/
    public void setTempoReachEmpilhaContainerPatio(Double a, Double b, Double c){
        distribuicoes.put(S_EMP, new Triangular(a,b,c));
    }

    public Triangular getTempoReachEmpilhaContainerPatio(){
        return (Triangular) this.distribuicoes.get(S_EMP);
    }

    public Double getTempoRandomReachEmpilhaContainerPatio(){
        Triangular e = (Triangular) this.distribuicoes.get(S_EMP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de desempilhamento de container da pilha
     ******************************************************************************************************************/
    public void setTempoReachDesempilhaContainer(Double a, Double b, Double c){
        distribuicoes.put(S_DMP, new Triangular(a,b,c));
    }

    public Triangular getTempoReachDesempilhaContainer(){
        return (Triangular) this.distribuicoes.get(S_DMP);
    }

    public Double getTempoRandomReachDesempilhaContainer(){
        Triangular e = (Triangular) this.distribuicoes.get(S_DMP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo para movimentar container ate' terminal ferroviario
     ******************************************************************************************************************/
    public void setTempoReachMovimentaContainerTerminal(Double a, Double b, Double c){
        distribuicoes.put(S_MTF, new Triangular(a,b,c));
    }

    public Triangular getTempoReachMovimentaContainerTerminal(){
        return (Triangular) this.distribuicoes.get(S_MTF);
    }

    public Double getTempoRandomReachMovimentaContainerTerminal(){
        Triangular e = (Triangular) this.distribuicoes.get(S_MTF);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de carregar container em vagao
     ******************************************************************************************************************/
    public void setTempoReachCarregaContainerVagao(Double a, Double b, Double c){
        distribuicoes.put(S_MCV, new Triangular(a,b,c));
    }

    public Triangular getTempoReachCarregaContainerVagao(){
        return (Triangular) this.distribuicoes.get(S_MCV);
    }

    public Double getTempoRandomReachCarregaContainerVagao(){
        Triangular e = (Triangular) this.distribuicoes.get(S_MCV);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Reach - Tempo de movimentar vazio ate' o patio
     ******************************************************************************************************************/
    public void setTempoReachMovimentaVazio(Double a, Double b, Double c){
        distribuicoes.put(S_MVP, new Triangular(a,b,c));
    }

    public Triangular getTempoReachMovimentaVazio(){
        return (Triangular) this.distribuicoes.get(S_MVP);
    }

    public Double getTempoRandomReachMovimentaVazio(){
        Triangular e = (Triangular) this.distribuicoes.get(S_MVP);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Comp. Ferroviaria - Tempo de chegada de composicoes no terminal ferroviario
     ******************************************************************************************************************/
    public void setTempoFerroviariaChegada(Double a, Double b, Double c){
        distribuicoes.put(T_CHG, new Triangular(a,b,c));
    }

    public Triangular getTempoFerroviariaChegada(){
        return (Triangular) this.distribuicoes.get(T_CHG);
    }

    public Double getTempoRandomFerroviariaChegada(){
        Triangular e = (Triangular) this.distribuicoes.get(T_CHG);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Comp. Ferroviaria - Tempo para posicionar no terminal
     ******************************************************************************************************************/
    public void setTempoFerroviariaPosicionaTerminal(Double a, Double b, Double c){
        distribuicoes.put(T_POS, new Triangular(a,b,c));
    }

    public Triangular getTempoFerroviariaPosicionaTerminal(){
        return (Triangular) this.distribuicoes.get(T_POS);
    }

    public Double getTempoRandomFerroviariaPosicionaTerminal(){
        Triangular e = (Triangular) this.distribuicoes.get(T_POS);
        return e.getRandomDistribuicao();
    }

    /*******************************************************************************************************************
     *  Comp. Ferroviaria - Tempo para ser liberado do terminal
     ******************************************************************************************************************/
    public void setTempoFerroviariaLiberaTerminal(Double a, Double b, Double c){
        distribuicoes.put(T_LIB, new Triangular(a,b,c));
    }

    public Triangular getTempoFerroviariaLiberaTerminal(){
        return (Triangular) this.distribuicoes.get(T_LIB);
    }

    public Double getTempoRandomFerroviariaLiberaTerminal(){
        Triangular e = (Triangular) this.distribuicoes.get(T_LIB);
        return e.getRandomDistribuicao();
    }
}
