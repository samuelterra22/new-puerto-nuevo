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

}
