package br.edu.ifmg.simulacao;

import br.edu.ifmg.simulacao.model.*;

/**
 * Classe que contem todas as variaveis (Conjunto, filas, Distribuições) do sistema para realizar a simulação.
 */
public class Sistema {

    // Distribuições obetidas apartir do arquivo de entrada
    private Distribuicoes distribuicoes;
    // Conjunto de entidades
    private ConjuntoDeEntidades conjuntoDeEntidades;
    // Quantidade minima de vagoes na composicao
    private Integer T_MIN;
    // Quantidade maxima de vagoes na composicao
    private Integer T_MAX;
    // Tempo da simulação
    private Double tempoDeSimulacao;
    // Conjunto de filas do sistema
    private ConjuntoDeFilasDoSistema filasDoSistema;

    public Sistema() {
        this.distribuicoes = new Distribuicoes();
        this.conjuntoDeEntidades = new ConjuntoDeEntidades();
    }

    /*******************************************************************************************************************
     * Distribuições
     ******************************************************************************************************************/
    public Distribuicoes getDistribuicoes() {
        return distribuicoes;
    }

    public void setDistribuicoes(Distribuicoes distribuicoes) {
        this.distribuicoes = distribuicoes;
    }

    /*******************************************************************************************************************
     * Conjuntos de entidades
     ******************************************************************************************************************/
    public ConjuntoDeEntidades getConjuntoDeEntidades() {
        return conjuntoDeEntidades;
    }

    public void setConjuntoDeEntidades(ConjuntoDeEntidades conjuntoDeEntidades) {
        this.conjuntoDeEntidades = conjuntoDeEntidades;
    }

    /*******************************************************************************************************************
     * Quantidade minima de vagoes na composição
     ******************************************************************************************************************/
    public Integer getT_MIN() {
        return T_MIN;
    }

    public void setT_MIN(Integer t_MIN) {
        T_MIN = t_MIN;
    }

    /*******************************************************************************************************************
     * Quantidade maxima de vagoes na composição
     ******************************************************************************************************************/
    public Integer getT_MAX() {
        return T_MAX;
    }

    public void setT_MAX(Integer t_MAX) {
        T_MAX = t_MAX;
    }

    /*******************************************************************************************************************
     * Tempo de simulação
     ******************************************************************************************************************/
    public Double getTempoDeSimulacao() {
        return tempoDeSimulacao;
    }

    public void setTempoDeSimulacao(Double tempoDeSimulacao) {
        this.tempoDeSimulacao = tempoDeSimulacao;
    }


    /*******************************************************************************************************************
     * Conjunto de filas do sistema
     ******************************************************************************************************************/
    public ConjuntoDeFilasDoSistema getFilasDoSistema() {
        return filasDoSistema;
    }

    public void setFilasDoSistema(ConjuntoDeFilasDoSistema filasDoSistema) {
        this.filasDoSistema = filasDoSistema;
    }

    /*******************************************************************************************************************
     *                              Manipulação das Entidades do Sistema
     ******************************************************************************************************************/
    // grua
    public boolean temGruaDisponivel(){
        return this.conjuntoDeEntidades.gruaDisponivel();
    }

    public Grua getGruaDisponivel(){
        return this.conjuntoDeEntidades.getGruaDisponivel();
    }

    public Grua reservaGrua(){
        return this.conjuntoDeEntidades.reservaGrua();
    }

    public Grua liberaGrua(Grua grua){
        return this.conjuntoDeEntidades.liberaGrua(grua);
    }

    public int quantidadeGruasDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeGruasDisponiveis();
    }

    // equipe
    public boolean temEquipeDisponivel(){
        return this.conjuntoDeEntidades.equipeDisponivel();
    }

    public Equipe getEquipeDisponivel(){
        return this.conjuntoDeEntidades.getEquipeDisponivel();
    }

    public Equipe reservaEquipe(){
        return this.conjuntoDeEntidades.reservaEquipe();
    }

    public Equipe liberaEquipe(Equipe equipe){
        return this.conjuntoDeEntidades.liberaEquipe(equipe);
    }

    public int quantidadeEquipessDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeEquipesDisponiveis();
    }

    // cais
    public boolean temCaisDisponivel(){
        return this.conjuntoDeEntidades.caisDisponivel();
    }

    public Cais getCaisDisponivel(){
        return this.conjuntoDeEntidades.getCaisDisponivel();
    }

    public Cais reservaCais(){
        return this.conjuntoDeEntidades.reservaCais();
    }

    public Cais liberaCais(Cais cais){
        return this.conjuntoDeEntidades.liberaCais(cais);
    }

    public int quantidadeCaisDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeCaisDisponiveis();
    }

    // carreta
    public boolean temCarretaDisponivel(){
        return this.conjuntoDeEntidades.carretaDisponivel();
    }

    public Carreta getCarretaDisponivel(){
        return this.conjuntoDeEntidades.getCarretaDisponivel();
    }

    public Carreta reservaCarreta(){
        return this.conjuntoDeEntidades.reservaCarreta();
    }

    public Carreta liberaCais(Carreta carreta){
        return this.conjuntoDeEntidades.liberaCarreta(carreta);
    }

    public int quantidadeCarretasDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeCarretasDisponiveis();
    }

    // RTG
    public boolean temRtgDisponivel(){
        return this.conjuntoDeEntidades.rtgDisponivel();
    }

    public RTG getRtgDisponivel(){
        return this.conjuntoDeEntidades.getRtgDisponivel();
    }

    public RTG reservaRtg(){
        return this.conjuntoDeEntidades.reservaRtg();
    }

    public RTG liberaRtg(RTG rtg){
        return this.conjuntoDeEntidades.liberaRtg(rtg);
    }

    public int quantidadeRtgsDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeRtgsDisponiveis();
    }

    // Reach Stacker
    public boolean temReachStackerDisponivel(){
        return this.conjuntoDeEntidades.reachStackerDisponivel();
    }

    public ReachStacker getReachStackerDisponivel(){
        return this.conjuntoDeEntidades.getReachStackerDisponivel();
    }

    public ReachStacker reservaReachStacker(){
        return this.conjuntoDeEntidades.reservaReachStacker();
    }

    public ReachStacker liberaReachStacker(ReachStacker reachStacker){
        return this.conjuntoDeEntidades.liberaReachStacker(reachStacker);
    }

    public int quantidadeReachStackersDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeReachStackersDisponiveis();
    }

    // Terminal de carga
    public boolean temTerminalDeCArgaDisponivel(){
        return this.conjuntoDeEntidades.terminalDeCargaDisponivel();
    }

    public TerminalDeCarga getTerminalDeCargaDisponivel(){
        return this.conjuntoDeEntidades.getTerminalDeCargaDisponivel();
    }

    public TerminalDeCarga reservaTerminalDeCarga(){
        return this.conjuntoDeEntidades.reservaTerminalDeCarga();
    }

    public TerminalDeCarga liberaTerminalDeCarga(TerminalDeCarga terminalDeCarga){
        return this.conjuntoDeEntidades.liberaTerminalDeCarga(terminalDeCarga);
    }

    public int quantidadeTerminaisDeCargaDisponiveis(){
        return this.conjuntoDeEntidades.quantidadeTerminaisDeCargaDisponiveis();
    }

    /*******************************************************************************************************************
     *                              Manipulação da geração dos tempos aleatórios
     ******************************************************************************************************************/

    public Double geraTempoNavioChegada(){
        return this.getDistribuicoes().getTempoNavioChegada().getRandomDistribuicao();
    }

    public Double geraTempoGruaIcamento (){
        return this.getDistribuicoes().getTempoGruaIcamento().getRandomDistribuicao();
    }

    public Double geraTempoGruaMovimentaContainerCheio (){
        return this.getDistribuicoes().getTempoGruaMovimentaContainerCheio().getRandomDistribuicao();
    }

    public Double geraTempoGruaMovimentaContainerCaminhao (){
        return this.getDistribuicoes().getTempoGruaMovimentaContainerCaminhao().getRandomDistribuicao();
    }

    public Double geraTempoGruaRetornaGuindasteVazio (){
        return this.getDistribuicoes().getTempoGruaRetornaGuindasteVazio().getRandomDistribuicao();
    }

    public Double geraTempoEquipeAtracamento (){
        return this.getDistribuicoes().getTempoEquipeAtracamento().getRandomDistribuicao();
    }

    public Double geraTempoEquipeDesatracamento (){
        return this.getDistribuicoes().getTempoEquipeDesatracamento().getRandomDistribuicao();
    }

    public Double geraTempoCarretaMovimentaVazio (){
        return this.getDistribuicoes().getTempoCarretaMovimentaVazio().getRandomDistribuicao();
    }

    public Double geraTempoCarretaMovimentaCarregado (){
        return this.getDistribuicoes().getTempoCarretaMovimentaCarregado().getRandomDistribuicao();
    }

    public Double geraTempoRtgDescarregaContainerPatio (){
        return this.getDistribuicoes().getTempoRtgDescarregaContainerPatio().getRandomDistribuicao();
    }

    public Double geraTempoRtgMovimentaPilhaDestino (){
        return this.getDistribuicoes().getTempoRtgMovimentaPilhaDestino().getRandomDistribuicao();
    }

    public Double geraTempoRtgEmpilhaContainerPatio (){
        return this.getDistribuicoes().getTempoRtgEmpilhaContainerPatio().getRandomDistribuicao();
    }

    public Double geraTempoReachDescarregaContainerPatio (){
        return this.getDistribuicoes().getTempoReachDescarregaContainerPatio().getRandomDistribuicao();
    }

    public Double geraTempoReachMovimentaPilhaDestino (){
        return this.getDistribuicoes().getTempoReachMovimentaPilhaDestino().getRandomDistribuicao();
    }

    public Double geraTempoReachEmpilhaContainerPatio (){
        return this.getDistribuicoes().getTempoReachEmpilhaContainerPatio().getRandomDistribuicao();
    }

    public Double geraTempoReachDesempilhaContainer (){
        return this.getDistribuicoes().getTempoReachDesempilhaContainer().getRandomDistribuicao();
    }

    public Double geraTempoReachMovimentaContainerTerminal (){
        return this.getDistribuicoes().getTempoReachMovimentaContainerTerminal().getRandomDistribuicao();
    }

    public Double geraTempoReachCarregaContainerVagao (){
        return this.getDistribuicoes().getTempoReachCarregaContainerVagao().getRandomDistribuicao();
    }

    public Double geraTempoReachMovimentaVazio (){
        return this.getDistribuicoes().getTempoReachMovimentaVazio().getRandomDistribuicao();
    }

    public Double geraTempoFerroviariaChegada (){
        return this.getDistribuicoes().getTempoFerroviariaChegada().getRandomDistribuicao();
    }

    public Double geraTempoFerroviariaPosicionaTerminal (){
        return this.getDistribuicoes().getTempoFerroviariaPosicionaTerminal().getRandomDistribuicao();
    }

    public Double geraTempoFerroviariaLiberaTerminal (){
        return this.getDistribuicoes().getTempoFerroviariaLiberaTerminal().getRandomDistribuicao();
    }

    @Override
    public String toString() {
        return "Sistema{\n" +
                "distribuicoes=" + distribuicoes.toString() +
                ",\n conjuntoDeEntidades=" + conjuntoDeEntidades.toString() +
                ",\n T_MIN=" + T_MIN +
                ",\n T_MAX=" + T_MAX +
                ",\n tempoDeSimulacao=" + tempoDeSimulacao +
                ",\n filasDoSistema=" + filasDoSistema +
                "\n}";
    }
}
