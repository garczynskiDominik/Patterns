package edu.grcy.patterns.structural.decorator;

public class WinterPackage extends CarDecorator {
    private boolean electricMirrors;
    private boolean heatSeats;

    public WinterPackage(Car car, boolean electricMirrors, boolean heatSeats) {
        super(car);
        this.electricMirrors = electricMirrors;
        this.heatSeats = heatSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of winter package");
        System.out.println(electricMirrors ? "electric mirror" : "");
        System.out.println(electricMirrors&&heatSeats ? ",":"");
        System.out.println(heatSeats ? "heated seats" : "");
    }

}
