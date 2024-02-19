package Day9.Assignment1;

public class UserInfo {
    private int userId;
    private String name;
    private String address;
    private String city;
    private int basicSalary;
    private long telNumber;
    public String userRole;

    public UserInfo(int userId,String userRole , String name, String address, String city, int basicSalary, long telNumber) {
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.basicSalary = basicSalary;
        this.telNumber = telNumber;
        this.userRole = userRole;
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

    public int getBasicSalary() {
        return basicSalary;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public String getUserRole() {
        return userRole;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + "\nUser Role: " + userRole + "\nName: " + name + "\nAddress: " + address + "\nCity: " + city +
                "\nBasic Salary: " + basicSalary + "\nTel Number: " + telNumber;
    }
}
