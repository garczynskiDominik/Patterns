package edu.grcy.patterns.creational.prototype;

import java.util.List;

public class ShoppingsDemo {
    public static void main(String[] args) {
        ShoppingList original = new ShoppingList();
        try {
            ShoppingList shoppingsForMonday = (ShoppingList) original.clone();
            List<String> mondayList = shoppingsForMonday.getShoppings();
            mondayList.remove("chleb");
            mondayList.add("Sok pomaranczowy");
            mondayList.add("Mars x6");
            shoppingsForMonday.setShoppings(mondayList);
            System.out.println("Maonday");
            shoppingsForMonday.getShoppings().forEach(System.out::println);
            System.out.println("-----------------------------------------------------------");

            ShoppingList shoppingsForFriday = (ShoppingList) original.clone();
            List<String> fridayList = shoppingsForFriday.getShoppings();
            fridayList.remove("pomidory");
            fridayList.add("szamp");
            fridayList.add("banan x6");
            System.out.println("Friday");
            shoppingsForFriday.setShoppings(fridayList);

            shoppingsForFriday.getShoppings().forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
