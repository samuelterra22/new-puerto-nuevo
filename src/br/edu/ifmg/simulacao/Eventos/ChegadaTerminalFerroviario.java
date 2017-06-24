package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Fabrica;
import br.edu.ifmg.simulacao.Sistema;
import br.edu.ifmg.simulacao.model.ComposicaoFerroviaria;

public class ChegadaTerminalFerroviario {

    private Sistema sistema;

    public ChegadaTerminalFerroviario(Sistema sistema) {
        this.sistema = sistema;
    }

    public Sistema executa(){

        // cria uma nova composição ferroviaria já com os valores de capacidade de vagões
        ComposicaoFerroviaria composicaoFerroviaria = Fabrica.criaComposicaoFerroviaria(sistema.getT_MIN(), sistema.getT_MAX());

        if (sistema.temTerminalDeCArgaDisponivel()){
            sistema.reservaTerminalDeCarga();
        }

        return null;
    }

}
