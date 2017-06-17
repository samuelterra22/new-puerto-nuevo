package br.edu.ifmg.simulacao;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by samuel on 16/06/17.
 */
public class Distribuicoes {

    private Map<Integer, Random> distribuicoes;

    private final int N_CHG = 1;    // tempo de chegada de navio

    private final int G_ICA = 2;    // tempo de icamento da grua
    private final int G_MCA = 3;    // tempo de
    private final int G_RET = 4;    // tempo de

    private final int E_ATR = 5;    // tempo de
    private final int E_DTR = 6;    // tempo de

    private final int C_MVZ = 7;    // tempo de
    private final int C_MCH = 8;    // tempo de

    private final int R_DCG = 9;    // tempo de
    private final int R_MCP = 10;    // tempo de
    private final int R_EMP = 11;    // tempo de

    private final int S_DCG = 12;    // tempo de
    private final int S_MCP = 13;    // tempo de
    private final int S_EMP = 14;    // tempo de
    private final int S_DMP = 15;    // tempo de
    private final int S_MTF = 16;    // tempo de
    private final int S_MCV = 17;    // tempo de
    private final int S_MVP = 18;    // tempo de

    private final int T_MIN = 19;    // tempo de
    private final int T_MAX = 20;    // tempo de
    private final int T_CHG = 21;    // tempo de
    private final int T_POS = 22;    // tempo de
    private final int T_LIB = 23;    // tempo de

    public Distribuicoes() {
        this.distribuicoes = new HashMap<Integer, Random>();
    }
}
