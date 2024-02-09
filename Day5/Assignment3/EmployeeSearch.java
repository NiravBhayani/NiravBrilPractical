package Day5.Assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeSearch {
    private String EmployeePath = "/home/brilworks-26/Desktop/Assignment/Day5/Assignment3/EmployeeDetails";

    public void searchAndPrintEmployeeDetails(String lastName){
        RowReader rowReader = new RowReader();
        Map<String,BaseEmployee> employeeMap = rowReader.readEmployeeMap(EmployeePath);

        List<BaseEmployee> matchingEmployees = searchByLastName(employeeMap, lastName);

        if (matchingEmployees.isEmpty()){
            System.out.println("No Employees Found with this last name: " + lastName);
        }else {
            System.out.println("Employees with last name: "+lastName);
            printEmployeeDetails(matchingEmployees);
        }
    }

    private List<BaseEmployee> searchByLastName(Map<String,BaseEmployee> employeeMap,String lastname){
        List<BaseEmployee> matchingEmployees = new ArrayList<>();
        for(BaseEmployee employee:employeeMap.values()){
            if (employee.getLastName().equalsIgnoreCase(lastname)){
                matchingEmployees.add(employee);
            }
        }
        return matchingEmployees;
    }

    private void printEmployeeDetails(List<BaseEmployee> employees){
        for (BaseEmployee employee: employees){
            System.out.println("Employee Code: "+employee.getEmpCode());
            System.out.println("Name : "+employee.getFirstName()+" "+employee.getLastName());
            System.out.println("Employee Type: "+employee.getEmpType());
            System.out.println("Salary: "+employee.getBasicSalary()+"(+12.5%)");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Please provide last name for searching employee details");
            return;
        }

        String lastName = args[0];
        EmployeeSearch employeeSearch = new EmployeeSearch();
        employeeSearch.searchAndPrintEmployeeDetails(lastName);
    }

}
