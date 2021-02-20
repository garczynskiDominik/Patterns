package edu.grcy.patterns.creational.factory.pizzaFactory;

public class PizzaReceiptFactory {



    Pizza getPizza(PizzaTypeEnum type, Thickness thickness){
        switch (type){
            case HAWAI:
                return new HawaiPizza(thickness);

            default:
                throw new RuntimeException("Pizza not found!");
        }
    }
}
