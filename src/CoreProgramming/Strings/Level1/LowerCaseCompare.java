package CoreProgramming.String.Level1;

import java.util.Scanner;

/**
 * LowerCaseCompare class converts a string to lowercase using custom method and compares with built-in method.
 * The program demonstrates string manipulation by creating a custom method to convert uppercase letters
 * to lowercase using ASCII values (adding 32), then comparing it with the built-in toLowerCase() method.
 * It shows how to manually perform case conversion and verifies both methods produce the same result.
 */
public class LowerCaseCompare {

    /**
     * Converts a string to lowercase using ASCII value manipulation.
     * @param text Input string
     * @return String converted to lowercase
     */
    public static String convertToLower(String text) {
        // Initializing result string
        String result = "";

        // Loop to process each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Extracting character at index i
            char ch = text.charAt(i);

            // Checking if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                // Converting to lowercase by adding 32 (ASCII difference)
                ch = (char) (ch + 32);
            }
            // Appending character to result string
            result = result + ch;
        }
        // Returning converted string
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
        if (s1.length() != s2.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++) {
            // Returning false if any character differs
            if (s1.charAt(i) != s2.charAt(i)) return false;
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

        // Calling custom method to convert to lowercase
        String customLower = convertToLower(text);
        // Using built-in method to convert to lowercase
        String builtInLower = text.toLowerCase();

        // Displaying results from both methods
        System.out.println("Custom Lowercase : " + customLower);
        System.out.println("Built-in Lowercase : " + builtInLower);
        // Comparing results from both methods
        System.out.println("Are both equal: " +
                compareUsingCharAt(customLower, builtInLower));
    }
}
