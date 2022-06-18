import model.BankInformation;
import model.Employee;
import model.EmployeeRequest;
import service.RequestExecutor;
import service.impl.BankInformationExecutor;
import service.impl.PersonalInformationExecutor;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassDemoMain {


    public static void main(String[] args) {
        EmployeeRequest employeeRequest = new EmployeeRequest();
        employeeRequest.setEmployeeId("A104");

        Employee employee = new Employee();
        employee.setEmail("mateJanos@mail.com");
        employee.setName("Mate Jones");
        employee.setPhoneNo("+92301123456789");

        employeeRequest.setEmployee(employee);

        BankInformation bankInformation = new BankInformation();
        bankInformation.setBankName("ABC Bank");
        bankInformation.setAccountNo("12345678");
        bankInformation.setBranchName("ABC Branch");
        bankInformation.setBranchCode("1234");
        
        employeeRequest.setBankInformation(bankInformation);

        List<RequestExecutor<?>> executorsList = new ArrayList<>();
        
        executorsList.add(new BankInformationExecutor());
        executorsList.add(new PersonalInformationExecutor());

        for (RequestExecutor<?> requestExecutor :
                executorsList) {
            requestExecutor.execute(employeeRequest);
        }
    }
}
