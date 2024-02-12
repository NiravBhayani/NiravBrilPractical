package Day5.Assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter directory Path:");
        String directoryPath = scanner.nextLine();

        System.out.println("Enter file extension(s) separated by commas (e.g., txt,doc,pdf), or * for all:");
        String extensions = scanner.nextLine();

        System.out.println("Do you want to search recursively? (true/false):");
        boolean recursive = scanner.nextBoolean();

        DirectoryListing directoryListing = new DirectoryListing(directoryPath, extensions, recursive);
        directoryListing.listFile();
    }
}
