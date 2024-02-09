package Day4.Assignment4;

interface IWork{
    void doWork();
}
interface IReport{
    void reportToSenior();
}

public abstract class BaseEmployee implements IWork{
    private String firstName;
    private String lastName;
    private String empType;
    private double basicSalary;

    public BaseEmployee(){

    }
    public BaseEmployee(String firstName, String lastName, String empType, double basicSalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.empType = empType;
        this.basicSalary = basicSalary;
    }
    public  abstract void doWork();

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmpType(){
        return empType;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
}
