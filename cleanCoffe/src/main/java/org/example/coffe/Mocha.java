package org.example.coffe;

public class Mocha extends BaseCoffee {
    public Mocha() {
        super("Mocha", 13);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso\n1x Steamed Milk\n1x Milk Foam\n2x Hot Chocolate";
    }
}
