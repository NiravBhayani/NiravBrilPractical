package Day5.Assignment4;

import java.util.Comparator;
import java.util.List;

public class EmployeeShorted {
    public void sortByColumn(List<BaseEmployee> employees, String columnName){
        Comparator<BaseEmployee> comparator;
        switch (columnName){
            case "empCode":
                comparator = Comparator.comparing(BaseEmployee::getEmpCode);
                break;
            case "firstName":
                comparator = Comparator.comparing(BaseEmployee::getFirstName);
                break;
            case "lastName":
                comparator = Comparator.comparing(BaseEmployee::getLastName);
                break;
            case "empType":
                comparator = Comparator.comparing(BaseEmployee::getEmpType);
                break;
            case "Salary":
                comparator = Comparator.comparing(BaseEmployee::getBasicSalary);
                break;
            default:
                System.out.println("Invalid command name so sorting by employee code");
                comparator = Comparator.comparing(BaseEmployee::getEmpCode);
        }
        bubbleSort(employees,comparator);
    }
    private void bubbleSort(List<BaseEmployee> employees,Comparator<BaseEmployee> comparator){
        int n = employees.size();

        for(int i=0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(comparator.compare(employees.get(j),employees.get(j+1))>0){
                    BaseEmployee temp = employees.get(j);
                    employees.set(j,employees.get(j+1));
                    employees.set(j+1,temp);
                }
            }
        }
    }
}
