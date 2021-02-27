package edu.grcy.homeWork.practise.bank.interesCalculator;

public class InteresCalculatorFactory {
    /**
     * klasa fabryczna wybiera algorytm naliczania odsetek
     *
     * ktora wybiera algorytm naliczania odstek
     * algorytmy to osobne strategie
     *
     * ltore dodatkowo sa singletonami
     *
     */


    public static InteresCalculator getInterestCalculator(int capital) {
        if (capital > 50000) {
            return VipInteresCalculator.getVIP_INTERES_CALCULATOR();
        }
        return DefaultInteresCalculator.getDEAFAULT_INTERES_CALCULATOR();
    }
}
