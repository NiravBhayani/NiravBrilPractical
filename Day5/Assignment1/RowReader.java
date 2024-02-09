package Day5.Assignment1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RowReader {

    public List<BaseEmployee> readRows(String filePath) {
        List<BaseEmployee> employees = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 5) {
                    BaseEmployee employee = new GeneralEmployee(fields[0], fields[1], fields[2], fields[3], Double.parseDouble(fields[4]));
                    employees.add(employee);
                } else {
                    System.out.println("Error!!! number of column is incorrect");
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return employees;
    }
}