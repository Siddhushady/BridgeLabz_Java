package coreprogramming.String.Level3;

import java.util.Scanner;

/**
 * UniqueCharacters class finds all unique characters in a string (characters that appear only once).
 * The program demonstrates string manipulation and array operations by creating a method that
 * checks each character against all previous characters to determine if it's unique (first occurrence).
 * It returns an array containing all unique characters in the order they first appear.
 */
public class UniqueCharacters {

    /**
     * Finds all unique characters in a string (first occurrence of each character).
     * @param text Input string
     * @return Array of unique characters
     */
    public static char[] findUniqueChars(String text) {

        // Creating temporary array to store unique characters (max size = text length)
        char[] temp = new char[text.length()];
        int count = 0;

        // Loop to process each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Assuming character is unique initially
            boolean isUnique = true;

            // Loop to check if character appeared before
            for (int j = 0; j < i; j++) {
                // Checking if current character matches any previous character
                if (text.charAt(i) == text.charAt(j)) {
                    // Marking as not unique if match found
                    isUnique = false;
                    // Breaking inner loop
                    break;
                }
            }
            // Adding character to array if it's unique
            if (isUnique) {
                temp[count++] = text.charAt(i);
            }
        }

        // Creating result array with exact size needed
        char[] result = new char[count];
        // Copying unique characters to result array
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        // Returning array of unique characters
        return result;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter text: ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to find unique characters
        char[] unique = findUniqueChars(text);
        // Displaying header
        System.out.print("Unique characters: ");
        // Enhanced for loop to display each unique character
        for (char c : unique) {
            // Displaying character followed by space
            System.out.print(c + " ");
        }
    }
}
