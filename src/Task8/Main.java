package Task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("127", "Orest", 600));
        employees.add(new SalariedEmployee("701", "Ann", 750));
        employees.add(new ContractEmployee("389", "Anton", 10, 40));
        employees.add(new ContractEmployee("012", "Kate", 7, 25));
        employees.sort(Comparator.comparing(Employee::calculatePay));

        for (Employee iterator : employees) {
            System.out.println(iterator.toString());
        }
    }
}
