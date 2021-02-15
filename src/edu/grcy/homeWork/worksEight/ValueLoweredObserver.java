package edu.grcy.homeWork.worksEight;

public class ValueLoweredObserver extends AbstractObserver {
    private int previousState;

    public ValueLoweredObserver(final Subject subject) {
        super(subject);
        previousState = subject.getStatus();
    }

    @Override
    public void update() {
        if (subject.getStatus()<previousState){
            System.out.println("Now status is: " + subject.getStatus());
        }
        previousState = subject.getStatus();


    }
}
