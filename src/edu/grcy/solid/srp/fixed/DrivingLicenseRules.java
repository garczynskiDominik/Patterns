package edu.grcy.solid.srp.fixed;

public class DrivingLicenseRules {
private static final int DRIVING_LICENSE_REQUIRED_AGE =18;
    public static boolean canGetDrivinngLicense(Person person){
        return  person.getAge()>=DRIVING_LICENSE_REQUIRED_AGE;
    }
}
