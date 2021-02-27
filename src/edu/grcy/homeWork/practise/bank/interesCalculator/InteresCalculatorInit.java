package edu.grcy.homeWork.practise.bank.interesCalculator;

public class InteresCalculatorInit {
    public void interesCalculatorInut(){
        DefaultInteresCalculator defaultInteresCalculator = DefaultInteresCalculator.getDEAFAULT_INTERES_CALCULATOR();
        defaultInteresCalculator.setFactor(1);
        defaultInteresCalculator.setConstant(1);

        VipInteresCalculator vipInteresCalculator = VipInteresCalculator.getVIP_INTERES_CALCULATOR();
        vipInteresCalculator.setFactor(1);
        vipInteresCalculator.setConstant(2);
        vipInteresCalculator.setVipBonus(2);
    }
}
