package edu.grcy.patterns.behavioral.strategy;

public class TravelDemo {
    public static void main(String[] args) {
        Travel travel = new Travel("rzesz", "warsz");
        travel.setTravelPlan(new WalkStrategy(false));
        travel.getTravelInfo();
        travel.setTravelPlan(new CarStrategy(true, false));
        travel.getTravelInfo();

        Travel travel1 = new Travel("rze", "wrc");
        travel1.setTravelPlan(new WalkStrategy(true));
        travel1.getTravelInfo();
        travel1.setTravelPlan(new CarStrategy(false, true));
        travel1.getTravelInfo();

    }
}
