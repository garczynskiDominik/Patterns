package edu.grcy.patterns.structural.adapter.lblAdapter;

public class Table extends PolishProduct{
    private String name;


    public Table(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
