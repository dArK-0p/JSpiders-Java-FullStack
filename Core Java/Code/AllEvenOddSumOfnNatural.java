import java.util.Scanner;
public class AllEvenOddSumOfnNatural
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        int even = 0, odd = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0) even += i;
            else odd += i;
        }
        System.out.println("Sum of Even Nos. : " + even);
        System.out.println("Sum of Odd Nos. : " + odd);
        
        sc.close();
    }
}