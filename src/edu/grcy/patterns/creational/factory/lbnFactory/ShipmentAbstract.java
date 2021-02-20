package edu.grcy.patterns.creational.factory.lbnFactory;

public abstract class ShipmentAbstract {
    protected Package aPackage;
    protected String destinationCountry;

    public ShipmentAbstract(Package aPackage, String destinationCountry) {
        this.aPackage = aPackage;
        this.destinationCountry = destinationCountry;
    }

    public abstract String getType();

    public abstract String getPackageSize();

    public abstract String getCountryOfRecipt();

    public abstract String getTypePriceOfShipment();

}
