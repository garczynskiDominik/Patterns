package edu.grcy.patterns.creational.factory.lbnFactory;

public class AirShipmentCreator implements ShipmentCreator{
    @Override
    public ShipmentAbstract create(Package pack) {
        return new AirShipment(pack, pack.getAdress());
    }
}
