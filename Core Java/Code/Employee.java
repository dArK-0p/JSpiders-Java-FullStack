import java.util.Scanner;
class Employee
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String name, addr;
        int age;
        double sal;

        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        addr = sc.nextLine();
        System.out.print("Enter Salary: ");
        sal = sc.nextDouble();

        System.out.println("Name: " + name + "\nAge: " + age + "\nSalary: " + sal + "\nAddress: " + addr);

        sc.close();
    }
}
// Using next() immediately after taking an primitive input using scanner, renders next() to return empty.
// To avoid this a extra nextLine() can be written right after the primitive initialization.