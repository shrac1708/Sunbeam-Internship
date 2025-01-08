package com.app.fruits;

public class Fruit {
    private String color;
    private double weight;
    private String name;
    private boolean isFresh;

    public Fruit(String name, String color, double weight, boolean isFresh) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    public String getName() {
        return name;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public String taste() {
        return "no specific taste";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Weight: " + weight;
    }

		}

   