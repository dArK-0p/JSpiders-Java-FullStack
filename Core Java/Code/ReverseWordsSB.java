import java.util.Scanner;
// Sambit Sagar PAnigrahy 
public class ReverseWordsSB {

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
				StringBuffer reverseWord = new StringBuffer(word);
				reverseWord.reverse();
				
				revS += reverseWord + " ";
				word = "";
			}
		}

		revS = revS.trim();

		System.out.println(revS);

		sc.close();
	}
}