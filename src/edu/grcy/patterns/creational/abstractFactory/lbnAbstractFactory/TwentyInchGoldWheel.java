package edu.grcy.patterns.creational.abstractFactory.lbnAbstractFactory;

public class TwentyInchGoldWheel implements Wheel{
    @Override
    public Integer getWhellSize() {
        return 20;
    }

    @Override
    public Double getWeight() {
        return 21.0;
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}
