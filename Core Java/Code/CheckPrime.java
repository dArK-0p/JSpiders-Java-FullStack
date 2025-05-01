import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, count = 0;

        System.out.print("Enter N: ");
        N = sc.nextInt();

        for(int i = 2; i < N; i++) {
            if(N % i == 0) {
                count++;
            }
        }

        System.out.print(N + " is ");
        if(N == 1 || count != 0) {
            System.out.print("not ");
        }
        System.out.println("Prime.");
        
        sc.close();
    }
}
