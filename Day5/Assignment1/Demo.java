package Day5.Assignment1;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        RowReader rowReader = new RowReader();
        List<BaseEmployee> employees = rowReader.readRows("/home/brilworks-26/Desktop/BrilAssignment/Day5/Assignment1/Hello.json");

        RowPrinter rowPrinter = new RowPrinter();
        rowPrinter.printRows(employees);
    }
}
