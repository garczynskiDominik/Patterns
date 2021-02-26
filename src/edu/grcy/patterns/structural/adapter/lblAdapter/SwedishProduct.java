package edu.grcy.patterns.structural.adapter.lblAdapter;

public abstract class SwedishProduct implements SwedishPrice {
    double price;

    public double getPriceInPolish(){
        return  price*IkeaPriceConverter.POLISH_PLN.getConvert();
    }
}
