package edu.grcy.patterns.creational.factory.lbnFactory;

public class Package {
    private Size packageSize;
    private String address;
    private boolean isFragile;

    public Package(Size packageSize, String address, boolean isFragile) {
        this.packageSize = packageSize;
        this.address = address;
        this.isFragile = isFragile;
    }

    public Size getPackageSize() {
        return packageSize;
    }

    public Package setPackageSize(Size packageSize) {
        this.packageSize = packageSize;
        return this;
    }

    public String getAdress() {
        return address;
    }

    public Package setAddress(String address) {
        this.address = address;
        return this;
    }

    public boolean isFragile() {
        return isFragile;
    }

    public Package setFragile(boolean fragile) {
        isFragile = fragile;
        return this;
    }
}
