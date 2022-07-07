package Enum;

import java.util.Objects;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Breed getBreed() {
        return breed;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public boolean equals(Object name) {
        if (this == name) {
            return true;
        } else if (name != null && this.getClass() == name.getClass()) {
            Dog dog = (Dog) name;
            return name == dog.name & Objects.equals(name, dog.name);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name});
    }
}
