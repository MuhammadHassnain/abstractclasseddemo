package dto;

import model.Employee;

public class PersonalInformationDto {
    private String employeeId;
    private Employee employee;

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

    @Override
    public String toString() {
        return "PersonalInformationDto{" +
                "employeeId='" + employeeId + '\'' +
                ", employee=" + employee +
                '}';
    }
}
