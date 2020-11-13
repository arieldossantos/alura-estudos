package io.github.arieldossantos;

import io.github.arieldossantos.calculadoras.Descontos;
import io.github.arieldossantos.calculadoras.Impostos;
import io.github.arieldossantos.imposto.*;
import io.github.arieldossantos.util.Item;

public class CalculadoraDeOrcamento {
    public static void main(String[] args) {
        Orcamento valorDaParada = new Orcamento(300);
        valorDaParada.adicionarItem(new Item("lapis", 200));
        valorDaParada.adicionarItem(new Item("caneta", 100));
        Imposto iss = new ISS(new IKCV());

        Impostos imposto = new Impostos();

        //Calculo de impostos
        System.out.println(imposto.calcular(valorDaParada, iss));
        valorDaParada.adicionarDescontoExtra();
        valorDaParada.aprova();
        valorDaParada.adicionarDescontoExtra();

        //Calculo de descontos
        Descontos descontos = new Descontos();
        System.out.println(descontos.calcular(valorDaParada));
    }
}
