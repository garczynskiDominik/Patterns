package edu.grcy.homeWork.worksFive;

import java.util.Arrays;
import java.util.List;

public class DogBuilderDemo {
    public static void main(String[] args) {
        Dog tymek = new Dog.DogBuilder("tymek").build();
        Dog romek = new Dog.DogBuilder("tymek")
                .withType("owczarek")
                .build();
        Dog atomek = new Dog.DogBuilder("tymek")
                .withType("owczarek")
                .withAge(3)
                .build();
        Dog marek = new Dog.DogBuilder("tymek")
                .withType("owczarek")
                .withToys(Arrays.asList("kosc", "kij"))
                .build();


        List<Dog> dogs = Arrays.asList(tymek, romek, atomek, marek);
        dogs.forEach(System.out::println);
    }
}
