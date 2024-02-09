package Day3.Assignment7;

public class InfoPrint {
    public static void main(String[] args) throws IllegalAccessException {
        if(args.length<2){
            throw new IllegalAccessException("Please give valid command: First EmployeeName Second BasicSalary ");
        }
        String empName = args[0];
        double basicSal = Double.parseDouble(args[1]);

        if (empName!=null || "".equals(basicSal)) {
            Employee employee = new Employee(empName);

            Employee.SalaryStructure salaryStructure = employee.new SalaryStructure(basicSal);

            System.out.println("Name:" + employee.getName());
            System.out.println("Basic Salary:" + salaryStructure.basicSal());
            System.out.println("HRA:" + salaryStructure.hra());
            System.out.println("Total Salary:" + salaryStructure.getTotalSalary());
        }
    }
}