package coreprogramming.String.Level3;

import java.util.Scanner;

/**
 * PalindromeCheck class checks if a string is a palindrome using three different methods.
 * The program demonstrates string manipulation and recursion by creating methods to check
 * palindromes using iterative comparison, recursive comparison, and string reversal.
 * A palindrome reads the same forwards and backwards.
 */
public class PalindromeCheck {

    /**
     * Checks if a string is a palindrome using iterative method (two pointers).
     * @param text String to check
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String text) {
        // Initializing start and end pointers
        int start = 0, end = text.length() - 1;
        // Loop to compare characters from both ends
        while (start < end) {
            // Returning false if characters don't match
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        // Returning true if all characters match
        return true;
    }

    /**
     * Checks if a string is a palindrome using recursive method.
     * @param text String to check
     * @param start Start index
     * @param end End index
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        // Base case: if start >= end, all characters compared
        if (start >= end) return true;
        // Returning false if characters don't match
        if (text.charAt(start) != text.charAt(end)) return false;
        // Recursive call: compare next pair of characters
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    /**
     * Reverses a string using charAt() method.
     * @param text String to reverse
     * @return Reversed string
     */
    public static String reverse(String text) {
        // Initializing reversed string
        String rev = "";
        // Loop to extract characters from end to beginning
        for (int i = text.length() - 1; i >= 0; i--) {
            // Appending character to reversed string
            rev += text.charAt(i);
        }
        // Returning reversed string
        return rev;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter text: ");
        // Reading text from user
        String text = sc.nextLine();

        // Checking palindrome using iterative method and displaying result
        System.out.println("Logic 1: " + checkPalindrome(text));
        // Checking palindrome using recursive method and displaying result
        System.out.println("Logic 2: " + checkPalindromeRecursive(text, 0, text.length() - 1));
        // Checking palindrome by comparing with reversed string and displaying result
        System.out.println("Logic 3: " + text.equals(reverse(text)));
    }
}
