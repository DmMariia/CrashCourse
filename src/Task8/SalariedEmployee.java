package Task8;

public class SalariedEmployee extends Employee implements Pay {
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, int fixedMonthlyPayment) {
        this.employeeId = employeeId;
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
}
