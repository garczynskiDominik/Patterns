package edu.grcy.homeWork.practise.bank.interesCalculator;

public class DefaultInteresCalculator implements InteresCalculator {
    private static DefaultInteresCalculator DEAFAULT_INTERES_CALCULATOR;
    private int factor;
    private int constant;
    private int baseInteresRate;


    public DefaultInteresCalculator() {
        this.factor = 0;
        this.constant = 0;
        this.baseInteresRate=1;
    }

    public static DefaultInteresCalculator getDEAFAULT_INTERES_CALCULATOR() {
        System.out.println("Wybrany " + DefaultInteresCalculator.class.getSimpleName());
        if (DEAFAULT_INTERES_CALCULATOR ==null){
            DEAFAULT_INTERES_CALCULATOR = new DefaultInteresCalculator();
        }
        return DEAFAULT_INTERES_CALCULATOR;
    }

    @Override
    public int countInteres(int capitalBalance) {
        return Math.round(capitalBalance*(baseInteresRate*factor+constant)/100);
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getConstant() {
        return constant;
    }

    public void setConstant(int constant) {
        this.constant = constant;
    }
}
