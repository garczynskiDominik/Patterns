package edu.grcy.homeWork.practise.wolfpack;

public class YoungsterWolf extends Wolf {

    public final int MAX_AGE_FOR_YOUNGSTER = 3;
    private int age;

    public YoungsterWolf(String name) {
        super(name, WolfEnumType.YOUNG);
        age = 1;
    }

    public boolean shouldSeekNewGroup() {
        return MAX_AGE_FOR_YOUNGSTER - age <= 0;
    }

    public int increaseAge() {
        return age++;
    }

    @Override
    public String toString() {
        return "YoungsterWolf{" +
                ", name" + getName() +
                ", age=" + age +

                '}';
    }
}
