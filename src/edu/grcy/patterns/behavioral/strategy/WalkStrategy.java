package edu.grcy.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {
    private boolean includeTouristicPaths;

    public WalkStrategy(boolean includeTouristicPaths) {
        this.includeTouristicPaths = includeTouristicPaths;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        String result = new StringBuilder("Travel by footh ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristicPaths ? " including touristic paths" : "")
                .toString();
        return result;
    }
}
