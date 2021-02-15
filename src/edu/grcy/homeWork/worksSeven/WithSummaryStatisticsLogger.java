package edu.grcy.homeWork.worksSeven;

import java.util.List;

public class WithSummaryStatisticsLogger implements StaticsLogger{
    private final StaticsLogger staticsLogger;

    public WithSummaryStatisticsLogger(StaticsLogger staticsLogger) {
        this.staticsLogger = staticsLogger;
    }

    @Override
    public void displayStatistics() {
        System.out.println(getExecutionTimes().stream()
        .mapToDouble(x->x)
        .summaryStatistics());
        staticsLogger.displayStatistics();

    }

    @Override
    public List<Double> getExecutionTimes() {
        return staticsLogger.getExecutionTimes();
    }
}
