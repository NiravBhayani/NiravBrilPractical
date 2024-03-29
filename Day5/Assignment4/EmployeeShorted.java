package Day5.Assignment4;

import java.util.Comparator;
import java.util.List;

public class EmployeeShorted {
    public void sortByColumn(List<BaseEmployee> employees, String columnName){
        Comparator<BaseEmployee> comparator;
        switch (columnName.toLowerCase()){
            case "empcode":
                comparator = Comparator.comparing(BaseEmployee::getEmpCode);
                break;
            case "firstname":
                comparator = Comparator.comparing(BaseEmployee::getFirstName);
                break;
            case "lastname":
                comparator = Comparator.comparing(BaseEmployee::getLastName);
                break;
            case "emptype":
                comparator = Comparator.comparing(BaseEmployee::getEmpType);
                break;
            case "salary":
                comparator = Comparator.comparing(BaseEmployee::getBasicSalary);
                break;
            default:
                System.out.println("Invalid command name so sorting by employee code");
                comparator = Comparator.comparing(BaseEmployee::getEmpCode);
        }
        bubbleSort(employees,comparator);
    }
    private void bubbleSort(List<BaseEmployee> employees,Comparator<BaseEmployee> comparator){

        for(int i=0; i<employees.size()-1;i++){
            for(int j=0; j<employees.size()-i-1;j++){
                if(comparator.compare(employees.get(j),employees.get(j+1))>0){
                    BaseEmployee temp = employees.get(j);
                    employees.set(j,employees.get(j+1));
                    employees.set(j+1,temp);
                }
            }
        }
    }
}
