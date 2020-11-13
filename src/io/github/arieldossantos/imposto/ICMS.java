package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ICMS implements Imposto{
    @Override
    public float calcularImposto(Orcamento orcamento) {
        return (float) (orcamento.getValor() * 0.05) + 50;
    }
}
