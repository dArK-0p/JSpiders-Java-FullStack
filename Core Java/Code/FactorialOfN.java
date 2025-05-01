import java.util.Scanner;
public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, fact = 1;

        System.out.print("Enter N: ");
        N = sc.nextInt();

        System.out.print("Factorial of " + N + " is: ");
        while(N > 0) {
            fact *= N--;
        }
        System.out.println(fact + ".");

        sc.close();
    }
}
