import java.util.*;

public class LCProblems extends LCSolutions {
    static Scanner sc = new Scanner(System.in);

    public void P07() {
        System.out.println("Enter n: ");
        System.out.println("Output: " + reverse(sc.nextInt()));
    }

    public void P268() {
        System.out.println("Enter array elements (space-separated): ");
        System.out.println("Output: " + missingNumber((int[]) InputArrayBuilder.buildArray("int")));
    }

    public void P1688() {
        System.out.println("Enter n: ");
        System.out.println("Output: " + numberOfMatches(sc.nextInt()));
    }

    public void P2016() {
        System.out.println("Enter array elements (space-separated): ");
        System.out.println("Output: " + maximumDifference((int[]) InputArrayBuilder.buildArray("int")));
    }

    public void P3409() {
        System.out.println("Enter array elements (space-separated): ");
        System.out.println("Output: " + longestSubsequence((int[]) InputArrayBuilder.buildArray("int")));
    }

}
