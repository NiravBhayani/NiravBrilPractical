package Day5.Assignment4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RowToFileConverter {
    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("Provide two path. 1st is InputPath 2nd is OutputPath");
            return;
        }
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        List<String> rows = readRowsFromFile(inputFilePath);

        if (rows.isEmpty()) {
            System.out.println("No rows found in input file");
            return;
        }
        System.out.println("Rows reads from the input file:");
        RowToFileConverter rowToFileConverter = new RowToFileConverter();
        rowToFileConverter.printRows(rows);

        if (rowToFileConverter.writeRowsToFile(outputFilePath, rows)) {
            System.out.println("Successfully written in output file ");
        } else {
            System.out.println("Failed to write");
        }
    }

    private static List<String> readRowsFromFile(String filePath){
        List<String> rows = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                rows.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return rows;
    }

    private void printRows(List<String> rows){
        for (int i=0;i<rows.size();i++){
            System.out.println("Row "+(i+1)+": "+rows.get(i));
        }
    }

    private boolean writeRowsToFile(String filePath,List<String> rows){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(String row : rows){
                writer.write(row);
                writer.newLine();
            }
            return true;

        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
    public void printRowsToFile(List<BaseEmployee> employees, String filePath){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(BaseEmployee employee : employees){
                writer.write(formatEmployee(employee));
                writer.newLine();
            }
            System.out.println("Employee details printed to file: "+ filePath);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private String formatEmployee(BaseEmployee employee){
        return "Employee ID:" + employee.getEmpCode()+"\n"+
                "Name : " + employee.getFirstName()+" "+employee.getLastName()+ "\n"+
                "Employee type: " + employee.getEmpType()+"\n"+
                "Salary:" + employee.getBasicSalary();
    }
}
