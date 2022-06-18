package service;

import exception.InvalidDataException;
import model.EmployeeRequest;

public abstract class RequestExecutor<T> {

    public void execute(EmployeeRequest employeeRequest) {
        System.out.printf("----Processing Request----%n");
        if (checkRequestExists(employeeRequest)) {
            validateData(employeeRequest);
            T data = extractData(employeeRequest);
            sendRequest(data);
        }
    }

    public void sendRequest(T data) {
        String URL = this.getURI();
        System.out.printf("----Sending Data %s to %s%n%n%n", data.toString(), URL);
    }

    public abstract Boolean checkRequestExists(EmployeeRequest employeeRequest);

    public abstract void validateData(EmployeeRequest employeeRequest) throws InvalidDataException;

    public abstract T extractData(EmployeeRequest employeeRequest);

    public abstract String getURI();
}
