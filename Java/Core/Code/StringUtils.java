import java.util.*;

public class StringUtils {

    // Check if two strings are anagrams (case-insensitive)
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    // Check if a string is a palindrome (case-insensitive)
    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Reverse a string
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Reverse each word in a sentence (manual approach)
    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(reverse(word)).append(" ");
        }
        return result.toString().trim();
    }

    // Replace characters at even indices with natural numbers
    public static String replaceEvenIndices(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result.append(count++);
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
