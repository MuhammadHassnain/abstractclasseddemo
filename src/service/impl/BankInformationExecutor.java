package service.impl;

import dto.BankInformationDto;
import exception.InvalidDataException;
import model.EmployeeRequest;
import service.RequestExecutor;
import utils.StringUtil;

public class BankInformationExecutor extends RequestExecutor<BankInformationDto> {
    @Override
    public Boolean checkRequestExists(EmployeeRequest employeeRequest) {
        System.out.printf("----Check Bank Request Exists----%n");
        return employeeRequest.getBankInformation()!=null;
    }

    @Override
    public void validateData(EmployeeRequest employeeRequest) throws InvalidDataException {
        System.out.printf("----Validating Bank Request----%n");

        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployeeId()))
            throw new InvalidDataException("Employee Id is empty");
        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getAccountNo()))
            throw new InvalidDataException("Account No is required");

        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getBranchCode()))
            throw new InvalidDataException("Branch Code is required");

        if(StringUtil.isNullOrEmpty(employeeRequest.getBankInformation().getBranchName()))
            throw new InvalidDataException("Branch name is required");

        System.out.printf("----Bank Request is Valid----%n");

    }

    @Override
    public BankInformationDto extractData(EmployeeRequest employeeRequest) {
        System.out.printf("----Extracting Bank Request----%n");
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
