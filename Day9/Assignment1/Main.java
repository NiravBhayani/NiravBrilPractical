package Day9.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

    private static List<MergedInfo> mergedInfoList = Collections.synchronizedList(new ArrayList<>());
    private static String LOGIN_INFO_FILE = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/login_info";
    private static String USER_INFO_FILE = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/user_info";

    public static void main(String[] args) {
        loadUserData();
        startFinderProcess();

    }

    public static void loadUserData() {
        UserDataLoader loginInfoLoader = new UserDataLoader(LOGIN_INFO_FILE, mergedInfoList);
        UserDataLoader userInfoLoader = new UserDataLoader(USER_INFO_FILE, mergedInfoList);
        loginInfoLoader.start();
        userInfoLoader.start();
        try {
            loginInfoLoader.join();
            userInfoLoader.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void startFinderProcess() {
        System.out.println("Welcome to User Information System!");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Please enter your Role: ");
            String userRole = scanner.nextLine();
            if (authenticateUser(username, password,userRole)) {

                if (userRole.equals("Manager")) {
                    displayOfManager();
                }else if (userRole.equals("Admin")) {
                    displayOfAdmin();
                } else if (userRole.equals("Employee")) {
                    displayUserInfo(username);
                }
                break;

            } else {
                System.out.println("Either username or password or role is wrong. Please try again.");
                if (i == 2) {
                    System.out.println("The System gets closed because the data you have provided is not valid. Please re-confirm it.");
                    System.exit(0);
                }
            }
        }
    }

    private static void displayUserInfo(String username) {
        for (MergedInfo mergedInfo : mergedInfoList) {
            if (username.equals(mergedInfo.getName())) {
                System.out.println("User Information:");
                System.out.println(mergedInfo);
                break;
            }
        }
    }

    private static boolean authenticateUser(String username, String password , String userRole) {
        for (MergedInfo mergedInfo : mergedInfoList) {
            if (username.equals(mergedInfo.getName()) && password.equals(mergedInfo.getPassword()) && userRole.equals(mergedInfo.getUserRole())) {
                return true;
            }
        }
        return false;
    }

    private static void displayAllEmployees() {
        System.out.println("List of all employees:");
        for (MergedInfo mergedInfo : mergedInfoList) {
            if (mergedInfo.getUserRole().equals("Employee")) {
                System.out.println(mergedInfo);
            }
        }
    }

    private static void displayAllAdmin() {
        System.out.println("List of all Admins:");
        for (MergedInfo mergedInfo : mergedInfoList) {
            if (mergedInfo.getUserRole().equals("Admin")) {
                System.out.println(mergedInfo);
            }
        }
    }

    private static void displayAllManager() {
        System.out.println("List of all Managers:");
        for (MergedInfo mergedInfo : mergedInfoList) {
            if (mergedInfo.getUserRole().equals("Manager")) {
                System.out.println(mergedInfo);
            }
        }
    }

    private static void displayOfAdmin() {
        System.out.println("For displaying a list press : 'L'");
        System.out.println("For Search for Employee : 'S'");
        System.out.println("For Log Off : 'O'");
        System.out.println("For Exit : 'X'");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        switch (command.toLowerCase()) {
            case "l":
                System.out.println("1. Back to Main Menu 'B', \n" +
                        "2. Press 'E' for Employees, \n" +
                        "3. 'M' for Manager, 'A' for Admin and \n" +
                        "4. 'All' for all");
                String command2 = scanner.nextLine();
                switch (command2.toLowerCase()) {
                    case "b":
                        System.out.println("Back to main menu");
                        System.exit(0);
                        break;
                    case "e":
                        displayAllEmployees();
                        break;
                    case "m":
                        displayAllManager();
                        break;
                    case "a":
                        displayAllAdmin();
                        break;
                    case "all":
                        displayAllAdmin();
                        displayAllManager();
                        displayAllEmployees();
                        break;
                    default:
                        System.out.println("Command not valid!!");
                }
                break;

            case "s":
                System.out.println("1. Back to Main Menu (B), \n" +
                        "2. Press 'E' for Employees, \n" +
                        "3. 'M' for Manager, \n" +
                        "4. 'A' for Admin and \n" +
                        "5. 'All' for all");

                String command3 = scanner.nextLine();
                switch (command3.toLowerCase()) {
                    case "b":
                        System.out.println("Back to main menu");
                        System.exit(0);
                        break;
                    case "e":
                        displayAllEmployees();
                        break;
                    case "m":
                        displayAllManager();
                        break;
                    case "a":
                        displayAllAdmin();
                        break;
                    case "all":
                        displayAllAdmin();
                        displayAllManager();
                        displayAllEmployees();
                        break;
                    default:
                        System.out.println("Command not valid!!");
                }
                break;

            case "o":
                System.out.println("You are Log Out");
                System.exit(0);
                break;

            case "x":
                System.out.println("System is Exiting");
                System.exit(0);
                break;
        }
    }

    private static void displayOfManager() {
        System.out.println("For displaying a list press : 'L'");
        System.out.println("For Search for Employee : 'S'");
        System.out.println("For Log Off : 'O'");
        System.out.println("For Exit : 'X'");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command.toLowerCase()) {
            case "l":
                System.out.println("1. Back to Main Menu 'B', \n" +
                                   "2. Press 'E' for Employees, \n");
                String command2 = scanner.nextLine();
                switch (command2.toLowerCase()) {
                    case "b":
                        System.out.println("Back to main menu");
                        System.exit(0);
                        break;
                    case "e":
                        displayAllEmployees();
                        break;

                    default:
                        System.out.println("Command not valid!!");
                }
                break;

            case "s":
                System.out.println("1. Back to Main Menu (B), \n" +
                        "2. Press 'E' for Employees, \n" );

                String command3 = scanner.nextLine();
                switch (command3.toLowerCase()) {
                    case "b":
                        System.out.println("Back to main menu");
                        System.exit(0);
                        break;
                    case "e":
                        displayAllEmployees();
                        break;

                    default:
                        System.out.println("Command not valid!!");
                }
                break;

            case "o":
                System.out.println("You are Log Out");
                System.exit(0);
                break;

            case "x":
                System.out.println("System is Exiting");
                System.exit(0);
                break;
        }
    }
}
