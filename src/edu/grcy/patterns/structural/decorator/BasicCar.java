package edu.grcy.patterns.structural.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print("Assemble of Basic Car.");
    }
}
