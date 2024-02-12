package Day6.Assignment1;

import Day1.*;
import Day2.*;
import Day3.Assignment3.DateAndTime;
import Day3.Assignment4.DateDifference;
import Day3.Assignment5.DateAdd;
import Day4.Assignment5.FrequencyChecker;
import Day5.Assignment3.EmployeeSearch;
import Day5.Assignment4.EmployeeShorted;
import Day5.Assignment4.Main;


import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) throws ParseException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the command (a to j) or 'exit' to quit:");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break;
            }

            switch (command.toLowerCase()) {
                case "a":
                    MultiCommandLine multiCommandLine = new MultiCommandLine();
                    System.out.println("\n" + "Please choose between the following;\n" +
                            "1. Add Numbers\n" +"2. Change String to lower case\n" +
                            "Your Choice? : 1 or 2 \n"+"Give response in argument ");

                    if (args[0].equals("1")){
                        multiCommandLine.addNum(args);
                    } else if (args[0].equals("2")) {
                        multiCommandLine.changeCase(args);
                    }else {
                        System.out.println("Please Enter 1 for add number or 2 for change string to lower case");
                    }
                    break;

                case "b":
                    StringOperation stringOperation = new StringOperation();
                    System.out.println("\n" + "Please choose between the following;\n" +
                            "1. Revers Words\n" +"2. Character count\n" +
                            "Your Choice? : 1 or 2 Give response in argument ");
                    if (args[0].equals("1")){
                        stringOperation.reverseWord(args);
                    } else if (args[0].equals("2")) {
                        stringOperation.characterCounts(args);
                    }else {
                        System.out.println("Please Enter 1 for revers word or 2 for character counts to lower case");
                    }
                    break;

                case "c":
                    StringOperation2 stringOperation2 = new StringOperation2();
                    System.out.println("\n" + "Please choose between the following;\n" +
                            "1. Revers Words\n" +"2. Character count\n" +
                            "Your Choice? : 1 or 2 Give response in argument ");
                    if (args[0].equals("1")){
                        stringOperation2.reverseWord(args);
                    } else if (args[0].equals("2")) {
                        stringOperation2.characterCounts(args);
                    }else {
                        System.out.println("Please Enter 1 for revers word or 2 for character counts to lower case");
                    }
                    break;

                case "d":
                    System.out.println("\n" + "Please choose between the following;\n" +
                            "1. Normal Date\n" +"2. Formatted Date\n" +
                            "Your Choice? : normal or format Give response in argument ");
                    if (args[0].equals("normal")){
                        String[] arg1= {args[0],args[1]};
                        DateAndTime.main(arg1);

                    } else if (args[0].equals("formatted")) {
                        String[] arg2= {args[0],args[1]};
                        DateAndTime.main(arg2);

                    }else {
                        System.out.println("Please Enter 'normal' for normal date or 'formatted' for formatted date to lower case");
                    }
                    break;

                case "e":
                    System.out.print("For see the difference between two dates provide two dates(yyyy,mm,dd): ");
                    String argument=scanner.nextLine();
                    String[] scanner1 = argument.split(" ");
                    DateDifference.main(scanner1);
                    break;

                case "f":
                    System.out.println("For adding Date Provide 'Date' 'year,month or day' 'number of day,year or month'(split it with space): ");
                    String argument1=scanner.nextLine();
                    String[] scanner2 = argument1.split(" ");
                    DateAdd.main(scanner2);
                    break;
                case "g":

                    break;

                case "h":
                    System.out.println("For checking the frequency of word.Provide the words (split it with space): ");
                    String argument2=scanner.nextLine();
                    String[] scanner3 = argument2.split(" ");
                    FrequencyChecker.main(scanner3);
                    break;

                case "i":
                    System.out.println("Provide a Last Name for searching an Employee details: ");
                    String argument3 = scanner.nextLine();
                    String[] scanner4 = argument3.split(" ");
                    EmployeeSearch.main(scanner4);
                    break;

                case "j":
                    System.out.println("For Sorting employee detail provide input like EmpCode, LastName, FirstName ");
                    String argument4 = scanner.nextLine();
                    String[] scanner5 = argument4.split(" ");
                    Main.main(scanner5);
                    break;

                default:
                    System.out.println("Invalid command. Please enter a valid command (a-j) or 'exit'.");
            }
        }
        scanner.close();
    }
}