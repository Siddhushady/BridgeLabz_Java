package CoreProgramming.String.Level2;

import java.util.Scanner;

/**
 * SplitTextCompare class splits text into words using custom method and compares with built-in method.
 * The program demonstrates string manipulation by creating methods to find string length without
 * using length(), split text into words using charAt(), and compare string arrays. It verifies
 * that the custom split method produces the same result as the built-in split() method.
 */
public class SplitTextCompare {

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

    /**
     * Splits text into words using charAt() method (space-separated).
     * @param text Text to split
     * @return Array of words
     */
    public static String[] splitUsingCharAt(String text) {

        // Finding length of text
        int length = findLength(text);
        // Initializing word count to 1 (at least one word)
        int wordCount = 1;

        // Loop to count number of words (spaces + 1)
        for (int i = 0; i < length; i++) {
            // Incrementing word count when space is found
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Creating array to store words
        String[] words = new String[wordCount];
        int index = 0;
        // Initializing current word string
        String word = "";

        // Loop to extract words from text
        for (int i = 0; i < length; i++) {
            // Checking if character is not a space
            if (text.charAt(i) != ' ') {
                // Appending character to current word
                word += text.charAt(i);
            } else {
                // Storing completed word and resetting for next word
                words[index++] = word;
                word = "";
            }
        }
        // Storing the last word
        words[index] = word;
        // Returning array of words
        return words;
    }

    /**
     * Compares two string arrays for equality.
     * @param a First string array
     * @param b Second string array
     * @return true if arrays are equal, false otherwise
     */
    public static boolean compareArrays(String[] a, String[] b) {
        // Checking if arrays have different lengths
        if (a.length != b.length) return false;

        // Loop to compare each element
        for (int i = 0; i < a.length; i++) {
            // Returning false if any element differs
            if (!a[i].equals(b[i])) return false;
        }
        // Returning true if all elements match
        return true;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling custom method to split text
        String[] customSplit = splitUsingCharAt(text);
        // Using built-in method to split text
        String[] builtInSplit = text.split(" ");

        // Calling method to compare arrays and displaying result
        System.out.println("Are both same: " +
                compareArrays(customSplit, builtInSplit));
    }
}
