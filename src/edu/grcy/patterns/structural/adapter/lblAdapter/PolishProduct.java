package edu.grcy.patterns.structural.adapter.lblAdapter;

public abstract class PolishProduct implements PolishPrice {
    double price;

    public double getPriceInSwedish() {
        return price * IkeaPriceConverter.SWEDISH_SEK.getConvert();
    }

}
