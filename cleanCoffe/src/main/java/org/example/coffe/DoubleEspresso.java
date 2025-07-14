package org.example.coffe;

public class DoubleEspresso extends BaseCoffee {
    public DoubleEspresso() {
        super("Double Espresso", 12);
    }

    @Override
    public String getRecipe() {
        return "2x Espresso";
    }
}