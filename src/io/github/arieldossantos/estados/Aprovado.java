package io.github.arieldossantos.estados;

import io.github.arieldossantos.Orcamento;

public class Aprovado implements Estado {
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        orcamento.setValor((float) (orcamento.getValor() * .02));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("O orçamento já foi aprovado");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("O orçamento já foi aprovado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
