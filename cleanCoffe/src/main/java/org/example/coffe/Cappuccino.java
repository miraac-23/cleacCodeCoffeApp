package org.example.coffe;

public class Cappuccino extends BaseCoffee {
    public Cappuccino() {
        super("Cappuccino", 12);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso\n2x Steamed Milk\n2x Milk Foam";
    }
}