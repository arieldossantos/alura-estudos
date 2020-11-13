package io.github.arieldossantos.calculadoras;

import io.github.arieldossantos.Orcamento;
import io.github.arieldossantos.imposto.Imposto;

public class Impostos {
    public double calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcularImposto(orcamento);
    }
}
