package edu.grcy.patterns.creational.builder.lbnBuilder;

public class Profile {
    private String nick;
    private String email;
    private String password;

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer phoneNumber;

    private Profile(ProfileBuilder builder) {
        this.nick = builder.nick;
        this.email = builder.email;
        this.password = builder.password;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;


    }


    public String getNick() {
        return nick;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Profile= " + nick + " || " + email + " || " + password + " || " +
                (firstName != null ? firstName + " || " : "") +
                (lastName != null ? lastName + " || " : "") +
                (age != 0 ? "age: " + age + " || " : "") +
                (phoneNumber != 0 ? "phoneNumber: " + phoneNumber + " || " : "");
    }


    public static class ProfileBuilder {
        private String nick;
        private String email;
        private String password;

        private String firstName;
        private String lastName;
        private int age;
        private int phoneNumber;

        public ProfileBuilder(String nick, String email, String password) {
            this.nick = nick;
            this.email = email;
            this.password = password;
        }

        public ProfileBuilder withfirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ProfileBuilder withlastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ProfileBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public ProfileBuilder withPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Profile build() {
            return new Profile(this);
        }
    }
}
