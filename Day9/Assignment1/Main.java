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
        System.out.println("For displaying a list press : 'L'");
        System.out.println("For Search for Employee : 'S'");
        System.out.println("For Log Off : 'O'");
        System.out.println("For Exit : 'X'");
        Scanner scanner=new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command.toLowerCase()){
            case"l":
                System.out.println(" 1. Back to Main Menu 'B', \n" +
                        "2. Press 'E' for Employees, \n" +
                        "3. 'M' for Manager, 'A' for Admin and \n" +
                        "4. 'All' for all");
                String command2 = scanner.nextLine();
                switch (command2.toLowerCase()){
                    case "b":
                        System.out.println("Back to main menu");
                        System.exit(0);
                        break;
                    case "e":
                        displayAllEmployees();
                        break;
                    case "m":
                        break;
                    case "a":
                        displayAllUsers();
                        break;
                    case "all":
                        break;
                    default:
                        System.out.println("Command not valid!!");
                }break;

            case"s":
                System.out.println("1. Back to Main Menu (B), \n" +
                        "2. Press 'E' for Employees, \n" +
                        "3. 'M' for Manager, \n" +
                        "4. 'A' for Admin and \n" +
                        "5. 'All' for all");

                String command3 = scanner.nextLine();
                switch (command3.toLowerCase()) {
                    case "b":
                        break;
                    case "e":
                        break;
                    case "m":
                        break;
                    case "a":
                        break;
                    case "all":
                        break;
                    default:
                        System.out.println("Command not valid!!");
                }break;

            case"o":
                System.out.println("You are Log Out");
                System.exit(0);
                break;

            case"x":
                System.out.println("System is Exiting");
                System.exit(0);
                break;
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

