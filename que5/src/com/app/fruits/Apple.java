package com.app.fruits;


public class Apple extends Fruit {
    public Apple(String name, double weight, String color, boolean isFresh) {
        super(name, color, weight, isFresh);
    }

    @Override
    public String taste() {
        return "sweet n sour";
    }
}
