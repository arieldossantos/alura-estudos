package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;
import io.github.arieldossantos.util.Item;

public class IKCV extends TemplateDeImpostoCondicional {

    private boolean temIemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getValor() > 100) return true;
        }
        return false;
    }

    @Override
    protected float minimaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * .06);
    }

    @Override
    protected float maximaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * .1);
    }

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temIemMaiorQue100ReaisNo(orcamento);
    }
}
