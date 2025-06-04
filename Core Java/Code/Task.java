// Replace even index with natural nos.

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer newS = new StringBuffer();
        String S;
        int count = 1;

        System.out.print("Enter String: ");
        S = sc.nextLine();

        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                newS.append(Integer.toString(count++));
                continue;
            }
            newS.append(S.charAt(i));
        }

        newS.trimToSize();
        System.out.println("Original String: " + S);
        System.out.println("Updated String:  " + newS);

        sc.close();
    }
}
