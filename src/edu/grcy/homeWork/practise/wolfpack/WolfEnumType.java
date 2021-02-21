package edu.grcy.homeWork.practise.wolfpack;

public enum WolfEnumType {

        ALFA("a"),
        FEMALE("f"),
        HUNTER("h"),
        YOUNG("y");

        private String shortcut;


        WolfEnumType(String shortcut){
            this.shortcut = shortcut;
        }
        public static WolfEnumType getByShortcut(String shortcut){
            for (WolfEnumType wolfType : WolfEnumType.values()){
                if (wolfType.shortcut.equals(shortcut)){
                    return wolfType;
                }
            }
            return null;
        }
    }
