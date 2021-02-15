package edu.grcy.homeWork.worksFive;

import java.util.List;

public class Dog {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys;

    private Dog(DogBuilder dogBuilder) {
        this.name = dogBuilder.name;
        this.type = dogBuilder.type;
        this.age = dogBuilder.age;
        this.toys = dogBuilder.toys;
    }


    @Override
    public String toString() {
        return "Dog: " +
                "name=" + name +
                (type != null ? ", type='" + type : "") +
                (age != null ? ", age=" + age : "") +
                (toys != null ? ", toys=" + toys : "");
    }

    public static class DogBuilder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public DogBuilder(String name) {
            this.name = name;
        }


        public DogBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public DogBuilder withAge(Integer age) {
            this.age = age;
            return this;
        }

        public DogBuilder withToys(List<String> toys) {
            this.toys = toys;
            return this;
        }

        public Dog build() {
            return new Dog(this);
        }
    }
}
