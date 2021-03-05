package edu.grcy.homeWork.practise.carRental.car;

public enum CarKind {
    CAR("passenger", "pc"),
    TRUCK("cargo", "cv");

    private String info;
    private String shortcut;

    CarKind(String info, String shortcut) {
        this.info = info;
        this.shortcut = shortcut;
    }
    public String getInfo(){
        return info;

    }

    public static CarKind getByShortcut(String shortName) {
        for (CarKind carKind : CarKind.values()) {
            if (shortName.equals(carKind.shortcut)) {
                return carKind;
            }
        }
        return null;
    }


}
