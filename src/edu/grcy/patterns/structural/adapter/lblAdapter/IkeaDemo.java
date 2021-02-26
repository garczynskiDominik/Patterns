package edu.grcy.patterns.structural.adapter.lblAdapter;

public class IkeaDemo {
    public static void main(String[] args) {

        Table table = new Table("table", 10D);

        Chair chair = new Chair("chair", 20D);

        System.out.println(chair.getPriceInSwedish());
        System.out.println(chair.getPrice());
        System.out.println(table.getPriceInSwedish());
        System.out.println(table.getPrice());

    }
}
