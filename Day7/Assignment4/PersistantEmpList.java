package Day7.Assignment4;

import java.io.*;
import java.util.Hashtable;
import java.util.Scanner;


public class PersistantEmpList {
    public static void main(String[] args) {
        Hashtable<Integer, EmployeeDetail> employeeHashTable = new Hashtable<>();

        Scanner scanner = new Scanner(System.in);
        int empId = 1;
        while (true) {
            System.out.println("Enter details for Employee " + empId + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Basic Salary: ");
            double basicSal = Double.parseDouble(scanner.nextLine());

            EmployeeDetail employee = new EmployeeDetail(name, age, basicSal);
            employeeHashTable.put(empId, employee);

            System.out.print("Do you want to enter details for another employee? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
            empId++;
        }

        PersistantEmpList persistantEmpList = new PersistantEmpList();
        persistantEmpList.serialize(employeeHashTable);

        Hashtable<Integer, EmployeeDetail> deserializedHashTable = persistantEmpList.deserialize();

        System.out.println("\nDeserialized Employee Details:");
        for (int id : deserializedHashTable.keySet()) {
            System.out.println("Employee ID: " + id + ", Details: " + deserializedHashTable.get(id));
        }
    }

    private void serialize(Hashtable<Integer, EmployeeDetail> employeeHashTable) {
        try (FileOutputStream fileOut = new FileOutputStream("employee.txt");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(employeeHashTable);
            System.out.println("\nSerialized data is saved in employee.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Hashtable<Integer, EmployeeDetail> deserialize() {
        Hashtable<Integer, EmployeeDetail> deserializedHashTable = null;
        try (FileInputStream fileIn = new FileInputStream("employee.txt");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            deserializedHashTable = (Hashtable<Integer, EmployeeDetail>) objectIn.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return deserializedHashTable;
    }
}