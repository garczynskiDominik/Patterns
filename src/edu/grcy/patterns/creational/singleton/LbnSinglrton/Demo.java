package edu.grcy.patterns.creational.singleton.LbnSinglrton;

public class Demo {
    public static void main(String[] args) {
        DataBaseSingleton base = DataBaseSingleton.getInstance();
        DataBaseSingleton base1= DataBaseSingleton.getInstance();


        base.addPersonToDataBase(new Person("Dominik", "Garczynski", "zg@gmail.com", 72584632));

    }
}
