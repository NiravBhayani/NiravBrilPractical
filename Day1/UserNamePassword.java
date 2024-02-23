package Day1;

public class UserNamePassword {
    private String userCode = "Nirav";
    private String password = "nirav123";
    // constants class

    public boolean validate(String userCode, String password) {
        if (null == userCode || null == password || userCode.isEmpty() || password.isEmpty()) {
            System.out.println("null check");
        }
        //null check
        //empty check
        return userCode.equals(userCode) && password.equals(password);
    }
}
