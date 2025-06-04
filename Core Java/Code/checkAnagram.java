import java.util.Scanner;

public class checkAnagram {

    public static int sumOfStr(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, S1;

        System.out.print("Enter String 1: ");
        S = sc.nextLine().trim();
        System.out.print("Enter String 2: ");
        S1 = sc.nextLine().trim();

        sc.close();

        int sum = sumOfStr(S.toLowerCase()), sum1 = sumOfStr(S1.toLowerCase());

        if( (S.length() != S1.length()) && (sum != sum1) ) {
            System.out.println("Not Anagram !");
            return;
        }
        
        int i = 0;

        for (; i < S.length(); i++) {
            sum -= (int)S.charAt(i);
            sum1 -= (int)S.charAt(i);
            if(sum != sum1) break;
        }
        
        if(i == S.length() && sum == sum1)
            System.out.println("Anagram !!");
    }
    /*public static boolean checkInStr(char ch, String str) {
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i))
                return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String S, S1;

		System.out.print("Enter String 1: ");
		S = sc.nextLine().trim();
        System.out.print("Enter String 2: ");
		S1 = sc.nextLine().trim();

        sc.close();

        if(S.length() != S1.length()) {
            System.out.println("Not Anagram !");
            return;
        }

        for (int i = 0; i < S.length(); i++) {
            if(!checkInStr(S.toLowerCase().charAt(i), S1.toLowerCase())) {
                System.out.println("Not Anagram !");
                return;
            }
        }

        System.out.println("Anagram !!");
    }*/
}
