package io.github.arieldossantos.estados;

import io.github.arieldossantos.Orcamento;

public class EmAprovacao implements Estado {
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        orcamento.setValor((float) (orcamento.getValor() * .05));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Reprovado());
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento em aprovação não pode ir direto para finalizado");
    }
}
