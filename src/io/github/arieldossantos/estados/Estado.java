package io.github.arieldossantos.estados;

import io.github.arieldossantos.Orcamento;

public interface Estado {
    void aplicarDescontoExtra(Orcamento orcamento);

    void aprovar(Orcamento orcamento);
    void reprovar(Orcamento orcamento);
    void finalizar(Orcamento orcamento);
}
