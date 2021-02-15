package edu.grcy.homeWork.worksEight;

public class ByTenChangedObserver extends AbstractObserver{

    private int previousStatus;

    public ByTenChangedObserver(Subject subject) {
        super(subject);
        previousStatus=subject.getStatus();
    }


    @Override
    public void update() {
        if (Math.abs(subject.getStatus()-previousStatus)>=10){
            System.out.println("Now statuus is: "+ subject.getStatus());
        }
        previousStatus=subject.getStatus();
    }
}
