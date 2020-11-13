package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

/**
 * Implementação do padrão de projeto Strategy
 */
public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {}

    public abstract float calcularImposto(Orcamento orcamento);

    protected float calcularOutroImposto(Orcamento orcamento) {
        if(outroImposto == null) return 0;
        return outroImposto.calcularImposto(orcamento);
    }
}
