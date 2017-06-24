package br.edu.ifmg.simulacao.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 ConjuntoDeEntidades é uma classe para agrupar todas as entidades do sistema em um
 conjunto de coleções de entidades
 */

public class ConjuntoDeEntidades {
    private Map<String,ColecaoDeEntidades> conjuntoDeEntidades;

    public ConjuntoDeEntidades(){
        this.conjuntoDeEntidades = new HashMap<>();
    }

    public void adicionarColecao(String chave, ColecaoDeEntidades colecao){
        this.conjuntoDeEntidades.put(chave, colecao);
    }

    // adiciona entidade no hash
    public void adicionarEntidade(String chave, Entidade entidade){

        // verifica se existe a fila
        if (this.conjuntoDeEntidades.containsKey(chave)){
            this.conjuntoDeEntidades.get(chave).addEntidade(entidade);
        }else{
            // adciona uma fila nova e ja adiciona a entidade
            this.conjuntoDeEntidades.put(chave, new ColecaoDeEntidades());
            this.conjuntoDeEntidades.get(chave).addEntidade(entidade);
        }
    }

    public ColecaoDeEntidades getColecao(String entidade){
        return this.conjuntoDeEntidades.get(entidade);
    }

    public Entidade getEntidade(String chave, int i){
        return this.getColecao(chave).getEntidade(i);
    }

    // consome uma coleção inteira de entidades
    private void destroeColecao(int i){
        this.conjuntoDeEntidades.remove(i);
    }

    private void destroeEntidade(String chave, int i){
        this.getColecao(chave).destroeEntidade(i);
    }

    public void instanciaEntidades(String entidade, int quantidade){
        int i;

        for(i=0;i<quantidade;i++){
            switch (entidade.toUpperCase()){
                case "G": {
                    this.adicionarEntidade("G", new Grua());
                    break;
                }
                case "E": {
                    this.adicionarEntidade("E", new Equipe());
                    break;
                }
                case "Q": {
                    this.adicionarEntidade("Q", new Cais());
                    break;
                }
                case "C": {
                    this.adicionarEntidade("C", new Carreta());
                    break;
                }
                case "R": {
                    this.adicionarEntidade("R", new RTG());
                    break;
                }
                case "S": {
                    this.adicionarEntidade("S", new ReachStacker());
                    break;
                }
                case "F": {
                    this.adicionarEntidade("F", new TerminalDeCarga());
                    break;
                }
                default:{
                    System.out.println("Entidade '+entidade+'não conhecida.");
                    break;
                }
            }
        }
    }

    /*******************************************************************************************************************
    * Metodos de acesso da Grua
    *******************************************************************************************************************/
    public Boolean gruaDisponivel(){
        ColecaoDeEntidades colecaoGruas = getColecao("G");
        List<Entidade> listaDeGruas = colecaoGruas.getColecaoDeEntidade();

        for (Entidade grua : listaDeGruas) {
            if (grua.isLivre()){
                return true;
            }
        }
        return false;
    }

    public Grua getGruaDisponivel(){
        ColecaoDeEntidades colecaoGruas = getColecao("G");
        List<Entidade> listaDeGruas = colecaoGruas.getColecaoDeEntidade();

        for (Entidade grua : listaDeGruas) {
            if (grua.isLivre()){
                return (Grua) grua;
            }
        }
        return null;
    }

    // reserva grua
    public Grua reservaGrua(){
        return (Grua) this.getColecao("G").reservaEntidade();
    }

    // libera grua
    public Grua liberaGrua(Grua grua){
        return (Grua) this.getColecao("G").liberaEntidade(grua);
    }

    // qtd de gruas disponiveis
    public int quantidadeGruasDisponiveis(){
        return this.getColecao("G").getQuantidade();
    }


    /*******************************************************************************************************************
    * Metodos de acesso da Equipe
    *******************************************************************************************************************/
    public Boolean equipeDisponivel(){
        ColecaoDeEntidades colecaoEquipes = getColecao("E");
        List<Entidade> listaDeEquipes = colecaoEquipes.getColecaoDeEntidade();

        for (Entidade equipe : listaDeEquipes) {
            if (equipe.isLivre()){
                return true;
            }
        }
        return false;
    }

    public Equipe getEquipeDisponivel(){
        ColecaoDeEntidades colecaoEquipes = getColecao("E");
        List<Entidade> listaDeEquipes = colecaoEquipes.getColecaoDeEntidade();

        for (Entidade equipe : listaDeEquipes) {
            if (equipe.isLivre()){
                return (Equipe) equipe;
            }
        }
        return null;
    }

    public Equipe reservaEquipe(){
        return (Equipe) this.getColecao("E").reservaEntidade();
    }

    // libera equipe
    public Equipe liberaEquipe(Equipe equipe){
        return (Equipe) this.getColecao("E").liberaEntidade(equipe);
    }

    // qtd de equipes disponiveis
    public int quantidadeEquipesDisponiveis(){
        return this.getColecao("E").getQuantidade();
    }

    /*******************************************************************************************************************
    * Metodos de acesso do Cais
    *******************************************************************************************************************/
    public Boolean caisDisponivel(){
        ColecaoDeEntidades colecaoCais = getColecao("Q");
        List<Entidade> listaDeCais = colecaoCais.getColecaoDeEntidade();

        for (Entidade cais : listaDeCais) {
            if (cais.isLivre()){
                return true;
            }
        }
        return false;
    }

    public Cais getCaisDisponivel(){
        ColecaoDeEntidades colecaoCais = getColecao("Q");
        List<Entidade> listaDeCais = colecaoCais.getColecaoDeEntidade();

        for (Entidade cais : listaDeCais) {
            if (cais.isLivre()){
                return (Cais) cais;
            }
        }
        return null;
    }

    public Cais reservaCais(){
        return (Cais) this.getColecao("Q").reservaEntidade();
    }

    // libera cais
    public Cais liberaCais(Cais cais){
        return (Cais) this.getColecao("Q").liberaEntidade(cais);
    }

    // qtd de cais disponiveis
    public int quantidadeCaisDisponiveis(){
        return this.getColecao("Q").getQuantidade();
    }

    /*******************************************************************************************************************
    * Metodos de acesso de Carreta
    *******************************************************************************************************************/
    public Boolean carretaDisponivel(){
        ColecaoDeEntidades colecaoCarretas = getColecao("C");
        List<Entidade> listaDeCarretas = colecaoCarretas.getColecaoDeEntidade();

        for (Entidade carreta : listaDeCarretas) {
            if (carreta.isLivre()){
                return true;
            }
        }
        return false;
    }

    public Carreta getCarretaDisponivel(){
        ColecaoDeEntidades colecaoCarretas = getColecao("C");
        List<Entidade> listaDeCarretas = colecaoCarretas.getColecaoDeEntidade();

        for (Entidade carreta : listaDeCarretas) {
            if (carreta.isLivre()){
                return (Carreta) carreta;
            }
        }
        return null;
    }

    public Carreta reservaCarreta(){
        return (Carreta) this.getColecao("C").reservaEntidade();
    }

    // libera carreta
    public Carreta liberaCarreta(Carreta carreta){
        return (Carreta) this.getColecao("C").liberaEntidade(carreta);
    }

    // qtd de carreta disponiveis
    public int quantidadeCarretasDisponiveis(){
        return this.getColecao("C").getQuantidade();
    }

    /*******************************************************************************************************************
    * Metodos de acesso de RTG
    *******************************************************************************************************************/
    public Boolean rtgDisponivel(){
        ColecaoDeEntidades colecaoRTGs = getColecao("R");
        List<Entidade> listaDeRTGs = colecaoRTGs.getColecaoDeEntidade();

        for (Entidade rtg : listaDeRTGs) {
            if (rtg.isLivre()){
                return true;
            }
        }
        return false;
    }

    public RTG getRtgDisponivel(){
        ColecaoDeEntidades colecaoRTGs = getColecao("R");
        List<Entidade> listaDeRTGs = colecaoRTGs.getColecaoDeEntidade();

        for (Entidade rtg : listaDeRTGs) {
            if (rtg.isLivre()){
                return (RTG) rtg;
            }
        }
        return null;
    }

    public RTG reservaRtg(){
        return (RTG) this.getColecao("R").reservaEntidade();
    }

    // libera rtg
    public RTG liberaRtg(RTG rtg){
        return (RTG) this.getColecao("R").liberaEntidade(rtg);
    }

    // qtd de rtgs disponiveis
    public int quantidadeRtgsDisponiveis(){
        return this.getColecao("R").getQuantidade();
    }

    /*******************************************************************************************************************
    * Metodos de acesso de ReachStacker
    *******************************************************************************************************************/
    public Boolean reachStackerDisponivel(){
        ColecaoDeEntidades colecaoReachStackers = getColecao("S");
        List<Entidade> listaDeReachStackers = colecaoReachStackers.getColecaoDeEntidade();

        for (Entidade reachStacker : listaDeReachStackers) {
            if (reachStacker.isLivre()){
                return true;
            }
        }
        return false;
    }

    public ReachStacker getReachStackerDisponivel(){
        ColecaoDeEntidades colecaoReachStackers = getColecao("S");
        List<Entidade> listaDeReachStackers = colecaoReachStackers.getColecaoDeEntidade();

        for (Entidade reachStacker : listaDeReachStackers) {
            if (reachStacker.isLivre()){
                return (ReachStacker) reachStacker;
            }
        }
        return null;
    }

    public ReachStacker reservaReachStacker(){
        return (ReachStacker) this.getColecao("S").reservaEntidade();
    }

    // libera rtg
    public ReachStacker liberaReachStacker(ReachStacker reach){
        return (ReachStacker) this.getColecao("S").liberaEntidade(reach);
    }

    // qtd de rtgs disponiveis
    public int quantidadeReachStackersDisponiveis(){
        return this.getColecao("S").getQuantidade();
    }

    /*******************************************************************************************************************
    * Metodos de acesso de Terminal de Carga
    *******************************************************************************************************************/
    public Boolean terminalDeCargaDisponivel(){
        ColecaoDeEntidades colecaoTerminaisDeCarga = getColecao("R");
        List<Entidade> listaTerminaisDeCarga = colecaoTerminaisDeCarga.getColecaoDeEntidade();

        for (Entidade TerminalDeCarga : listaTerminaisDeCarga) {
            if (TerminalDeCarga.isLivre()){
                return true;
            }
        }
        return false;
    }

    public TerminalDeCarga getTerminalDeCargaDisponivel(){
        ColecaoDeEntidades colecaoTerminaisDeCarga = getColecao("R");
        List<Entidade> listaTerminaisDeCarga = colecaoTerminaisDeCarga.getColecaoDeEntidade();

        for (Entidade terminalDeCarga : listaTerminaisDeCarga) {
            if (terminalDeCarga.isLivre()){
                return (TerminalDeCarga) terminalDeCarga;
            }
        }
        return null;
    }

    public TerminalDeCarga reservaTerminalDeCarga(){
        return (TerminalDeCarga) this.getColecao("F").reservaEntidade();
    }

    // libera terminal de carga
    public TerminalDeCarga liberaTerminalDeCarga(TerminalDeCarga terminalDeCarga){
        return (TerminalDeCarga) this.getColecao("F").liberaEntidade(terminalDeCarga);
    }

    // qtd de terminais de cargas
    public int quantidadeTerminaisDeCargaDisponiveis(){
        return this.getColecao("F").getQuantidade();
    }

    @Override
    public String toString() {
        return "\nConjuntoDeEntidades{" +
                "\n\tQuantidade=" + conjuntoDeEntidades.size() +
                "\n\tconjuntoDeEntidades=" + conjuntoDeEntidades +
                "\n}";
    }
}
