package service.impl;

import dto.PersonalInformationDto;
import exception.InvalidDataException;
import model.EmployeeRequest;
import service.RequestExecutor;
import utils.StringUtil;

public class PersonalInformationExecutor extends RequestExecutor<PersonalInformationDto> {

    @Override
    public Boolean checkRequestExists(EmployeeRequest employeeRequest) {
        System.out.printf("----Checking Personal Information Request Exists----%n");
        return employeeRequest.getEmployee()!=null;
    }

    @Override
    public void validateData(EmployeeRequest employeeRequest) {
        System.out.printf("----Validating Personal Information Request----%n");
        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployeeId()))
            throw new InvalidDataException("Employee ID is Empty");

        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployee().getEmail()))
            throw new InvalidDataException("Employee email is Empty");

        System.out.printf("----Bank Request is Valid----%n");


    }

    @Override
    public PersonalInformationDto extractData(EmployeeRequest employeeRequest) {

        System.out.printf("----Extracting Personal Information Request----%n");
        PersonalInformationDto dto = new PersonalInformationDto();
        dto.setEmployee(employeeRequest.getEmployee());
        dto.setEmployeeId(employeeRequest.getEmployeeId());
        return dto;
    }

    @Override
    public String getURI() {
        return "https://www.personalinformation.com/api/personalInformation";
    }
}
