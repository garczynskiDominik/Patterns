package edu.grcy.patterns.creational.builder.lbnBuilder;

public class ProfileDemo {
    public static void main(String[] args) {

        Profile tomek = new Profile.ProfileBuilder("tomek123", "tomek@gmail.com", "dupa123").build();
        System.out.println(tomek);


        Profile dominik = new Profile.ProfileBuilder("dominik456", "dominik@gmail.com", "kon123").withAge(28).build();
        System.out.println(dominik);

        Profile natalka = new Profile.ProfileBuilder("natalka789", "natalka@gmail.com", "drzewo123")
                .withfirstName("Natalia")
                .withlastName("Garczynska")
                .withPhoneNumber(666999888)
                .withAge(28)
                .build();

        System.out.println(natalka);

    }
}
