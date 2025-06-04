import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, reverseOfS = "";

        System.out.print("Enter String: ");
        S = sc.nextLine();

        for (int i = 0; i < S.length(); i++)
            reverseOfS = S.charAt(i) + reverseOfS;

        System.out.println(reverseOfS);

        sc.close();
    }
}
