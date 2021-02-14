package edu.grcy.patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Volvo volvo = new Volvo("S40", 240); //w domysle predkosc w km\h

        Jeep jeep = new Jeep("Renegade", 110); //w domysle m\ph
        System.out.println(volvo.getName() + "max speed" + volvo.getSpeed());
        System.out.println(volvo.getName() + "max speed" + volvo.getSpeedMPH());

        System.out.println(jeep.getName() + " max speed: " + jeep.getSpeed());
        System.out.println(jeep.getName() + " max speed for Europe: " + jeep.getSpeedKMH());
    }
}
