package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Fabrica;
import br.edu.ifmg.simulacao.Sistema;
import br.edu.ifmg.simulacao.Tag;
import br.edu.ifmg.simulacao.model.ComposicaoFerroviaria;
import br.edu.ifmg.simulacao.model.TerminalDeCarga;

public class ChegadaTerminalFerroviario {

    private Sistema sistema;

    public ChegadaTerminalFerroviario(Sistema sistema) {
        this.sistema = sistema;
    }

    public Sistema executa(){

        // cria uma nova composição ferroviaria já com os valores de capacidade de vagões
        ComposicaoFerroviaria composicaoFerroviaria = Fabrica.criaComposicaoFerroviaria(sistema.getT_MIN(), sistema.getT_MAX());

        // tem terminal de carga disponivel? sim
        if (sistema.temTerminalDeCArgaDisponivel()){

            TerminalDeCarga terminalDeCargaReservado = sistema.reservaTerminalDeCarga();
            // gera o tempo para posicionar no terminal
            Double duracaoParaPosicionarTerminal = sistema.geraTempoFerroviariaPosicionaTerminal();

            // cria event notice
            EventNotice eventNotice = new EventNotice();
            eventNotice.setHoraInicio(sistema.getRelogio());
            eventNotice.setHoraFim(sistema.getRelogio()+duracaoParaPosicionarTerminal);

            eventNotice.setTerminalDeCarga(terminalDeCargaReservado);
            eventNotice.setComposicaoFerroviaria(composicaoFerroviaria);

            eventNotice.setEventoAtual(Tag.ChegadaTerminalFerroviario);
            eventNotice.setEnventoDeTermino(Tag.FimPosicionaTerminal);

            // adicionar o evento na fel
            sistema.agendaNaFel(eventNotice);

        }else {
            // não tem terminal de carga disponivel
            sistema.addEntidadeFilaComposicaoPatioManobra(composicaoFerroviaria);

        }

        return sistema;
    }

}
