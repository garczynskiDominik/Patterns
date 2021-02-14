package edu.grcy.patterns.creational.abstractFactory;

public class FordCreatorDemo {
    public static void main(String[] args) {
        Ford fiesta1 = FordOrdersPoint.orderNewFord(
                new FordFiestFactory("Fiesta 1.2", "1.2 EcoBoost", "red")
        );
        Ford fiesta2 = FordOrdersPoint.orderNewFord(
                new FordFiestFactory("Fiesta 1.0", "1.0", "Blue")
        );

        Ford focus1 = FordOrdersPoint.orderNewFord(new FordFocusFactory("Focus 1.6T", "1.6Tdi", "Black")
        );


        System.out.println(fiesta1.getName() + ", engine: " + fiesta1.getEngine() + ", addsons: " + fiesta1.getAddons());
        System.out.println(fiesta2.getName() + ", engine: " + fiesta2.getEngine() + ", addsons: " + fiesta2.getAddons());
        System.out.println(focus1.getName() + ", engine: " + focus1.getEngine() + ", addsons: " + focus1.getAddons());


    }
}
