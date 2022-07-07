package Enum;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Pushok", Breed.BEAGLE, 3);
        Dog dog2 = new Dog("Rikki", Breed.LABRADOR, 5);
        Dog dog3 = new Dog("Elsa", Breed.DOBERMAN, 1);
        System.out.println(dog1.getName().equals(dog2.getName()));
        System.out.println(dog2.getName().equals(dog3.getName()));
        System.out.println("Rikki " + Breed.LABRADOR);
    }
}
