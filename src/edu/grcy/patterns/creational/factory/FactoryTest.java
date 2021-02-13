package edu.grcy.patterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {


        //fabryka po to aby nie robic wywolan jak ponizej
        //MacBook macBook = new MacBookAir()

                //jak mamy fabryke to robimy nastepujaco

        MacBook macBookair = MacBookFactory.getMacBook("air", "64", "256", 13);
        MacBook macBookpro1 = MacBookFactory.getMacBook("pro", "512", "15", 20);


        MacBook nonExist = MacBookFactory.getMacBook("Oth","4","22", 30);
        /**
         * fabryki uzywamy jesli obiekty sa na tyle podobne ze
         * ich konstruktory przyjmuja ta sama liste parametrow
         *
         *
         * fabryki uzywamy jesli lista typow obiektow bedzie stala
         * niw bedzie rozrastac/zmiebiuac
         *
         * jesli lista typow sie zmienia - lamiemy ocp
         */
    }
}
