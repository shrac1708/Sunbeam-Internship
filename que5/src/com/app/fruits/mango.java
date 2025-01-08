package com.app.fruits;

public class mango extends Fruit {
    public mango(String name, double weight, String color, boolean isFresh) {
        super(name, color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sweet";
    }
}
