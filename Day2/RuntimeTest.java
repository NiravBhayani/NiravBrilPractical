package  Day2;
import java.io.IOException;
import java.lang.ProcessBuilder;
import java.util.*;
import java.io.*;
import java.lang.*;


public class RuntimeTest {
    public static void main(String[] args) throws IOException {
        runTime();
        processBuilder();
        environmentVariable();
    }

    public static void runTime()throws IOException {
        Runtime.getRuntime().exec("notepad++");
    }

    public static void processBuilder()throws IOException{
        List<String> lst = new ArrayList<String>();
        lst.add("notepad++.exe");
        ProcessBuilder pd = new ProcessBuilder();
        System.out.println("command:"+pd.command());

    }

    public static void environmentVariable(){

    }
}
