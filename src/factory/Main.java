package factory;

public class Main {

    public static void main(String[] args) {
    EmployeeFactory emp=new EmployeeFactory();
        Employee frontendDeveloper = emp.getEmployee("QA Tester");
        frontendDeveloper.roleDescription();
    }
}
