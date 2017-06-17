package br.edu.ifmg.simulacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe pricipal que executa a sumulação.
 * */
public class Simulacao {

    Distribuicoes distribuicoes;
    Entidades entidades;

    public Simulacao() {
        this.distribuicoes = new Distribuicoes();
        this.entidades = new Entidades();
    }

    public void leArquivo(String path) {
        //System.out.printf("\nConteúdo do arquivo texto:\n");
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String entidade;

            // lê a primeira linha
            String linha = lerArq.readLine();
            // a variável "linha" recebe o valor "null" quando o processo
            // de repetição atingir o final do arquivo texto
            while (linha != null) {
                //ignora as linhas que tem tamanho 0 (linhas vazias)
                if ((linha.length() != 0)&&(!linha.contains("#"))) {
                    System.out.println(linha);
                    //System.out.println(String.valueOf(linha.charAt(0)));
                    entidade = String.valueOf(linha.charAt(0));

                    switch (entidade.toUpperCase()){
                        case "U":{
                            // configuracao universal da simulacao
                            String resultSplit [] = linha.split(" ");
                            // pega o tempo de simulação
                            //System.out.println("tempo de simulacao: "+resultSplit[1]);
                            break;
                        }
                        case "G":{
                            // configuração da grua
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()){
                                case "QTD":{
                                    // Quantidade de gruas disponivel nos cais. Default = 3
                                    //System.out.println("Quantidade de gruas: "+resultSplit[2]);
                                    break;
                                }
                                case "ICA":{
                                    // Tempo de Icamento da Grua em minutos
                                    // System.out.println("Tempo de icamento:"+ resultSplit[2]+" "+ resultSplit[3]+" "+ resultSplit[4]);
                                    break;
                                }
                                case "MCH":{
                                    // Tempo de Movimentar Container Cheio
                                    //System.out.println("Tempo movimenta cheio:"+ resultSplit[2]+" "+ resultSplit[3]+" "+ resultSplit[4]);
                                    break;
                                }
                                case "MCA":{
                                    // Tempo de Movimentar Container ate Caminhao
                                    //System.out.println("Tempo movimenta ate caminhao:"+ resultSplit[2]+" "+ resultSplit[3]+" "+ resultSplit[4]);
                                    break;
                                }
                                case "RET":{
                                    // Tempo de Retornar Guindaste Vazio
                                    //System.out.println("Tempo movimenta retorna vazio:"+ resultSplit[2]+" "+ resultSplit[3]+" "+ resultSplit[4]);
                                    break;
                                }
                                default:{break;}
                            }

                            break;
                        }
                        case "N":{
                            // configuracao dos navios
                            String resultSplit [] = linha.split(" ");
                            //Tempo de chegada de navios (EXPONENCIAL), em minutos
                            //System.out.println("Tempo de chegada dos navios: "+resultSplit[2]);
                            break;
                        }
                        case "E":{
                            // configuracao da equipe
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()){
                                case "QTD":{
                                    // Quantidade de equipes disponiveis para atracar/desatracar
                                    //System.out.println("Quantidade de equipes:"+ resultSplit[2]);
                                    break;
                                }
                                case "ATR":{
                                    // Tempo de atracamento
                                    //System.out.println("Tempo de atracamento:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "DTR":{
                                    // Tempo de desatracamento
                                    //System.out.println("Tempo de desatracamento:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                default:{break;}
                            }

                            break;
                        }
                        case "Q":{
                            // configuracao do cais
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()){
                                case "QTD":{
                                    // Inspirado nos cais das Darsenas de Puerto Nuevo
                                    //System.out.println("Quantidade de cais:"+ resultSplit[2]);
                                    break;
                                }
                                default:{break;}
                            }
                            break;
                        }
                        case "C":{
                            // configuracao das carretas
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()){
                                case "QTD":{
                                    // Quantidade de carretas disponiveis para operar entre cais e patio
                                    //System.out.println("Quantidade de carretas:"+ resultSplit[2]);
                                    break;
                                }
                                case "MVZ":{
                                    // Tempo de Movimentar Vazio, em segundos
                                    //System.out.println("Tempo de movimentar vazio:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MCH":{
                                    // Tempo de Movimentando Carregado
                                    //System.out.println("Tempo de movimentar cheio:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                default:{break;}
                            }
                            break;
                        }
                        case "R":{
                            // configuracao RTG
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()) {
                                case "QTD": {
                                    // Quantidade de RTGs disponiveis no patio
                                    //System.out.println("Quantidade de RTGs:" + resultSplit[2]);
                                    break;
                                }
                                case "DCG": {
                                    // Tempo de descarga de container no patio, retirando do caminhao
                                    //System.out.println("Tempo de descarga de container no patio:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MCP": {
                                    // Tempo de movimentar container para pilha de destino
                                    //System.out.println("Tempo de movimentar ate pilha de destino:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "EMP": {
                                    // Tempo de empilhamento de container na pilha do patio
                                    //System.out.println("Tempo de empilhamento:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                default: {
                                    break;
                                }
                            }
                            break;
                        }
                        case "S":{
                            // configuracao Reach Stacker
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()) {
                                case "QTD": {
                                    // Quantidade de reach stackers no patio
                                    //System.out.println("Quantidade de Reach Stacker:" + resultSplit[2]);
                                    break;
                                }
                                case "DCG": {
                                    // Tempo de descarga de container no patio, retirando do caminhao
                                    // System.out.println("Tempo de descarga de container no patio:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MCP": {
                                    // Tempo de movimentar container para pilha de destino
                                    //System.out.println("Tempo de movimentar ate pilha de destino:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "EMP": {
                                    // Tempo de empilhamento de container na pilha do patio
                                    //System.out.println("Tempo de empilhamento:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "DMP": {
                                    // Tempo de desempilhar container da pilha para o terminal ferroviario
                                    // Tempo de desempilhamento de container da pilha
                                    //System.out.println("Tempo empilhar/desempilhar container na pilha:" + resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MTF": {
                                    // Tempo para movimentar container ate' terminal ferroviario
                                    //System.out.println("Tempo movimenta ate terminal rodoviario:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MCV": {
                                    // Tempo de carregar container em vagao
                                    //System.out.println("Tempo de de carregar container em vagão:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "MVP": {
                                    // Tempo de movimentar vazio ate' o patio
                                    //System.out.println("Tempo movimentar ate patio vazio:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                default: {
                                    break;
                                }
                            }
                            break;
                        }
                        case "F":{
                            // configuracao termninal de carga
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()) {
                                case "QTD": {
                                    // Quantidade de terminais de carga
                                    //System.out.println("Quantidade de terminais de carga:" + resultSplit[2]);
                                    break;
                                }
                            }
                            break;
                        }
                        case "T":{
                            // configuracao composicao ferroviaria
                            String resultSplit [] = linha.split(" ");
                            switch (resultSplit[1].toUpperCase()) {
                                case "MIN": {
                                    // Quantidade minima de vagoes na composicao
                                    //System.out.println("Quantidade minima de vagoes:" + resultSplit[2]);
                                    break;
                                }
                                case "MAX": {
                                    // Quantidade maxima de vagoes na composicao
                                    //System.out.println("Quantidade maxima de vagoes:"+ resultSplit[2]);
                                    break;
                                }
                                case "CHG": {
                                    // Tempo de chegada de composicoes no terminal ferroviario
                                    //System.out.println("Tempo de chegada de composicoes:"+ resultSplit[2]);
                                    break;
                                }
                                case "POS": {
                                    // Tempo para posicionar no terminal
                                    //System.out.println("Tempo para posicionar no terminal:"+ resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                                case "LIB": {
                                    // Tempo para ser liberado do terminal
                                    //System.out.println("Tempo para ser liberado do terminal:" + resultSplit[2]+ " "+ resultSplit[3]+" "+resultSplit[4]);
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Entidade '"+ entidade +"' não identificada.");
                            break;
                        }
                    }
                }
                // le a proxima linha
                linha = lerArq.readLine();
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            System.err.printf("Diretório: %s.\n",  System.getProperty("user.dir"));
        }
    }

}
