package io.github.arieldossantos.desconto;

import io.github.arieldossantos.Orcamento;

public class DescontoAcimaDe500Reais implements Desconto {
    private Desconto classeDoProximoDesconto;

    @Override
    public double calcularDesconto(Orcamento orcamento) {
        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {
            return classeDoProximoDesconto.calcularDesconto(orcamento);
        }
    }

    @Override
    public void proximoDesconto(Desconto classeDoProximoDesconto) {
        this.classeDoProximoDesconto = classeDoProximoDesconto;
    }
}
