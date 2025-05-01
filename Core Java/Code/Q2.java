import java.util.Scanner;

public class Q2 {

    // Palindrome Check.
    public boolean checkPalindrome(int n) {
        if(n == (new Q2().reverse(n)))
            return true;
        return false;
    }

    // Armstrong Check.
    public boolean checkArmstrong(int n) {
        int temp_n = n, cubeSum = 0, l = (new Q2()).countDigits(n);

        while(temp_n != 0) {
            cubeSum += (int) Math.pow(temp_n % 10, l);
            temp_n /= 10;
        }
        
        if(cubeSum == n)
            return true;
        return false;
    }

    // Strong Check
    public boolean checkStrong(int n) {
        int temp_n = n, factSum = 0;

        while(temp_n != 0) {
            factSum += (new Q2()).factorial(temp_n % 10);
            temp_n /= 10;
        }

        if(factSum == n)
            return true;
        return false;
    }

    // Perfect Check
    public boolean checkPerfect(int n) {
        int factorSum = 0;

        for (int i = 1; i < n; i++) {
            if(n % i == 0)
                factorSum += i;
        }

        if(factorSum == n)
            return true;
        return false;
    }

    // Neon.
    public boolean checkNeon(int n) {
        if((new Q2()).sumOfDigits(n * n) == n)
            return true;
        return false;
    }

    // Tech.
    public boolean checkTech(int n) {
        int l = (new Q2()).countDigits(n);

        if(l % 2 != 0)
            return false;
        
        int multipleOf10 = (int) Math.pow(10, l / 2);
        int sum = (n / multipleOf10) + (n % multipleOf10);

        if((sum * sum) == n) return true;
        return false;
    }

    // Magic.
    public boolean checkMagic(int n) {
        while((new Q2()).countDigits(n) > 1) {
            n = (new Q2()).sumOfDigits(n);
        }
        if(n == 1) return true;
        return false;
    }

    // Harshad.
    public boolean checkHarshad(int n) {
        int temp_n = n, sum = 0;

        while(temp_n != 0) {
            sum += temp_n % 10;
            temp_n /= 10;
        }

        if(n % sum == 0) return true;
        return false;
    }

    // Reverse.
    public int reverse(int n) {
        int rev_n = 0;

        while(n != 0) {
            rev_n = (rev_n * 10) + (n % 10);
            n /= 10;
        }

        return rev_n;
    }

    // Factorial.
    public int factorial(int n) {
        int fact = 1;

        while(n > 0) {
            fact *= n--;
        }

        return fact;
    }

    // Number of Digits.
    public int countDigits(int n) {
        int count = 0;

        while(n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // Sum of Digits.
    public int sumOfDigits(int n) {
        int sum = 0;

        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Q2 ob = new Q2();
        Scanner sc = new Scanner(System.in);
        char ch;
        int n;
        String check;

        System.out.println("1. To reverse a number.\n2. To check for Palindrome.");
        System.out.println("3. To check for Armstrong.\n4. To check for Strong.");
        System.out.println("5. To check for Perfect.\n6. To check for Neon.");
        System.out.println("7. To check for Tech.\n8. To check for Magic.");
        System.out.println("9. To check for Harshad.");
        
        System.out.print("Enter choice: ");
        ch = sc.next().charAt(0);

        System.out.print("Enter n: ");
        n = sc.nextInt();

        switch(ch)
        {
            case '1':
                System.out.println(ob.reverse(n));
                break;
            case '2':
                check = (ob.checkPalindrome(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Palindrome number.");
                break;
            case '3':
                check = (ob.checkArmstrong(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "an Armstrong number.");
                break;
            case '4':
                check = (ob.checkStrong(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Strong number.");
                break;
            case '5':
                check = (ob.checkPerfect(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Perfect number.");
                break;
            case '6':
                check = (ob.checkNeon(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Neon number.");
                break;
            case '7':
                check = (ob.checkTech(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Tech number.");
                break;
            case '8':
                check = (ob.checkMagic(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Magic number.");
                break;
            case '9':
                check = (ob.checkHarshad(n)) ? "" : "not ";
                System.out.println(n + " is " + check + "a Harshad number.");
                break;
            default:
                System.out.println("Invalid input\n\tRe-execute the code.");
        }

        sc.close();
    }
}