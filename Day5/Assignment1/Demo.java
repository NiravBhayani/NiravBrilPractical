package Day5.Assignment1;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Please input a File Path");
            return;
        }

        String filePath = args[0];
        RowReader rowReader = new RowReader();
        List<BaseEmployee> employees = rowReader.readRows(filePath);

        RowPrinter rowPrinter = new RowPrinter();
        rowPrinter.printRows(employees);
    }
}
