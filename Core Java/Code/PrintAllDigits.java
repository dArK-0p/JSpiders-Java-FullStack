import java.util.Scanner;
public class PrintAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        while(n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }

        sc.close();
    }
}
