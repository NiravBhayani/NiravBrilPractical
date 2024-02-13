package Day4.Assignment3;

public class PLEmployee extends BaseEmployee {
    private String mobileNumber;
    public PLEmployee(){

    }

    public PLEmployee(String firstName, String lastName, String mobileNumber,double basicSalary){
        super(firstName,lastName,"PL",basicSalary);
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void doWork(){
        assignTaskToJunior();
        collectReportFromJunior();
        reportToSenior();
    }

    private void assignTaskToJunior(){
        System.out.println("Assigning task to Junior");
    }

    private void collectReportFromJunior(){
        System.out.println("Collecting report from junior");
    }

    private void reportToSenior(){
        System.out.println("Reporting to senior");
    }

    public String getMobileNumber(){
        return mobileNumber;
    }

    @Override
    public String toString() {
        return "PLEmployee{" +
                "mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
