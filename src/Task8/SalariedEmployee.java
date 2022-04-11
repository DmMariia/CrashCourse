package Task8;

public class SalariedEmployee extends Employee implements Pay {

    public String fixedPaidWorkers;
    public String socialSecurityNumber;
    public int avarageMonthlySalary;
    public int fixedMonthlyPayment;

    public SalariedEmployee (String employeeId, String name, int avarageMonthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.avarageMonthlySalary = avarageMonthlySalary;

    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}
