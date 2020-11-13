package io.github.arieldossantos;

import io.github.arieldossantos.estados.EmAprovacao;
import io.github.arieldossantos.estados.Estado;
import io.github.arieldossantos.util.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
    private float valor;
    private final List<Item> itens;
    protected Estado estadoAtual;

    public Orcamento(float valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
    }

    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(Estado estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    //Adiciona item na lista
    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void adicionarDescontoExtra() {
        estadoAtual.aplicarDescontoExtra(this);
    }

    public void aprova() {
        estadoAtual.aprovar(this);
    }

    public void reprova() {
        estadoAtual.finalizar(this);
    }

    public void finaliza() {
        estadoAtual.reprovar(this);
    }

}
