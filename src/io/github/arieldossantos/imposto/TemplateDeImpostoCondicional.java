package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

/**
 * Template method
 */
public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TemplateDeImpostoCondicional() {
    }

    @Override
    public final float calcularImposto(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento) + calcularOutroImposto(orcamento);
        } else {
            return minimaTaxacao(orcamento) + calcularOutroImposto(orcamento);
        }
    }

    protected abstract float minimaTaxacao(Orcamento orcamento);

    protected abstract float maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
