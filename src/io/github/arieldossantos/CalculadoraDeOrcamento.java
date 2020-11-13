package io.github.arieldossantos;

import io.github.arieldossantos.calculadoras.Descontos;
import io.github.arieldossantos.calculadoras.Impostos;
import io.github.arieldossantos.imposto.ICCC;
import io.github.arieldossantos.imposto.ICMS;
import io.github.arieldossantos.imposto.ISS;
import io.github.arieldossantos.imposto.Imposto;
import io.github.arieldossantos.util.Item;

public class CalculadoraDeOrcamento {
    public static void main(String[] args) {
        Orcamento valorDaParada = new Orcamento(300);
        valorDaParada.adicionarItem(new Item("lapis", 200));
        valorDaParada.adicionarItem(new Item("caneta", 100));
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Impostos imposto = new Impostos();

        //Calculo de impostos
        System.out.println(imposto.calcular(valorDaParada, icms));
        System.out.println(imposto.calcular(valorDaParada, iss));
        System.out.println(imposto.calcular(valorDaParada, iccc));


        //Calculo de descontos
        Descontos descontos = new Descontos();
        System.out.println(descontos.calcular(valorDaParada));
    }
}
