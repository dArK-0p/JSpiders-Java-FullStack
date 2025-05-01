import java.util.Scanner;
public class AllEvenOddOfnNatural
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        String even = "", odd = "";
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0) even += i + " ";
            else odd += i + " ";
        }
        System.out.println("Even Nos. : " + even);
        System.out.println("Odd Nos. : " + odd);

        sc.close();
    }
}