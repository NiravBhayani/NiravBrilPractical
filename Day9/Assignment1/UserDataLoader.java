package Day9.Assignment1;

import javax.management.MBeanTrustPermission;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserDataLoader extends Thread {
    private String filePath;
    private List<UserInfo> userInfoList;
    private static final List<UserInfo> userinfoList = Collections.synchronizedList(new ArrayList<>());


    public UserDataLoader(String filePath, List<UserInfo> userInfoList) {
        this.filePath = filePath;
        this.userInfoList = userInfoList;
    }

    @Override
    public void run() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                int userId = Integer.parseInt(parts[0]);
                String userRole = parts[1];
                String name = parts[2];
                String address = parts[3];
                String city = parts[4];
                int basicSalary = Integer.parseInt(parts[5]);
                long telNumber = Long.parseLong(parts[6]);
                Scanner scanner = new Scanner(System.in);

                switch (userRole){
                    case "Admin":
                        break;

                    case "Manager":

                        break;
                    case "Employee":
                        displayUserInfo("userName");
                        break;
                    default:
                        System.out.println("Invalid role!");
                }

                UserInfo userInfo = new UserInfo(userId, userRole, name, address, city, basicSalary, telNumber);
                synchronized (userInfoList) {
                    userInfoList.add(userInfo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void displayAllEmployees() {
        System.out.println("List of all employees:");
        for (UserInfo userInfo : userinfoList) {
            if (userInfo.getUserRole().equals("Employee")) {
                System.out.println(userInfo);
            }
        }
    }

    private static void displayAllUsers() {
        System.out.println("List of all users:");
        for (UserInfo userInfo : userinfoList) {
            System.out.println(userInfo);
        }
    }
    private static void displayUserInfo(String username) {
        for (UserInfo userInfo : userinfoList) {
            if (username.equals(userInfo.getName())) {
                System.out.println("User Information:");
                System.out.println(userInfo);
                break;
            }
        }
    }

}

