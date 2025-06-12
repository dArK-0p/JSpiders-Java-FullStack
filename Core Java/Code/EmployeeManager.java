import java.util.*;

class Employee {
    private String name;
    private int age;
    private String address;
    private double salary;

    public Employee(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int count = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(name, age, address, salary);
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < count; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            employees[i].displayInfo();
        }

        sc.close();
    }
}
