package Day9.Assignment1;

import java.util.*;

class Main {
    private static final String login_info = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/login_info";
    private static final String user_info = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/user_info";

    private static final List<UserInfo> userInfoList = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        loadUserData();
        startFinderProcess();
    }

    private static void loadUserData() {
        UserDataLoader loginInfoLoader = new UserDataLoader(login_info , userInfoList);
        UserDataLoader userInfoLoader = new UserDataLoader(user_info, userInfoList);
        loginInfoLoader.start();
        userInfoLoader.start();
        try {
            loginInfoLoader.join();
            userInfoLoader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void startFinderProcess() {
        System.out.println("Welcome to User Information System!");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 3; i++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.println("Welcome, " + username + "!");
            System.out.println("Personal Information:");
            String userRole = scanner.nextLine();

            if (authenticateUser(username, password)) {
                displayUserInfo(username);
                switch (userRole) {
                    case "Manager":
                        displayAllEmployees();
                        break;
                    case "Admin":
                        displayAllUsers();
                        break;
                    case "Employee":
                        displayUserInfo(username);
                        break;
                    default:
                        System.out.println("Invalid role!");
                }
                break;
            } else {
                System.out.println("Either username or password is wrong. Please try again.");
                if (i == 3) {
                    System.out.println("The System gets closed because the data you have provided is not valid. Please re-confirm it.");
                    System.exit(0);
                }
            }

        }
    }

    private static void displayAllEmployees() {
        System.out.println("List of all employees:");
        for (UserInfo userInfo : userInfoList) {
            if (userInfo.getUserRole().equals("Employee")) {
                System.out.println(userInfo);
            }
        }
    }

    private static void displayAllUsers() {
        System.out.println("List of all users:");
        for (UserInfo userInfo : userInfoList) {
            System.out.println(userInfo);
        }
    }

    private static boolean authenticateUser(String username, String password) {
        for (UserInfo userInfo : userInfoList) {
            if (username.equals(userInfo.getName()) && password.equals("password"))
            {
                return true;
            }
        }
        return false;
    }

    private static void displayUserInfo(String username) {
        for (UserInfo userInfo : userInfoList) {
            if (username.equals(userInfo.getName())) {
                System.out.println("User Information:");
                System.out.println(userInfo);
                break;
            }
        }
    }
}

