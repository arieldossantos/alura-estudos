package io.github.arieldossantos.calculadoras;

import io.github.arieldossantos.Orcamento;
import io.github.arieldossantos.desconto.*;

public class Descontos {
    public double calcular(Orcamento orcamento) {
        Desconto d1 = new DescontoAcimaDe5Itens();
        Desconto d2 = new DescontoAcimaDe500Reais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.proximoDesconto(d2);
        d2.proximoDesconto(d3);
        d3.proximoDesconto(d4);

        return d1.calcularDesconto(orcamento);
    }
}
