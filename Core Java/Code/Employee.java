import java.util.Scanner;
class Employee
{
    String name, addr;
    int age;
    double sal;

    Employee(String name, int age, String addr, double sal) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.sal = sal;
    }


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee[] ob;

        String n, a;
        int age, count;
        double s;

        System.out.print("Enter no. of Employees: ");
        count = sc.nextInt(); sc.nextLine();

        ob = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter details of Employee " + (i + 1) + ": ");

            System.out.print("Enter Name: "); n = sc.nextLine().trim();
            System.out.print("Enter Age: "); age = sc.nextInt(); sc.nextLine();
            System.out.print("Enter Address: "); a = sc.nextLine();
            System.out.print("Enter Salary: "); s = sc.nextDouble(); sc.nextLine();

            ob[i] = new Employee(n, age, a, s);
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Details of all Employees: ");

            System.out.println("Employee " + (i + 1) + ": ");
            System.out.println("Name: " + ob[i].name);
            System.out.println("Age: " + ob[i].age);
            System.out.println("Address: " + ob[i].addr);
            System.out.println("Salary: " + ob[i].sal);
        }
        sc.close();
    }
}
// Using next() immediately after taking an primitive input using Scanner, renders next() to return empty.
// To avoid this a extra nextLine() can be written right after the primitive initialization.