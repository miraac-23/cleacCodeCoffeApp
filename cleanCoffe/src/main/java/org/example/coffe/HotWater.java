package org.example.coffe;

public class HotWater extends BaseCoffee {
    public HotWater() {
        super("Hot Water", 3);
    }

    @Override
    public String getRecipe() {
        return "5x Hot Water";
    }
}