package Task8;

public class ContractEmployee extends Employee implements Pay {

    public String hourlyPaidWorkers;
    public String federalTaxidmember;
    public int avarageMonthlySalary;
    public int hourlyRate;
    public int numberOfHoursWorked;

    public ContractEmployee(String employeeId, String name, int avarageMonthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.avarageMonthlySalary = avarageMonthlySalary;

    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
