package edu.grcy.patterns.behavioral.templateMethod;

public class PhoneNewsProvider extends NewsProvider {
    private String phone;

    public PhoneNewsProvider(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean authorize() {
        System.out.println("authorized phone number " + phone);
        return false;
    }

    @Override
    public boolean endConnection() {
        System.out.println("connection terminated with: " + phone);
        return super.endConnection();
    }
}
