package com.app.fruits;

public class orange extends Fruit {
    public orange(String name, double weight, String color, boolean isFresh) {
        super(name, color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sour";
    }
}