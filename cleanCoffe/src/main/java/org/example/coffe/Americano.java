package org.example.coffe;

public class Americano extends BaseCoffee {
    public Americano() {
        super("Americano", 10);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso\n4x Hot Water";
    }
}
