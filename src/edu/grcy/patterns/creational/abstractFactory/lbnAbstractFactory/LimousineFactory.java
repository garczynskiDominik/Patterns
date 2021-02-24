package edu.grcy.patterns.creational.abstractFactory.lbnAbstractFactory;

public class LimousineFactory  implements CarFactory{
    @Override
    public Engine getEngine() {
        return null;
    }

    @Override
    public Chassis getChassis() {
        return null;
    }

    @Override
    public Wheel getWheel() {
        return new TwentyInchGoldWheel();
    }
}
