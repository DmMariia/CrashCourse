package Task8;

public class ContractEmployee extends Employee implements Pay {

    private int hourlyRate;
    private int numberOfHoursWorked;

    public ContractEmployee(String employeeId, String name, int hourlyRate, int numberOfHoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }

    @Override
    public int calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
}
