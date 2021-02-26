package edu.grcy.patterns.creational.prototype.lbnPrototype;

import javax.swing.plaf.IconUIResource;

public class ShapesDemo {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Square square = new Square();
        System.out.println(square);

        System.out.println(circle);


        try {
            Circle circle1 = (Circle) circle.clone();
            circle1.setRadius(5.12);
            Square square1 = (Square) square.clone();
            square1.setSideOfSquare(9);
            System.out.println(square1);
            System.out.println(circle1);
            Circle circle2 = (Circle) circle1.clone();
            circle2.setRadius(7.12);
            System.out.println(circle2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
