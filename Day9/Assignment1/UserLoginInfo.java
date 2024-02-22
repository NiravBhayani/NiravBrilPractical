package Day9.Assignment1;

public class UserLoginInfo {

    private int userId;
    private String username;
    private String password;
    private String userRole;

    public UserLoginInfo(){

    }
    public UserLoginInfo(int userId, String password,String userRole,String username){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userRole = userRole;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserRole() {
        return userRole;
    }
}
