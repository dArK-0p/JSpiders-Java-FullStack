import java.util.Scanner;

public class Q1 {

    public static boolean checkPrime(int n) {
        if (n == 1 || (n != 2 && n % 2 == 0) || (n != 3 && n % 3 == 0)) {
            return false;
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if(count != 0) {
                return false;
            }

            if(n % i == 0) {
                count ++;
            }
        }

        return true;
    }

    public static boolean checkEven(int n) {
        boolean result = (n % 2 == 0) ? true : false;

        return result;
    }

    public void checkInRange(int l, int h, boolean flag) {
        boolean choice;
        for (int i = l; i <= h; i++) {
            choice = (flag) ? checkPrime(i) : checkEven(i);
            if(choice) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Q1 ob = new Q1();
        Scanner sc = new Scanner(System.in);
        int var1, var2;

        System.out.println("1. Print prime in range.\n2. Print even in range.");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '1':
                System.out.println("Enter lower limit:");
                var1 = sc.nextInt();
                System.out.println("Enter higher limit:");
                var2 = sc.nextInt();
                ob.checkInRange(var1, var2, true);
                break;
            case '2':
                System.out.println("Enter lower limit:");
                var1 = sc.nextInt();
                System.out.println("Enter higher limit:");
                var2 = sc.nextInt();
                ob.checkInRange(var1, var2, false);
                break;
            default:
                System.out.println("Invalid Input :/\n\tRe-execute the code.");
        }

        sc.close();
    }
}