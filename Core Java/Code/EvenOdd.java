import java.util.Scanner;
class EvenOdd
{
    public static void main(String [] args)
    {
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        String result = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println(x + " is " + result + ".");

        ob.close();
    }
}

