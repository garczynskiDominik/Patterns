package edu.grcy.patterns.creational.prototype.lbnPrototype;

public class Square implements Cloneable {
    private int sideOfSquare;

    public Square() {
        this.sideOfSquare = 5;
    }

    public void setSideOfSquare(int sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public int getSideOfSquare() {
        return sideOfSquare;
    }

    @Override
    public String toString() {
        return "Square= " +
                "sideOfSquare= " + sideOfSquare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Square();
    }
}
