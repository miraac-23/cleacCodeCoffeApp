package org.example.coffe;

public abstract class BaseCoffee implements Coffee {
    protected String name;
    protected int price;

    public BaseCoffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}