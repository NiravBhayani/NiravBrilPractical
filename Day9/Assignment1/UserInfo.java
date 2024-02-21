package Day9.Assignment1;

public class UserInfo {
    private int userId;
    private String name;
    private String address;
    private String city;
    private double basicSalary;
    private long telNumber;

    public UserInfo(){

    }
    public UserInfo(int userId, String name, String address, String city, double basicSalary, long telNumber) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.basicSalary = basicSalary;
        this.telNumber = telNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public String getUserRole(String userRole) {
        return userRole;
    }

}
