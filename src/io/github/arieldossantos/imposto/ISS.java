package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ISS extends Imposto {
    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS() {
    }

    /**
     * Valor do imposto ISS (6%)
     * @param orcamento
     * @return
     */
    @Override
    public float calcularImposto(Orcamento orcamento) {
        return (float) (orcamento.getValor() * 0.06) + calcularOutroImposto(orcamento);
    }
}
