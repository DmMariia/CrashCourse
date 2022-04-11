package Task4;

public class Person {
    private String name;
    private int birthYear;

    public String getName() {
        return this.name;
    }
    public int getBirthYear() {
        return this.birthYear;
    }


    public Person() {

    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


    public int age() {

        return age();
    }

    public void input(String name, int birthYear) {
    }

    public void output(String name, int birthYear) {

    }

    public String changeName() {
        return changeName();

    }
    public static void main(String[] args) {
        Person person1 = new Person("Iryna", 2000);
        System.out.println(person1.getName() + ' ' + person1.getBirthYear());
        Person person2 = new Person("Oleksij", 1996);
        System.out.println(person2.getName() + ' ' + person2.getBirthYear());
        Person person3 = new Person("Anastasiia", 2002);
        System.out.println(person3.getName() + ' ' + person3.getBirthYear());
        Person person4 = new Person("Andrij", 1983);
        System.out.println(person4.getName() + ' ' + person4.getBirthYear());
        Person person5 = new Person("Oleksandr", 1991);
        System.out.println(person5.getName() + ' ' + person5.getBirthYear());

    }
}
