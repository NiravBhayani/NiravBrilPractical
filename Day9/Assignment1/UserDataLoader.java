package Day9.Assignment1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDataLoader extends Thread {
    private String filePath;
    private List<MergedInfo> mergedInfoList;
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
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/brilworks-26/Desktop/BrilAssignment/Day9/Assignment1/user_info"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                int userId = Integer.parseInt(parts[0]);
                String password = parts[1].substring(0, Math.min(parts[1].length(), 16));
                String userRole = parts[2];
                String name = parts[3].substring(0, Math.min(parts[3].length(), 16));
                String address = parts[4].substring(0, Math.min(parts[4].length(), 40));
                String city = parts[5].substring(0, Math.min(parts[5].length(), 16));
                int basicSalary = Integer.parseInt(parts[6]);
                long telNumber = Long.parseLong(parts[7]);

                MergedInfo mergedInfo = new MergedInfo(userId,password, userRole, name, address, city, basicSalary, telNumber);
                synchronized (mergedInfoList) {
                    mergedInfoList.add(mergedInfo);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

