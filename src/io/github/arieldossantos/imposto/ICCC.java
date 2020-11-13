package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ICCC extends Imposto {

    public ICCC(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICCC() {
    }

    @Override
    public float calcularImposto(Orcamento orcamento) {
        float returnedValue = 0;
        if (orcamento.getValor() < 1000) {
            returnedValue = (float) (orcamento.getValor() * 0.05);
        } else if (orcamento.getValor() <= 3000) {
            returnedValue =  (float) (orcamento.getValor() * 0.07);
        } else {
            returnedValue =  (float) (orcamento.getValor() * 0.08) + 30;
        }
        return returnedValue + calcularOutroImposto(orcamento);
    }
}
