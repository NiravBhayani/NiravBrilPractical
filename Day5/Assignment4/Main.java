package Day5.Assignment4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "/home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment4/EmployeeDetails";
        RowReader rowReader = new RowReader();
        List<BaseEmployee> employees = rowReader.readRows(filePath);

        RowPrinter rowPrinter = new RowPrinter();
        rowPrinter.printRows(employees);

        String outputFilePath = "/home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment4/Printed";
        RowToFileConverter rowToFileConverter = new RowToFileConverter();
        rowToFileConverter.printRowsToFile(employees,outputFilePath);

        String lastNameToSearch = "bhayani";
        EmployeeSearch employeeSearch = new EmployeeSearch();
        employeeSearch.searchAndPrintEmployeeDetails(lastNameToSearch);

        String sortColumn = "empcode";
        if (args.length > 0) {
            sortColumn = args[0];
        }

        EmployeeShorted employeeShorted = new EmployeeShorted();
        employeeShorted.sortByColumn(employees,sortColumn);
        rowPrinter.printAsTable(employees);
    }
}
