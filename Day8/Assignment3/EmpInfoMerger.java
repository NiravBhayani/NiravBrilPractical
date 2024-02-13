package Day8.Assignment3;

import Day7.Assignment4.EmployeeDetail;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpInfoMerger extends Thread{
    private String filePath;
    private Mode mode;
    private static List<String> sharedResource = new ArrayList<>();

    public enum Mode{
        READ,WRITE
    }

    public EmpInfoMerger(){
    }

    public EmpInfoMerger(String filePath,Mode mode){
        this.filePath = filePath;
        this.mode = mode;
    }

    public void writeToResource(){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line=reader.readLine())!= null){
                synchronized (sharedResource){
                    sharedResource.add(line);
                    System.out.println("Added to shared resource: "+line);
                }
                Thread.sleep(1000);
            }
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void writeToFile(){
        if (sharedResource.isEmpty()){
            System.out.println("Shared Resource is empty.");
            return;
        }
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true))){
            for (String line:sharedResource){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Shared resource is written to the file: "+filePath);
            sharedResource.clear();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        if (mode == Mode.READ){
            writeToResource();
        }else if (mode==Mode.WRITE){
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            writeToFile();
        }
    }

    public static void printSharedResource(){
        System.out.println("Content of shared resource: ");
        for (String line:sharedResource){
            System.out.println(line);
        }
    }
}
