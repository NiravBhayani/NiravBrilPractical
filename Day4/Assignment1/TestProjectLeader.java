package Day4.Assignment1;

public class TestProjectLeader {
    public static void main(String[] args) throws IllegalAccessException {
        if (args.length > 3 ){
            System.out.println("Usage: FirstName LastName MobileNumber");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        String mobileNumber = args[2];

        ProjectLeader projectLeader = new ProjectLeader(firstName , lastName, mobileNumber);
        projectLeader.printDetails();
    }
}
