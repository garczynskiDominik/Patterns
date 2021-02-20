package edu.grcy.patterns.creational.factory.lbnFactory;

public class AirShipment extends ShipmentAbstract{
    public AirShipment(Package aPackage, String destinationCountry) {
        super(aPackage, destinationCountry);
    }

    @Override
    public String getType() {
        return "Air";
    }

    @Override
    public String getPackageSize() {
        return"MEDIUM";
    }

    @Override
    public String getCountryOfRecipt() {
        return "Poland";
    }

    @Override
    public String getTypePriceOfShipment() {
        return "30";
    }
}
