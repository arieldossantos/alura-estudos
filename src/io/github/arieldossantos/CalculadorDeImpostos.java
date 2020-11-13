package io.github.arieldossantos;

import io.github.arieldossantos.imposto.ICCC;
import io.github.arieldossantos.imposto.ICMS;
import io.github.arieldossantos.imposto.ISS;
import io.github.arieldossantos.imposto.Imposto;

public class CalculadorDeImpostos {
    public static void main(String[] args) {
        Orcamento valorDaParada = new Orcamento(3001);
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        System.out.println(calcularImposto(valorDaParada, icms));
        System.out.println(calcularImposto(valorDaParada, iss));
        System.out.println(calcularImposto(valorDaParada, iccc));
    }

    private static float calcularImposto(Orcamento orcamento, Imposto imposto) {
        return imposto.calcularImposto(orcamento);
    }
}
