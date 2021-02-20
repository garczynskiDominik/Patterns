package edu.grcy.patterns.behavioral.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        int sum = 0;

        Calculator priceCalc = new PriceCalculator();

        Merchandise butter = new Butter(5, 5, "Lowickie");
        Merchandise bosch = new Fridge(2000, 2000, "Bosch");
        Merchandise electrolux = new Fridge(300, 1200, "Electrolux");
        Merchandise corn = new Cereal(0.56F, 12, "Corn");
        sum += butter.accept(priceCalc);
        sum += bosch.accept(priceCalc);
        sum += electrolux.accept(priceCalc);

        sum += corn.accept(priceCalc);

        System.out.println("\n\n" + sum);


    }
}
