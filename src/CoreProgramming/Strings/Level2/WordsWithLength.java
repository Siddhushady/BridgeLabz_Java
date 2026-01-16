package CoreProgramming.String.Level2;

import java.util.Scanner;

/**
 * WordsWithLength class splits text into words and displays each word with its length using custom methods.
 * The program demonstrates string manipulation by creating methods to find string length without using
 * length(), split text into words using charAt(), and create a table showing each word and its length.
 * It displays a formatted table with all words and their corresponding lengths.
 */
public class WordsWithLength {

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
     * Creates a table with words and their lengths.
     * @param words Array of words
     * @return 2D array with [word, length] for each word
     */
    public static String[][] getWordLengthTable(String[] words) {

        // Creating 2D array: same number of words, 2 columns [word, length]
        String[][] table = new String[words.length][2];

        // Loop to process each word
        for (int i = 0; i < words.length; i++) {
            // Storing word in first column
            table[i][0] = words[i];
            // Finding length and converting to string, storing in second column
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        // Returning table with words and lengths
        return table;
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
        // Calling method to create word-length table
        String[][] table = getWordLengthTable(words);

        // Displaying table header
        System.out.println("Word\tLength");
        // Loop to display each word and its length
        for (int i = 0; i < table.length; i++) {
            // Displaying word and its length (converted to integer for display)
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
