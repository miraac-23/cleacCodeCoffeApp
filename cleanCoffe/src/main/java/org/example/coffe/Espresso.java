package org.example.coffe;

public class Espresso extends BaseCoffee {
    public Espresso() {
        super("Espresso", 7);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso";
    }
}
