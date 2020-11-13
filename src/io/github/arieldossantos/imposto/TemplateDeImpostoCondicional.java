package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;

/**
 * Template method
 */
public abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public final float calcularImposto(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    protected abstract float minimaTaxacao(Orcamento orcamento);

    protected abstract float maximaTaxacao(Orcamento orcamento);

    protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
