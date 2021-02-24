package edu.grcy.patterns.creational.abstractFactory.lbnAbstractFactory;

public interface CarFactory {
    Engine getEngine();
    Chassis getChassis();
    Wheel getWheel();


}
