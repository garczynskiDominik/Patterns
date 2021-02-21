package edu.grcy.homeWork.practise.wolfpack;

public abstract class Wolf {
    private String name;
    private WolfEnumType type;


    public Wolf(String name, WolfEnumType type) {
        this.name = name;
        this.type=type;

    }

    public WolfEnumType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
