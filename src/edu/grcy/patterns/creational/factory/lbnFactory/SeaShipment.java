package edu.grcy.patterns.creational.factory.lbnFactory;

public class SeaShipment extends ShipmentAbstract{
    public SeaShipment(Package aPackage, String destinationCountry) {
        super(aPackage, destinationCountry);
    }

    @Override
    public String getType() {
        return "sea";
    }

    @Override
    public String getPackageSize() {
        return "LARGE";
    }

    @Override
    public String getCountryOfRecipt() {
        return "Poland";
    }

    @Override
    public String getTypePriceOfShipment() {
        return "100";
    }
}
