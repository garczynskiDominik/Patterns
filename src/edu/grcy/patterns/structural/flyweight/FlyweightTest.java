package edu.grcy.patterns.structural.flyweight;

import java.util.Arrays;
import java.util.List;

public class FlyweightTest {
    public static void main(String[] args) {
        FordMustang mustang1 = new FordMustang("zielony", "4,5", "Sony");
        FordMustang mustang2 = new FordMustang("czerwony", "4,0", "Denon");
        FordMustang mustang3 = new FordMustang("zielony", "3,5", "Sony");
        FordMustang mustang4 = new FordMustang("czarny", "3,5", "radio");
        FordMustang mustang5 = new FordMustang("zielony", "4,5", "Denon");


        List<FordMustang> mustangs = Arrays.asList(mustang1,mustang2,mustang3,mustang4,mustang5);
        mustangs.forEach(x-> System.out.println(x.carInfo()));
        System.out.println("-----------------------------------------------------");
        System.out.println(MustangBaseFactory.getFordMustangBaseSet().size());
        MustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .forEach(x-> System.out.println(x.getColor()));
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
    }
}
