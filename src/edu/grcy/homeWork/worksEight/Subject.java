package edu.grcy.homeWork.worksEight;

import edu.grcy.patterns.behavioral.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<AbstractObserver> observers;
    private int value = 0;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void subscribe(AbstractObserver observer) {
        observers.add(observer);
    }
    public int getStatus(){
        return value;
    }

    public void updateValue(int change) {
        value += change;
        observers.stream()
                .forEach(AbstractObserver::update);
    }

}
