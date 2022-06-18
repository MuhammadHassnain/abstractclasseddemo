package service.impl;

import dto.BankInformationDto;
import exception.InvalidDataException;
import model.EmployeeRequest;
import service.RequestExecutor;
import utils.StringUtil;

public class BankInformationExecutor extends RequestExecutor<BankInformationDto> {
    @Override
    public Boolean checkRequestExists(EmployeeRequest employeeRequest) {
        return employeeRequest.getBankInformation()!=null;
    }

    @Override
    public void validateData(EmployeeRequest employeeRequest) throws InvalidDataException {
        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployeeId()))
            throw new InvalidDataException("Employee Id is empty");
        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getAccountNo()))
            throw new InvalidDataException("Account No is required");

        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getBranchCode()))
            throw new InvalidDataException("Branch Code is required");

        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getBranchName()))
            throw new InvalidDataException("Branch name is required");
    }

    @Override
    public BankInformationDto extractData(EmployeeRequest employeeRequest) {
        BankInformationDto bankInformationDto = new BankInformationDto();
        bankInformationDto.setBankInformation(employeeRequest.getBankInformation());
        bankInformationDto.setEmployeeId(employeeRequest.getEmployeeId());
        return bankInformationDto;
    }

    @Override
    public String getURI() {
        return "https://www.digitalBank.com/employee";
    }
}
