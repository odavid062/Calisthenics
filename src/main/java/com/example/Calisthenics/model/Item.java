package com.example.Calisthenics.model;

public class Item {
    private final String descricao;

    public Item(String descricao){
        if (descricao == null || descricao.isBlank()){
            throw new IllegalArgumentException("A descrição do item não pode ser nula ou estar em branco");

        }
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
