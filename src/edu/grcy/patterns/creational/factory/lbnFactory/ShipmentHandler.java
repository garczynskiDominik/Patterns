package edu.grcy.patterns.creational.factory.lbnFactory;

import static edu.grcy.patterns.creational.factory.lbnFactory.Size.*;

public class ShipmentHandler {
    public ShipmentAbstract handlePackage(Package pack){
        ShipmentAbstract shipmentAbstract = null;
        switch (pack.getPackageSize()){
            case LARGE:
                shipmentAbstract = new SeaShipmentCreator().create(pack);
                break;
            case MEDIUM:
                shipmentAbstract = new AirShipmentCreator().create(pack);
                break;
            case SMALL:
                shipmentAbstract = new PostalShipmentCreator().create(pack);
        }
        return shipmentAbstract;
    }
}
