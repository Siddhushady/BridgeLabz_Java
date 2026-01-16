package CoreProgramming.String.Level2;

import java.util.Scanner;

/**
 * ShortestAndLongestWord class finds the shortest and longest word lengths in a text using custom methods.
 * The program demonstrates string manipulation by creating methods to find string length without using
 * length(), split text into words using charAt(), and find minimum and maximum word lengths.
 * It displays the shortest and longest word lengths found in the text.
 */
public class ShortestAndLongestWord {

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
            if (text.charAt(i) == ' ') wordCount++;
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
     * Finds the shortest and longest word lengths in an array of words.
     * @param words Array of words
     * @return Array containing [shortest length, longest length]
     */
    public static int[] findShortestAndLongest(String[] words) {

        // Initializing min and max to length of first word
        int min = findLength(words[0]);
        int max = findLength(words[0]);

        // Loop to find minimum and maximum lengths
        for (int i = 1; i < words.length; i++) {
            // Finding length of current word
            int len = findLength(words[i]);
            // Updating min if current length is smaller
            if (len < min) min = len;
            // Updating max if current length is larger
            if (len > max) max = len;
        }
        // Returning array with shortest and longest lengths
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to split text into words
        String[] words = splitUsingCharAt(text);
        // Calling method to find shortest and longest word lengths
        int[] result = findShortestAndLongest(words);

        // Displaying shortest word length
        System.out.println("Shortest word length : " + result[0]);
        // Displaying longest word length
        System.out.println("Longest word length : " + result[1]);
    }
}
