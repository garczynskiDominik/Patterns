package edu.grcy.homeWork.practise.bank.interesCalculator;

public class VipInteresCalculator implements InteresCalculator {


    private static VipInteresCalculator VIP_INTERES_CALCULATOR = new VipInteresCalculator();
    private int factor;
    private int constant;
    private int vipBonus;
    private int baseInteres;

    private VipInteresCalculator() {
        baseInteres = 1;

    }

    public static VipInteresCalculator getVIP_INTERES_CALCULATOR() {
        System.out.println("Wybrano " + VipInteresCalculator.class.getSimpleName());
        return VIP_INTERES_CALCULATOR;
    }

    public void setVIP_INTERES_CALCULATOR(VipInteresCalculator VIP_INTERES_CALCULATOR) {
        this.VIP_INTERES_CALCULATOR = VIP_INTERES_CALCULATOR;
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

    public int getVipBonus() {
        return vipBonus;
    }

    public void setVipBonus(int vipBonus) {
        this.vipBonus = vipBonus;
    }

    @Override
    public int countInteres(int capitalBalance) {
        return Math.round(capitalBalance * (baseInteres * factor + constant + vipBonus) / 100);
    }
}
