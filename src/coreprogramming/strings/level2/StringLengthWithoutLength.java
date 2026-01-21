package coreprogramming.String.Level2;

import java.util.Scanner;

/**
 * StringLengthWithoutLength class finds the length of a string without using the length() method.
 * The program demonstrates string manipulation by creating a custom method that finds string length
 * by attempting to access characters until an exception occurs (when index is out of bounds).
 * It compares the custom method result with the built-in length() method.
 */
public class StringLengthWithoutLength {

    /**
     * Finds the length of a string without using the length() method.
     * @param text String to measure
     * @return Length of the string
     */
    public static int findLength(String text) {
        // Initializing counter
        int count = 0;

        // Try block to access characters until exception occurs
        try {
            // Infinite loop to access characters
            while (true) {
                // Attempting to access character at count index
                text.charAt(count);
                // Incrementing counter
                count++;
            }
        } 
        // Catch block: exception occurs when index is out of bounds (end of string)
        catch (Exception e) {
            // Returning count as length when exception occurs
            return count;
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.next();

        // Calling custom method to find length and displaying result
        System.out.println("Custom length : " + findLength(text));
        // Using built-in method to find length and displaying result
        System.out.println("Built-in length : " + text.length());
    }
}
