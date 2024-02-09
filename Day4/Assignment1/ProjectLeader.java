package Day4.Assignment1;

public class ProjectLeader extends Employee {
    private String mobileNumber;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public ProjectLeader() {

    }

    public ProjectLeader(String firstName, String lastName, String mobileNumber) {
        super(firstName, lastName, "PL");
        this.mobileNumber = mobileNumber;
    }

    public void printDetails(){
        System.out.println("Employee Details:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Employee Type: " + getEmpType());
        System.out.println("Mobile Number: " + getMobileNumber());
    }
}
