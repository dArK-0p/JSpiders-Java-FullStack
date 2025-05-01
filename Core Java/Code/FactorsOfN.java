import java.util.Scanner;
public class FactorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        String factors = "";

        System.out.print("Enter N: ");
        N = sc.nextInt();

        System.out.print("Factors of " + N + " are: 1");
        for(int i = 2; i < N; i++) {
                factors += (N % i == 0) ? (" " + i) : "";
        }
        System.out.println(factors + " " + N + ".");

        sc.close();
    }
}
