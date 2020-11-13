package io.github.arieldossantos.desconto;

import io.github.arieldossantos.Orcamento;

public class SemDesconto implements Desconto {
    @Override
    public double calcularDesconto(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void proximoDesconto(Desconto classeDoProximoDesconto) {
        //Não possui
    }
}
