package service;

import model.EmployeeRequest;

public abstract class RequestExecutor<T> {

    public void execute(EmployeeRequest employeeRequest) {

    }

    public void sendRequest(T data) {

    }

    public abstract Boolean checkRequestExists(EmployeeRequest employeeRequest);

    public abstract void validateData(EmployeeRequest employeeRequest);

    public abstract T extractData(EmployeeRequest employeeRequest);

    public abstract String getURI();
}
