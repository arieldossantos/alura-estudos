package io.github.arieldossantos.estados;

import io.github.arieldossantos.Orcamento;

public class Reprovado implements Estado {
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Erro ao lançar desconto! O orçamento foi reprovado!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi reprovado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi reprovado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstadoAtual(new Finalizado());
    }
}
