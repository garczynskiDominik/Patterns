package edu.grcy.patterns.creational.singleton.LbnSinglrton;

import java.util.ArrayList;
import java.util.List;

public class DataBaseSingleton implements PersonOperation {
    private static final DataBaseSingleton instance = new DataBaseSingleton();
    private List<Person> detailsOfPersons;

    private DataBaseSingleton() {
        detailsOfPersons=new ArrayList<>();
    }

    public static DataBaseSingleton getInstance () {
        return instance;
    }

    @Override
    public void addPersonToDataBase(Person person) {
        detailsOfPersons.add(person);
    }

    @Override
    public void removePersonToDataBase(Person person) {
        detailsOfPersons.remove(person);
    }

    @Override
    public void getPersonToDataBase(Person person) {
        System.out.println(person);
       }
    }
