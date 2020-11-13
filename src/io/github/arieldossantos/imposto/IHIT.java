package io.github.arieldossantos.imposto;

import io.github.arieldossantos.Orcamento;
import io.github.arieldossantos.util.Item;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        List<String> noOrcamento = new ArrayList<String>();

        for(Item item : orcamento.getItens()) {
            if(noOrcamento.contains(item.getNome())) return true;
            else noOrcamento.add(item.getNome());
        }

        return false;
    }

    @Override
    protected float minimaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * (.01 * orcamento.getItens().size()));
    }

    @Override
    protected float maximaTaxacao(Orcamento orcamento) {
        return (float) (orcamento.getValor() * .13) + 100;
    }
}
