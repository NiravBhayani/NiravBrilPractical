package Day6.Assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public void runDemo() {
        String message = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("Printed.txt"));
            int data = fileInputStream.read();
            System.out.println("Data read: " + data);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            message = "Find not found";
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(message);
    }
}
