import java.util.Scanner;
public class ReverseWords {

	public static String reverseOfS(String str) {
	String rev = "";

	for(int i = 0; i < str.length(); i++)
		rev = str.charAt(i) + rev;

	return rev;
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String S, revS = "", word = "";

		System.out.print("Enter String: ");
		S = sc.nextLine().trim() + " "; // Method Chaining.

		for (int i = 0; i < S.length(); i++) {

			if(S.charAt(i) != ' ')
				word += S.charAt(i);
			else {
				revS += reverseOfS(word) + " ";
				word = "";
			}
		}

		revS = revS.trim();

		System.out.println(revS);

		sc.close();
	}
}