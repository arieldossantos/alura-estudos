package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ICMS extends Imposto {
    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public float calcularImposto(Orcamento orcamento) {
        return (float) (orcamento.getValor() * 0.05) + 50 + calcularOutroImposto(orcamento);
    }
}
