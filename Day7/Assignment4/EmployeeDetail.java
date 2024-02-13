package Day7.Assignment4;

import java.io.*;
import java.util.Hashtable;

public class EmployeeDetail implements Serializable {
    private long serialVersionUID = 1L;
    private String name;
    private int age;
    private double basicSal;

    public EmployeeDetail(){

    }
    public EmployeeDetail(String name, int age, double basicSal) {
        this.name = name;
        this.age = age;
        this.basicSal = basicSal;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Basic Salary: " + basicSal;
    }
}

