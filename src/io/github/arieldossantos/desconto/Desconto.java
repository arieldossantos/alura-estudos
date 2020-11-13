package io.github.arieldossantos.desconto;

import io.github.arieldossantos.Orcamento;

/**
 * Implementação do padrão de projeto chain of responsibility
 */
public interface Desconto {
    double calcularDesconto(Orcamento orcamento);
    void proximoDesconto(Desconto classeDoProximoDesconto);
}
