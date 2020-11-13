package io.github.arieldossantos.desconto;

import io.github.arieldossantos.Orcamento;
import io.github.arieldossantos.util.Item;

import java.util.List;

public class DescontoPorVendaCasada implements Desconto {
    private Desconto classeDoProximoDesconto;
    private Orcamento orcamento;

    @Override
    public double calcularDesconto(Orcamento orcamento) {
        this.orcamento = orcamento;
        if(this.contemItemDeNome("LAPIS") && this.contemItemDeNome("CANETA")) {
            return orcamento.getValor() * 0.05;
        }
        return this.classeDoProximoDesconto.calcularDesconto(orcamento);
    }

    @Override
    public void proximoDesconto(Desconto classeDoProximoDesconto) {
        this.classeDoProximoDesconto = classeDoProximoDesconto;
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().toUpperCase().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
