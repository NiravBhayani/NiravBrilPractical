package Day3.Assignment7;

public class Employee {
    private String name;
    class SalaryStructure {
        private double basicSal;
        private double hra;

        SalaryStructure(double basicSal){
            this.basicSal = basicSal;
            this.hra = basicSal*0.125;
        }
        double getTotalSalary(){
            return basicSal + hra;
        }
        double basicSal(){
            return basicSal;
        }
        double hra(){
            return hra;
        }

    }

    Employee(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}
