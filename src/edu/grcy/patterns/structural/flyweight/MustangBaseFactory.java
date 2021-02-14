package edu.grcy.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {

    //zestaw nie powtarzalnych kombinacji kolor+engine
    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

    //metoda fabryczna
    public static FordMustangBase getMustangBase(String color, String engine) {
        FordMustangBase fordMustangBase;
        System.out.println(MustangBaseFactory.class + " getMustangBase");


        if (fordMustangBaseSet.size() > 0) {
            //jesli w zestawie cos jest to sprawdzamy czy zgadza sie z oczekiwana kombinacja
            System.out.println("Size > 1");

            fordMustangBase = fordMustangBaseSet.stream()
                    .filter(f -> color.equals(f.getColor()) && engine.equals(f.getEngine()))
                    .peek(s -> {
                        System.out.println("peek: " + s.getColor());
                    })
                    //jesli znajdziemy oczekiwana kombinacje to findAny ja zwroci
                    .findAny()
                    //jesli nie to tworzymy nowy
                    .orElseGet(() -> getNew(color, engine));

        } else {
            //przy pierwszym zamowieniu zestaw kombinacjii
            //jest pusty i przejedziemy tedy
            System.out.println("Size = 0");
            fordMustangBase = new FordMustangBase(color, engine);
        }
        //za kazdym razem probujemy dodac otrzymana kombinacje zestawu
        //ale poniewaz to SET to mamy gwarancje ze nie bedziemy trzymac
        //wielokrotnie tego samego zestawu
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }

    private static FordMustangBase getNew(String color, String engine) {
        System.out.println("OrElse");
        return new FordMustangBase(color, engine);
    }

    public static Set<FordMustangBase> getFordMustangBaseSet() {
        return fordMustangBaseSet;
    }
}

