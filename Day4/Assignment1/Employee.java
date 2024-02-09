package Day4.Assignment1;

public class Employee {
    private String firstName;
    private String lastName;
    protected String empType;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String empType) {
        this.empType = empType;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmpType() {
        return empType;
    }

    public String getLastName() {
        return lastName;
    }
}
