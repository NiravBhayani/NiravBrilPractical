package Day5.Assignment3;

public abstract class BaseEmployee {
    private String empCode;
    private String firstName;
    private String lastName;
    private String empType;
    private long basicSalary;

    public BaseEmployee(String empCode, String firstName, String lastName, String empType, long basicSalary){
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
    public long getBasicSalary(){
        return basicSalary;
    }
}
