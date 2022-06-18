package dto;

import model.BankInformation;

public class BankInformationDto {

    private String employeeId;
    private BankInformation bankInformation;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public BankInformation getBankInformation() {
        return bankInformation;
    }

    public void setBankInformation(BankInformation bankInformation) {
        this.bankInformation = bankInformation;
    }

    @Override
    public String toString() {
        return "BankInformationDto{" +
                "employeeId='" + employeeId + '\'' +
                ", bankInformation=" + bankInformation +
                '}';
    }
}
