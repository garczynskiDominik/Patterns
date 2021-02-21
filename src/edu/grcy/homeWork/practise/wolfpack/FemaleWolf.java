package edu.grcy.homeWork.practise.wolfpack;

public class FemaleWolf extends Wolf{
    private int noPregnancies;
    public FemaleWolf(String name) {
        super(name, WolfEnumType.FEMALE);
        this.noPregnancies = 0;
    }
    public int increasePregnancies(){
        return noPregnancies++;
    }
    public int getNoPregnancies() {
        return noPregnancies;
    }
    @Override
    public String toString() {
        return "FemaleWolf{" +
                "name="+getName()+
                "noPregnancies=" + noPregnancies +
                '}';
    }
}
