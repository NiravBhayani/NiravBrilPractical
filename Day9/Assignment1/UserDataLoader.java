package Day9.Assignment1;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class UserDataLoader extends Thread {
    private String filePath;
    private List<UserInfo> userInfoList;

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
                        System.out.println("For displaying a list press : 'L'");
                        System.out.println("For Search for Employee : 'S'");
                        System.out.println("For Log Off : 'O'");
                        System.out.println("For Exit : 'X'");
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

                            case"s":
                                System.out.println("1. Back to Main Menu (B), \n" +
                                        "2. Press 'E' for Employees, \n" +
                                        "3. 'M' for Manager, \n" +
                                        "4. 'A' for Admin and \n" +
                                        "5. 'All' for all");
                                break;

                        }
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

                UserInfo userInfo = new UserInfo(userId, userRole, name, address, city, basicSalary, telNumber);
                synchronized (userInfoList) {
                    userInfoList.add(userInfo);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
