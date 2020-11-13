package io.github.arieldossantos;

import io.github.arieldossantos.util.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
    private float valor;
    private final List<Item> itens;

    public Orcamento(float valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public float getValor() {
        return valor;
    }

    //Adiciona item na lista
    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }
}
