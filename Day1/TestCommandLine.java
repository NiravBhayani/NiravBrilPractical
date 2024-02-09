package Day1;

public class TestCommandLine {
    public static void main(String[] args) {
        String inputUserCode = args[0];
        String inputPassword = args[1];

        UserNamePassword userNamePassword = new UserNamePassword();

        if(userNamePassword.validate(inputUserCode,inputPassword)){
            System.out.println("validation complete");
        } else{
            System.out.println("validation unsuccessful ");
        }
    }
}
