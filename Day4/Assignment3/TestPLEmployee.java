package Day4.Assignment3;

public class TestPLEmployee {
    public static void main(String[] args) {
        PLEmployee alexRichard = new PLEmployee("Alex","Richard","9393939393",10000);

        System.out.println("Name: " + alexRichard.getFirstName() + alexRichard.getLastName());
        System.out.println("Employee Type: "+ alexRichard.getEmpType());
        System.out.println("Mobile Number: "+ alexRichard.getMobileNumber());
        System.out.println("Basic salary: "+ alexRichard.getBasicSalary());
        System.out.println(alexRichard.toString());
//        alexRichard.doWork();
    }
}
