package edu.grcy.patterns.creational.factory.lbnFactory;

public interface ShipmentCreator {
    ShipmentAbstract create(Package pack);
}
