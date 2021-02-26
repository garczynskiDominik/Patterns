package edu.grcy.patterns.structural.adapter.lblAdapter;

public enum IkeaPriceConverter {

    SWEDISH_SEK(2.24),
    POLISH_PLN(0.45);

    private double convert;

    IkeaPriceConverter(double convert) {
        this.convert = convert;
    }

    public double getConvert() {
        return convert;
    }
}
