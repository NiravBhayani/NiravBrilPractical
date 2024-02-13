package Day7.Assignment2;

import Day7.Assignment1.FindInFiles;

import java.io.IOException;

public class ExecutionInfo {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ExecutionInfo <searchText> <dir|file>");
            return;
        }

        String searchText = args[0];
        String path = args[1];

        printMemoryUsage("Before Program Execution");

        long startTime = System.currentTimeMillis();

        try {
            FindInFiles.search(searchText, path);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        printMemoryUsage("After Program Execution");

        long elapsedTime = endTime - startTime;
        System.out.println("Time taken to execute the program: " + elapsedTime + " milliseconds");

        printMemoryUsage("Before Garbage Collection");

        System.gc();

        printMemoryUsage("After Garbage Collection");
    }

    private static void printMemoryUsage(String message) {
        Runtime runtime = Runtime.getRuntime();
        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        System.out.println(message + ": Memory Used (bytes): " + memoryUsed);
    }
}
