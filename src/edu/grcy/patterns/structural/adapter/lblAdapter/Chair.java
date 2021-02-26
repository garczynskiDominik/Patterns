package edu.grcy.patterns.structural.adapter.lblAdapter;

public class Chair extends PolishProduct {

    private String name;


    public Chair(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
