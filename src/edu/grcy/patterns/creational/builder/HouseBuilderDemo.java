package edu.grcy.patterns.creational.builder;

import java.util.Arrays;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {
        House smallHouse = new House.HouseBuilder("pustak", "ceramika", "dwuspad").build();
        House villageHouse = new House.HouseBuilder("wylewka", "cegla", "blachodachowka")
                .withGarden("dzialka na warzywa").build();
        House residence = new House.HouseBuilder("wylewka+bloczki", "drzewo", "siano")
                .withGarden("z basenem")
                .withGarage("wonostajacy dwuspad").build();


        House mediumHouse = new House.HouseBuilder("bloczki", "max", "szklany")
                .withGarage("w bryle")
                .withGarden("plac zabaw").build();

        List<House> houses = Arrays.asList(smallHouse, villageHouse, residence, mediumHouse);
        houses.forEach(x -> System.out.println("\n" + x.getHouse()));
    }
}
