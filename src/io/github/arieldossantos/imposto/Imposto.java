package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

/**
 * Implementação do padrão de projeto Strategy
 */
public interface Imposto {
    float calcularImposto(Orcamento orcamento);
}
