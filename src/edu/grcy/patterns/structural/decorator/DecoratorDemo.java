package edu.grcy.patterns.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        //zwykly samochod bezz dodatkow
        Car basic1 = new BasicCar();
        basic1.assemble();

        System.out.println("\n--------------------------------");
        Car basic2 = new BasicCar();
        SportPackage sportCar = new SportPackage(basic2, true);
        sportCar.assemble();
        System.out.println("\n--------------------------------");

        Car basic3 = new BasicCar();
        WinterPackage winterCar = new WinterPackage(basic3, false, true);
        SportPackage sportCar2 = new SportPackage(winterCar, false);
        sportCar2.assemble();

        System.out.println("\n--------------------------------");


        WinterPackage winterCar2 = new WinterPackage(new SportPackage(new BasicCar(), true), true, true);
        winterCar2.assemble();
        System.out.println("\n--------------------------------");


    }
}
