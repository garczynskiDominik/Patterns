package edu.grcy.homeWork.worksSeven;

import java.util.List;

public class WithMeanStatisticsLogger implements StaticsLogger{
    private final  StaticsLogger staticsLogger;

    public WithMeanStatisticsLogger(StaticsLogger staticsLogger) {
        this.staticsLogger = staticsLogger;
    }

    @Override
    public void displayStatistics() {
        final double mean = getExecutionTimes().stream()
                .mapToDouble(x->x)
                .sum()/getExecutionTimes().size();

        System.out.println("Mean is: " + mean);
        staticsLogger.displayStatistics();

    }

    @Override
    public List<Double> getExecutionTimes() {
        return staticsLogger.getExecutionTimes();
    }
}
