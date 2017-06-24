package br.edu.ifmg.simulacao;

/**
 * Este enum contem todas as tags necessárias para manter o controle das filas, agendamento e consumo de eventos ma FEL
 *
 * */
public enum Tag {
    Fila_Navio_Aguardar_Cais,
    Fila_Navio_Aguardar_Descarregar,
    Fila_Grua_Aguardar_Transporte,
    Fila_Carreta_na_Grua,
    Fila_Carreta_Aguardar_Descarga_Patio,
    Fila_RTG_para_Empilhar,
    Fila_Reach_para_Desempilhar,
    Fila_Reach_Aguarda_Desempilhar,
    Fila_Composicao_Patio_Manobra,
    Fila_Composicao_Aguardar_Reach,
    Fila_Composicao_Aguarda_Liberacao,

    ChegadaNavio,
    ChegadaTerminalFerroviario,
    EventNotice,
    FimAtracamento,
    FimCarregaTransporte,
    FimCarregaVagao,
    FimDesatracar,
    FimDescarregaContainerPatio,
    FimDesempilhamento,
    FimEmpilhamentoReach,
    FimEmpilhamentoRtg,
    FimIcamento,
    FimLiberaTerminal,
    FimMovimentaAteVagao,
    FimMovimentaCarregadoCarretas,
    FimMovimentaContainer,
    FimMovimentaContainerAteTerminal,
    FimMovimentaContainerPilhaDestino,
    FimMovimentaGruaVazia,
    FimMovimentaPilha,
    FimMovimentaVazioPatio,
    FimMovimentoVazio,
    FimPosicionaTerminal,

}
