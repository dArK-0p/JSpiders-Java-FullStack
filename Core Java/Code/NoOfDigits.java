import java.util.Scanner;
public class NoOfDigits
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, count = 0;

        System.out.print("Enter x: ");
        x = sc.nextInt();

        System.out.print("No. of Digits in " + x + " are: ");
        while(x != 0)
        {
            x /= 10;
            count++;
        }
        System.out.println(count + ".");
        
        sc.close();
    }
}