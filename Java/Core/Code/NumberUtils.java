import java.util.*;

public class NumberUtils {

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Get factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Get factors of a number
    public static List<Integer> getFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors.add(i);
        }
        return factors;
    }

    // Count digits in a number
    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    // Print digits of a number in reverse
    public static List<Integer> getDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n != 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Find missing number in 1 to 10 if one number is missing
    public static int findMissingFromOneToTen(int[] arr) {
        int expectedSum = 55;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    // Find single element in a pair-duplicated array
    public static int findSingleElement(int[] arr) {
        int res = 0;
        for (int num : arr) res ^= num;
        return res;
    }

    // Check if number is Armstrong
    public static boolean isArmstrong(int n) {
        int temp = n, len = countDigits(n), sum = 0;
        while (temp != 0) {
            sum += Math.pow(temp % 10, len);
            temp /= 10;
        }
        return sum == n;
    }

    // Check if number is Strong
    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    // Check if number is Perfect
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    // Check if number is Neon
    public static boolean isNeon(int n) {
        return sumOfDigits(n * n) == n;
    }

    // Check if number is Tech (even number of digits, square of sum of halves = original)
    public static boolean isTech(int n) {
        int len = countDigits(n);
        if (len % 2 != 0) return false;
        int div = (int) Math.pow(10, len / 2);
        int firstHalf = n / div, secondHalf = n % div;
        int sum = firstHalf + secondHalf;
        return sum * sum == n;
    }

    // Check if number is Magic (recursive sum of digits == 1)
    public static boolean isMagic(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n == 1;
    }

    // Check if number is Harshad (divisible by sum of its digits)
    public static boolean isHarshad(int n) {
        return n % sumOfDigits(n) == 0;
    }
}
