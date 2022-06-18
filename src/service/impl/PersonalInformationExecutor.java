package service.impl;

import dto.PersonalInformationDto;
import exception.InvalidDataException;
import model.EmployeeRequest;
import service.RequestExecutor;
import utils.StringUtil;

public class PersonalInformationExecutor extends RequestExecutor<PersonalInformationDto> {

    @Override
    public Boolean checkRequestExists(EmployeeRequest employeeRequest) {
        return employeeRequest.getEmployee()!=null;
    }

    @Override
    public void validateData(EmployeeRequest employeeRequest) {
        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployeeId()))
            throw new InvalidDataException("Employee ID is Empty");

        if(StringUtil.isNullOrEmpty(employeeRequest.getEmployee().getEmail()))
            throw new InvalidDataException("Employee email is Empty");

    }

    @Override
    public PersonalInformationDto extractData(EmployeeRequest employeeRequest) {
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
