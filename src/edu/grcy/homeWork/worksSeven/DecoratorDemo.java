package edu.grcy.homeWork.worksSeven;

import java.util.Arrays;
import java.util.List;

public class DecoratorDemo {
    public static void main(String[] args) {

        final StaticsLogger statisticsLogger = new WithMeanStatisticsLogger(new WithSummaryStatisticsLogger(new ExecutionTimesBaseStatistics(List.of(1.2, 2.2, 3.4))));


        statisticsLogger.displayStatistics();


    }
}
