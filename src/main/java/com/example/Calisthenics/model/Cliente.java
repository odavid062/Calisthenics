package com.example.Calisthenics.model;

public class Cliente {

    private final String name;


    public Cliente(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou estar em branco");
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
