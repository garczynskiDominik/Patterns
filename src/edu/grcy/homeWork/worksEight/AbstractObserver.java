package edu.grcy.homeWork.worksEight;

public abstract  class AbstractObserver {
    protected Subject subject;

    public AbstractObserver(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public abstract void update();
}
