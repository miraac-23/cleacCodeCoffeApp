package org.example.coffe;

public class CaffeLatte extends BaseCoffee {
    public CaffeLatte() {
        super("Caffe Latte", 12);
    }

    @Override
    public String getRecipe() {
        return "1x Espresso\n3x Steamed Milk\n1x Milk Foam";
    }
}
