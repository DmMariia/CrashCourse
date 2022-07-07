package Task6;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Vitalij", "Petrenko", "SoftServe");
        Employee employee2 = new Employee("Oksana", "Bondar", "SoftServe");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee2.toString());
    }
}
