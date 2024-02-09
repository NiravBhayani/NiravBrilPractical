package Day4.Assignment1;

public class ProjectLeader extends Employee {
    private String mobileNumber;

    public ProjectLeader(String firstName,String lastName,String mobileNumber) throws IllegalAccessException {
        super(firstName, lastName,"PL");
        this.mobileNumber = validatemobileNumber(mobileNumber);
    }
    private String validatemobileNumber(String mobileNumber) throws IllegalAccessException {
        if (mobileNumber.matches("[0-9]{10}")){
            return mobileNumber;
        }else {
            throw new IllegalAccessException("Invalid Mobile Number");
        }
    }

    public void printDetails(){
        System.out.println("Employee Details:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Employee Type: " + getEmpType());
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
