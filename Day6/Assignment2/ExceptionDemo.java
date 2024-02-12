package Day6.Assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    public void runDemo(){
        try{
            FileInputStream fileInputStream = new FileInputStream(new File("Printed.txt"));
            int data = fileInputStream.read();
            System.out.println("Data read: " + data);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
