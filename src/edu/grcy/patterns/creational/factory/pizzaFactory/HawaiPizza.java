package edu.grcy.patterns.creational.factory.pizzaFactory;

public class HawaiPizza implements Pizza{
    private Thickness thickness;

    public HawaiPizza(Thickness thickness) {

    }

    @Override
    public String getReceipt() {
        return "Receipt: " + "Ananas" + "4 "+ thickness;
    }
}
