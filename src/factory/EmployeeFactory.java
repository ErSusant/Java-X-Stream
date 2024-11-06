package factory;

public class EmployeeFactory {

    public Employee getEmployee(String employeeType){
        if(employeeType==null){
            return null;
        }
        if(employeeType.equalsIgnoreCase("Frontend Developer")){
            return new FrontendDeveloper();
        }
        if(employeeType.equalsIgnoreCase("Backend Developer")){
            return new BackendDeveloper();
        }
        if(employeeType.equalsIgnoreCase("QA Tester")){
            return new QATester();

        }
        return null;


    }
     

}
