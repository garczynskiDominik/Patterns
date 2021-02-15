package edu.grcy.homeWork.worksEight;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ConcreteValueObserver observer = new ConcreteValueObserver(subject);
        observer.update();
        subject.updateValue(5);
        ValueLoweredObserver observer1 = new ValueLoweredObserver(subject);
        observer1.update();
        subject.updateValue(3);
        ByTenChangedObserver observer2 = new ByTenChangedObserver(subject);
        observer2.update();
    }
}
