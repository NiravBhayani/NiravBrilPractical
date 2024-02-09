package Day4.Assignment4;

public class PLEmployee extends BaseEmployee implements IReport {
    private String mobileNumber;

    public PLEmployee(){

    }

    public PLEmployee(String firstName, String lastName, String mobileNumber,double basicSalary){
        super(firstName,lastName,"PL",basicSalary);
        this.mobileNumber = mobileNumber;
    }

    public void doWork(){
        assignTaskToJunior();
        collectReportFromJunior();
        reportToSenior();
    }

    public void assignTaskToJunior(){
        System.out.println("Assigning task to Junior");
    }

    public void collectReportFromJunior(){
        System.out.println("Collecting report from junior");
    }

    public void reportToSenior(){
        System.out.println("Reporting to senior");
    }

    public String getMobileNumber(){
        return mobileNumber;
    }
}
