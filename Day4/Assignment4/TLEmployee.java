package Day4.Assignment4;

public class TLEmployee extends PLEmployee {

    public TLEmployee(){

    }

    public TLEmployee(String firstName, String lastName, String mobileNumber, double basicSalary) {
        super(firstName, lastName, mobileNumber, basicSalary);
    }

    @Override
    public void doWork() {
        assignTaskToJunior();
        collectReportFromJunior();
        reportToSenior();
        System.out.println("Forwarding report to senior management.");
    }
}
