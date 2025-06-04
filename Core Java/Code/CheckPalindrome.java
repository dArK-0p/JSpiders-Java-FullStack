import java.util.Scanner;
public class CheckPalindrome {

    public static boolean checkPalindrome(String str) {
        String reverseOfStr = "";

        for (int i = 0; i < str.length(); i++)
            reverseOfStr = str.charAt(i) + reverseOfStr;

        return (str.equalsIgnoreCase(reverseOfStr));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;

        System.out.print("Enter String: ");
        S = sc.nextLine();
        
        System.out.print(S + " is ");
        if (!checkPalindrome(S)) System.out.print("not ");
        System.out.println("Palindrome.");

        sc.close();
    }
}
