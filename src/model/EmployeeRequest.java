package model;

public class EmployeeRequest {
    private String employeeId;
    private Employee employee;
    private BankInformation bankInformation;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BankInformation getBankInformation() {
        return bankInformation;
    }

    public void setBankInformation(BankInformation bankInformation) {
        this.bankInformation = bankInformation;
    }

    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "employeeId='" + employeeId + '\'' +
                ", employee=" + employee +
                ", bankInformation=" + bankInformation +
                '}';
    }
}
