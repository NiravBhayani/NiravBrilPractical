package Day5.Assignment4;

import java.util.List;

public class RowPrinter {
    public void printRows(List<BaseEmployee> employees){
        for(int i = 0; i<employees.size(); i++){
            BaseEmployee employee = employees.get(i);
            System.out.println("Employee["+(i+1)+"]"+employee.getEmpCode());
            System.out.println("Name:"+employee.getFirstName()+" " +employee.getLastName());
            System.out.println("Employee Type: " +employee.getEmpType());

            double annualSalary = employee.getBasicSalary() + (employee.getBasicSalary()*0.125);
            System.out.printf("Total Salary: %2f %n", annualSalary);
            System.out.println();
        }
    }
    public void printAsTable(List<BaseEmployee> employees){
        System.out.format("%-10s%-15s%-15s%-15s%-15s%n","empCode","firstName","lastName","tempType","Salary");
        for(BaseEmployee employee : employees){
            System.out.format("%-10s%-15s%-15s%-15s%-15s%n",employee.getEmpCode(),employee.getFirstName(),employee.getLastName(),employee.getEmpType(),employee.getBasicSalary());
        }
    }
}
