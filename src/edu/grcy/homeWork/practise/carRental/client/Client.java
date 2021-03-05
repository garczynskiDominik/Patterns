package edu.grcy.homeWork.practise.carRental.client;

public class Client {
    private String name;
    private String surname;
    private int age;
    private boolean hasDrivingLicense;

    public Client(String name, String surname, int age, boolean hasDrivingLicense) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getClientInfo() {
        return new StringBuilder(getFullName())
                .append(", age: ")
                .append(age)
                .append(hasDrivingLicense ? ",  have driving license" : "")
                .toString();
    }
}
