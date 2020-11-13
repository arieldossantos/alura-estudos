package io.github.arieldossantos.estados;

import io.github.arieldossantos.Orcamento;

public class Finalizado implements Estado {
    @Override
    public void aplicarDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado não recebe desconto!");
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi finalizado!");
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi finalizado!");
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já foi finalizado!");
    }
}
