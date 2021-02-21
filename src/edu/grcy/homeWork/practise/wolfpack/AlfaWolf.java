package edu.grcy.homeWork.practise.wolfpack;

public class AlfaWolf extends Wolf{


    private static final Wolf ALFA = new AlfaWolf();


    private AlfaWolf(){
        super("Alfa", WolfEnumType.ALFA);
    }
    public static Wolf getALFA(){
        return ALFA;
    }


    @Override
    public String toString() {
        return "AlfaWolf{}"+
                " ,name " + getName();
    }
}