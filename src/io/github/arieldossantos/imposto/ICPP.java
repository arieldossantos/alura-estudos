package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {
    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICPP() {
    }

    @Override
    protected float minimaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * .05);
    }

    @Override
    protected float maximaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * .07);
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}
