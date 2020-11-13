package io.github.arieldossantos.desconto;

import io.github.arieldossantos.Orcamento;

public class DescontoAcimaDe5Itens implements Desconto {
    private Desconto classeDoProximoDesconto;

    @Override
    public double calcularDesconto(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * .1;
        } else {
            return this.classeDoProximoDesconto.calcularDesconto(orcamento);
        }
    }

    public void proximoDesconto(Desconto classeDoProximoDesconto) {
        this.classeDoProximoDesconto = classeDoProximoDesconto;
    }
}
