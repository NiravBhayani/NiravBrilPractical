package Day4.Assignment4;

public class Main {
    public static void main(String[] args) {

        IWork PL1 = new PLEmployee("Nirav","Bhayani","9999999999",20000);
        IWork TL1 = new TLEmployee("Nirav","Limbani","8888888888",15000);
        IReport PL2 = new PLEmployee("Kushal","Senghani","6666666666",10000);
        IReport TL2 = new TLEmployee("Om","Makani","7777777777",5000);

        PLEmployee plEmployee = new PLEmployee("Nirav","Bhayani","9999999999",20000);
        IWork plEmployeeWork = plEmployee;
        IReport plEmployeeReport = plEmployee;

        TLEmployee tlEmployee = new TLEmployee("Nirav","Limbani","8888888888",15000);
        IWork tlEmployeeWork = tlEmployee;
        IReport tlEmployeeReport = tlEmployee;

        plEmployeeWork.doWork();
        plEmployeeReport.reportToSenior();

        tlEmployeeWork.doWork();
        tlEmployeeReport.reportToSenior();
    }
}
