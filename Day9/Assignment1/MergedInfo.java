package Day9.Assignment1;

import java.text.DecimalFormat;

public class MergedInfo {
        private int userId;
        private String name;
        private String userRole;
        private String address;
        private String city;
        private String salary;
        private long telNumber;

        public MergedInfo(int userId, String userRole, String name, String address, String city, double basicSalary, long telNumber) {
            this.userId = userId;
            this.name = name;
            this.userRole = userRole;
            this.address = address;
            this.city = city;
            this.salary = formatSalary(basicSalary);
            this.telNumber = telNumber;
        }

        public String formatSalary(double basicSalary){
            DecimalFormat df = new DecimalFormat("#.##");
            double salary = basicSalary + (basicSalary * 0.12);
            return df.format(salary);
        }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getSalary() {
        return salary;
    }

    public long getTelNumber() {
        return telNumber;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + "\n" + "\nName: " + name + "\nAddress: " + address + "\nCity: " + city + "\nSalary: " + salary + "\nTel Number: " + telNumber;
    }
}
