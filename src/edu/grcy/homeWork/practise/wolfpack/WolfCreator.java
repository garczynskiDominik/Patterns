package edu.grcy.homeWork.practise.wolfpack;

import static edu.grcy.homeWork.practise.wolfpack.WolfEnumType.*;

public class WolfCreator {
    public static Wolf createWolf(String wolfTypeShortcut, String wolfName){
        //factory style
        switch (WolfEnumType.getByShortcut(wolfTypeShortcut)){
            case ALFA:
                return AlfaWolf.getALFA();
            case HUNTER:
                return new HunterWolf(wolfName);
            case FEMALE:
                return new FemaleWolf(wolfName);
            case YOUNG:
                return new YoungsterWolf(wolfName);
            default:
                System.out.println("No wolf with type " + wolfTypeShortcut);
                return null;
        }
    }
}

