package edu.grcy.homeWork.worksEight;

import edu.grcy.patterns.behavioral.observer.Observer;

public class ConcreteValueObserver extends AbstractObserver {

    public ConcreteValueObserver(final Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getStatus());
    }

}
