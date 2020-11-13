package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ISS implements Imposto {
    /**
     * Valor do imposto ISS (6%)
     * @param orcamento
     * @return
     */
    @Override
    public float calcularImposto(Orcamento orcamento) {
        return (float) (orcamento.getValor() * 0.06);
    }
}
