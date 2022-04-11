package Task8;

import java.util.ArrayList;

public class Employee {
    public String employeeId;
    public String name;

    public static void main(String[] args) {

        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("fixedPaidWorker1");
        employeeList.add("fixedPaidWorker2");
        employeeList.add("hourlyPaidWorker1");
        employeeList.add("hourlyPaidWorker2");


        SalariedEmployee fixedPaidWorker1 = new SalariedEmployee("1272782", "Orest Havryluk", 600);
        SalariedEmployee fixedPaidWorker2 = new SalariedEmployee("7868577", "Anna Kushnir", 750);
        ContractEmployee hourlyPaidWorker1 = new ContractEmployee("3890070", "Anton Melnyk", 450);
        ContractEmployee hourlyPaidWorker2 = new ContractEmployee("0125843", "Kateryna Ivanenko", 370);
        System.out.println(fixedPaidWorker1.calculatePay());

    }
}
