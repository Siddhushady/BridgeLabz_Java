package CoreProgramming.String.Level3;

import java.util.Scanner;

/**
 * CharFrequencyASCII class finds the frequency of each character in a string using ASCII indexing.
 * The program demonstrates string manipulation and array operations by creating a method that uses
 * a frequency array (256 elements for ASCII characters) to count character frequencies. It creates
 * a table showing each unique character and its frequency count.
 */
public class CharFrequencyASCII {

    /**
     * Finds the frequency of each character in a string.
     * @param text Input string
     * @return 2D array with [character, frequency] for each unique character
     */
    public static String[][] findFrequency(String text) {

        // Creating frequency array for all ASCII characters (256 possible)
        int[] freq = new int[256];
        // First pass: counting frequency of each character
        for (int i = 0; i < text.length(); i++) {
            // Incrementing frequency for character at index i
            freq[text.charAt(i)]++;
        }

        // Second pass: counting number of unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            // Checking if character hasn't been counted yet
            if (freq[text.charAt(i)] != 0) {
                // Incrementing unique character count
                count++;
                // Marking character as counted
                freq[text.charAt(i)] = 0;
            }
        }

        // Creating result array with exact size needed
        String[][] result = new String[count][2];
        // Resetting frequency array for third pass
        freq = new int[256];

        // Third pass: recalculating frequencies
        for (int i = 0; i < text.length(); i++) {
            // Incrementing frequency for character at index i
            freq[text.charAt(i)]++;
        }

        // Fourth pass: storing characters and their frequencies
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            // Checking if character hasn't been stored yet
            if (freq[text.charAt(i)] != 0) {
                // Storing character as string
                result[index][0] = String.valueOf(text.charAt(i));
                // Storing frequency as string
                result[index][1] = String.valueOf(freq[text.charAt(i)]);
                // Marking character as stored
                freq[text.charAt(i)] = 0;
                // Moving to next index
                index++;
            }
        }
        // Returning array with characters and frequencies
        return result;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter text: ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to find character frequencies
        String[][] freq = findFrequency(text);
        // Displaying table header
        System.out.println("Char\tFrequency");
        // Enhanced for loop to display each character and its frequency
        for (String[] row : freq) {
            // Displaying character and frequency
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
