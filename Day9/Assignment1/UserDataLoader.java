package Day9.Assignment1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDataLoader extends Thread {
    private String filePath;
    private List<MergedInfo> mergedInfoList;
    private static List<MergedInfo> mergedinfoList = Collections.synchronizedList(new ArrayList<>());
    private static List<UserInfo> userInfoList = Collections.synchronizedList(new ArrayList<>());
    private static List<UserLoginInfo> userLoginInfoList = Collections.synchronizedList(new ArrayList<>());
    private static String LOGIN_INFO_FILE = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/login_info";
    private static String USER_INFO_FILE = "/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/user_info";

    public UserDataLoader() {

    }

    public UserDataLoader(String filePath, List<MergedInfo> mergedInfoList) {
        this.filePath = filePath;
        this.mergedInfoList = mergedInfoList;
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

                MergedInfo mergedInfo = new MergedInfo(userId, userRole, name, address, city, basicSalary, telNumber);
                synchronized (mergedInfoList) {
                    mergedInfoList.add(mergedInfo);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }


        private static void readUserLoginInfo() {
            try (BufferedReader reader = new BufferedReader(new FileReader(LOGIN_INFO_FILE))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        int userId = Integer.parseInt(parts[0]);
                        String username = parts[1];
                        String password = parts[2];
                        String userRole = parts[3];
                        userLoginInfoList.add(new UserLoginInfo(userId, username, password, userRole));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    private static void readUserInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_INFO_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    int userId = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String address = parts[2];
                    String city = parts[3];
                    int basicSalary = Integer.parseInt(parts[4]);
                    long telNumber = Long.parseLong(parts[5]);
                    userInfoList.add(new UserInfo(userId,name, address, city, basicSalary, telNumber));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

