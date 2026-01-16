package CoreProgramming.String.Level3;

import java.util.Scanner;

/**
 * FirstNonRepeatingChar class finds the first non-repeating character in a string using frequency counting.
 * The program demonstrates string manipulation and array operations by creating a method that uses
 * a frequency array (256 elements for ASCII characters) to count character frequencies, then
 * finds the first character with frequency 1 (appears only once).
 */
public class FirstNonRepeatingChar {

    /**
     * Finds the first non-repeating character in a string.
     * @param text Input string
     * @return First non-repeating character, or '\0' if none found
     */
    public static char findFirstNonRepeating(String text) {

        // Creating frequency array for all ASCII characters (256 possible)
        int[] freq = new int[256];

        // First pass: counting frequency of each character
        for (int i = 0; i < text.length(); i++) {
            // Incrementing frequency for character at index i
            freq[text.charAt(i)]++;
        }

        // Second pass: finding first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            // Checking if character appears only once
            if (freq[text.charAt(i)] == 1) {
                // Returning first non-repeating character
                return text.charAt(i);
            }
        }
        // Returning null character if no non-repeating character found
        return '\0';
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter text: ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to find first non-repeating character
        char result = findFirstNonRepeating(text);
        // Checking if non-repeating character was found
        if (result != '\0')
            // Displaying the first non-repeating character
            System.out.println("First non-repeating character: " + result);
        else
            // Displaying message if no non-repeating character found
            System.out.println("No non-repeating character found");
    }
}
