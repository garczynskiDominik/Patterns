package edu.grcy.patterns.creational.prototype.lbnPrototype;

public class Circle implements Cloneable {
    private double radius;


    public Circle() {
        this.radius = 3.14;
    }

    public void loadRadius() {
        radius = 4.13;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle();
    }

    @Override
    public String toString() {
        return "Circle: " + radius;
    }
}
