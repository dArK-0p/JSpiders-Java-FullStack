import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Java Utility Program ===");
            System.out.println("1. Number Utils");
            System.out.println("2. Array Utils");
            System.out.println("3. String Utils");
            System.out.println("4. Pattern Printer");
            System.out.println("5. Employee Manager");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Is Prime: " + NumberUtils.isPrime(n));
                    System.out.println("Is Even: " + NumberUtils.isEven(n));
                    System.out.println("Factorial: " + NumberUtils.factorial(n));
                    System.out.println("Factors: " + NumberUtils.getFactors(n));
                    System.out.println("Digit Count: " + NumberUtils.countDigits(n));
                    System.out.println("Digits: " + NumberUtils.getDigits(n));
                }
                case 2 -> {
                    System.out.print("Enter array size: ");
                    int len = sc.nextInt();
                    int[] arr = new int[len];
                    System.out.println("Enter " + len + " elements:");
                    for (int i = 0; i < len; i++) arr[i] = sc.nextInt();
                    System.out.println("Max: " + ArrayUtils.findMax(arr));
                    System.out.println("Min: " + ArrayUtils.findMin(arr));
                    System.out.println("Evens: " + ArrayUtils.getEvenNumbers(arr));
                    System.out.println("Reversed Array:");
                    ArrayUtils.reverse(arr);
                    System.out.println(Arrays.toString(arr));
                }
                case 3 -> {
                    System.out.print("Enter a string: ");
                    String s = sc.nextLine();
                    System.out.println("Is Palindrome: " + StringUtils.isPalindrome(s));
                    System.out.println("Reversed: " + StringUtils.reverse(s));
                    System.out.println("Words Reversed: " + StringUtils.reverseWords(s));
                    System.out.println("Even Indices Replaced: " + StringUtils.replaceEvenIndices(s));
                }
                case 4 -> {
                    PatternPrinter.patternStars(5, 5);
                    PatternPrinter.patternBinaryRows(5, 5);
                    PatternPrinter.patternIncremental(5, 5);
                    PatternPrinter.patternRepeatedRows(5, 5);
                    PatternPrinter.patternRepeatedCols(5, 5);
                    PatternPrinter.patternAlphabets(5, 5);
                    PatternPrinter.pascalTriangle(5);
                    PatternPrinter.symmetricalHollowDiamond(5);
                }
                case 5 -> EmployeeManager.main(new String[0]);
                case 0 -> {
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
