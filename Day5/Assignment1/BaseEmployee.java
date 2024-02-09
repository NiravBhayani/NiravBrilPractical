package Day5.Assignment1;

public abstract class BaseEmployee{
    private String empCode;
    private String firstName;
    private String lastName;
    private String empType;
    private double basicSalary;

    public BaseEmployee(String empCode, String firstName, String lastName, String empType, double basicSalary){
        this.empCode =empCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.empType = empType;
        this.basicSalary = basicSalary;
    }

    public String getEmpCode(){
        return empCode;
    }
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
