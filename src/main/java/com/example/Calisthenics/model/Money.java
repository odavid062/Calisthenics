package com.example.Calisthenics.model;

public class Money {
    private final double value;

    public Money(double value){
        if (value < 0 ){
            throw new IllegalArgumentException("O valor não pode ser negativo");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    public Money multiply(double factor){
        return new Money(this.value * factor);

    }
    public Money add(Money other){
        return new Money(this.value + other.value);
    }

}
