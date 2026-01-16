package CoreProgramming.String.Level3;

import java.util.Scanner;

/**
 * AnagramCheck class checks if two strings are anagrams using frequency counting.
 * The program demonstrates string manipulation and array operations by creating a method
 * that uses a frequency array (256 elements for ASCII characters) to count character
 * frequencies. For anagrams, all frequencies should be zero after incrementing for first
 * string and decrementing for second string.
 */
public class AnagramCheck {

    /**
     * Checks if two strings are anagrams (contain same characters in any order).
     * @param s1 First string
     * @param s2 Second string
     * @return true if anagrams, false otherwise
     */
    public static boolean areAnagrams(String s1, String s2) {

        // Checking if strings have different lengths (cannot be anagrams)
        if (s1.length() != s2.length()) return false;

        // Creating frequency array for all ASCII characters (256 possible)
        int[] freq = new int[256];

        // Loop to count character frequencies
        for (int i = 0; i < s1.length(); i++) {
            // Incrementing frequency for character in first string
            freq[s1.charAt(i)]++;
            // Decrementing frequency for character in second string
            freq[s2.charAt(i)]--;
        }

        // Loop to check if all frequencies are zero (balanced = anagrams)
        for (int i : freq) {
            // Returning false if any frequency is non-zero
            if (i != 0) return false;
        }
        // Returning true if all frequencies are zero (anagrams)
        return true;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter first string
        System.out.print("Enter first text: ");
        // Reading first string from user
        String s1 = sc.nextLine();

        // Prompting user to enter second string
        System.out.print("Enter second text: ");
        // Reading second string from user
        String s2 = sc.nextLine();

        // Calling method to check if strings are anagrams and displaying result
        System.out.println("Are anagrams: " + areAnagrams(s1, s2));
    }
}
