package edu.grcy.patterns.creational.factory.lbnFactory;

public class PostalShipment extends ShipmentAbstract{
    public PostalShipment(Package aPackage, String destinationCountry) {
        super(aPackage, destinationCountry);
    }

    @Override
    public String getType() {
        return "Postal";
    }

    @Override
    public String getPackageSize() {
        return "SMALL";
    }

    @Override
    public String getCountryOfRecipt() {
        return "Poland";
    }

    @Override
    public String getTypePriceOfShipment() {
        return "12$";
    }
}
