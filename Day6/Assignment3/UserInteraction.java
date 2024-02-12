package Day6.Assignment3;

import java.util.Scanner;

public class UserInteraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter the command (a-j) or 'exit' to quit:");
                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting program...");
                    break;
                }

                switch (command.toLowerCase()) {
                    case "a":
                        System.out.println("Command a selected.");
                        break;
                    case "b":
                        System.out.println("Command b selected.");
                        break;
                    case "c":
                        System.out.println("Command c selected.");
                        break;
                    case "d":
                        System.out.println("Command d selected.");
                        break;
                    case "e":
                        System.out.println("Command e selected.");
                        break;
                    case "f":
                        System.out.println("Command f selected.");
                        break;
                    case "g":
                        System.out.println("Command g selected.");
                        break;
                    case "h":
                        System.out.println("Command h selected.");
                        break;
                    case "i":
                        System.out.println("Command i selected.");
                        break;
                    case "j":
                        System.out.println("Command j selected.");
                        break;
                    default:
                        throw new InvalidInputException("Invalid command. Please enter a valid command (a-j) or 'exit'.");
                }
            } catch (InvalidInputException e) {
                System.out.println("InvalidInputException caught: " + e.getMessage());
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
