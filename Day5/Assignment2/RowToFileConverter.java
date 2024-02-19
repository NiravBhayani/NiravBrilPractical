package Day5.Assignment2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RowToFileConverter {
    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("Provide two path. 1st is InputPath 2nd is OutputPath");
            return;
        }
        // /home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment2
        String inputFilePath = "/home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment2/Hello";
        String outputFilePath = "/home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment2/Hello2";

        List<String> rows = readRowsFromFile(inputFilePath);

        if (rows.isEmpty()) {
            System.out.println("No rows found in input file");
            return;
        }
        System.out.println("Rows reads from the input file:");
        RowToFileConverter rowToFileConverter = new RowToFileConverter();
        rowToFileConverter.printRows(rows);
        rowToFileConverter.writeRowsToFile(outputFilePath, rows);
        System.out.println("Successfully written in output file ");
    }

    private static List<String> readRowsFromFile(String filePath) {
        List<String> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                rows.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }

    private void printRows(List<String> rows) {
        for (int i = 0; i < rows.size(); i++) {
            System.out.println("Row " + (i + 1) + ": " + rows.get(i));
        }
    }

    private void writeRowsToFile(String filePath, List<String> rows) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String row : rows) {
                writer.write(row);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Failed to write");
            e.printStackTrace();
        }
    }
}
