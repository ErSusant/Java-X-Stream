package factory;

public class BackendDeveloper implements Employee{
    @Override
    public void roleDescription() {
        System.out.println("I handle the server side logic,database,api using java and spring");
    }
}
