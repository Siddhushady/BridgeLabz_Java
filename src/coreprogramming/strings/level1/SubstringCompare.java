package coreprogramming.String.Level1;

import java.util.Scanner;

/**
 * SubstringCompare class creates a substring using custom charAt() method and compares with built-in method.
 * The program demonstrates string manipulation by creating a custom method to extract a substring
 * using charAt() and string concatenation, then comparing it with the built-in substring() method.
 * It shows how to manually extract a portion of a string and verifies both methods produce the same result.
 */
public class SubstringCompare {

    /**
     * Creates a substring using charAt() method.
     * @param text Input string
     * @param start Start index (inclusive)
     * @param end End index (exclusive)
     * @return Substring from start to end-1
     */
    public static String createSubstring(String text, int start, int end) {
        // Initializing result string
        String result = "";

        // Loop to extract characters from start to end-1
        for (int i = start; i < end; i++) {
            // Appending character at index i to result
            result = result + text.charAt(i);
        }
        // Returning the created substring
        return result;
    }

    /**
     * Compares two strings character by character using charAt().
     * @param s1 First string
     * @param s2 Second string
     * @return true if strings are equal, false otherwise
     */
    public static boolean compareUsingCharAt(String s1, String s2) {
        // Checking if strings have different lengths
        if (s1.length() != s2.length()) {
            return false;
        }

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++) {
            // Returning false if any character differs
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        // Returning true if all characters match
        return true;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Prompting user to enter start index
        System.out.print("Enter start index : ");
        // Reading start index from user
        int start = sc.nextInt();

        // Prompting user to enter end index
        System.out.print("Enter end index : ");
        // Reading end index from user
        int end = sc.nextInt();

        // Calling custom method to create substring
        String customSubstring = createSubstring(text, start, end);
        // Using built-in method to create substring
        String builtInSubstring = text.substring(start, end);

        // Displaying results from both methods
        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        // Comparing results from both methods
        System.out.println("Are both equal: " +
                compareUsingCharAt(customSubstring, builtInSubstring));
    }
}
