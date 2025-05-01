import java.util.Scanner;
public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
        
        sc.close();
    }
}