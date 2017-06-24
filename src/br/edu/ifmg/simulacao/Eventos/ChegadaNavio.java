package br.edu.ifmg.simulacao.Eventos;


import br.edu.ifmg.simulacao.Fabrica;
import br.edu.ifmg.simulacao.Sistema;
import br.edu.ifmg.simulacao.Tag;
import br.edu.ifmg.simulacao.model.Cais;
import br.edu.ifmg.simulacao.model.Equipe;
import br.edu.ifmg.simulacao.model.navios.Navio;

public class ChegadaNavio {

    private Sistema sistema;

    public ChegadaNavio(Sistema sistema) {
        this.sistema = sistema;
    }

    public Sistema executa(){

        // cria um navio novo ja sortiando entre 70% a 100% da capacidade de navios
        Navio navio = Fabrica.criaNavio();

        // tem cais disponivel? sim
        if (sistema.temCaisDisponivel()){

            // tem equipe disponivel? sim
            if (sistema.temEquipeDisponivel()){

                // reserva o cais
                Cais caisReservado = sistema.reservaCais();

                // reserva a aquipe
                Equipe equipeReservada = sistema.reservaEquipe();

                Double duracaoAtracamento = sistema.geraTempoEquipeAtracamento();

                // cria event notice
                EventNotice eventNotice = new EventNotice();
                eventNotice.setHoraInicio(sistema.getRelogio());
                eventNotice.setHoraFim(sistema.getRelogio()+duracaoAtracamento);

                // adiciona no event notice as entidades reservadas
                eventNotice.setCais(caisReservado);
                eventNotice.setEquipe(equipeReservada);

                eventNotice.setEventoAtual(Tag.ChegadaNavio);
                eventNotice.setEnventoDeTermino(Tag.FimAtracamento);

                // adicionar o evento na fel
                sistema.agendaNaFel(eventNotice);
            }

        }else{
            // nao tem cais disponivel
            sistema.addEntidadeFilaNavioAguardarCais(navio);
        }

        return sistema;
    }

}
