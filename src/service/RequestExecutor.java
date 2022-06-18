package service;

import model.EmployeeRequest;

public abstract class RequestExecutor<T> {

    public void execute(EmployeeRequest employeeRequest) {
        if (checkRequestExists(employeeRequest)) {
            validateData(employeeRequest);
            T data = extractData(employeeRequest);
            sendRequest(data);
        }
    }

    public void sendRequest(T data) {
        String URL = this.getURI();
        System.out.printf("Sending Data %s to %s%n", data.toString(), URL);
    }

    public abstract Boolean checkRequestExists(EmployeeRequest employeeRequest);

    public abstract void validateData(EmployeeRequest employeeRequest);

    public abstract T extractData(EmployeeRequest employeeRequest);

    public abstract String getURI();
}
