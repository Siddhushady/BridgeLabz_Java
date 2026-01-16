package CoreProgramming.String.Level1;

import java.util.Scanner;

/**
 * CharArrayCompare class converts a string to character array and compares custom vs built-in methods.
 * The program demonstrates string manipulation by creating a custom method to convert string to char array
 * using charAt(), then comparing it with the built-in toCharArray() method. It shows how to manually
 * extract characters from a string and compare arrays element by element.
 */
public class CharArrayCompare {

    /**
     * Converts a string to character array using charAt() method.
     * @param text Input string
     * @return Character array containing all characters from the string
     */
    public static char[] getCharacters(String text) {
        // Creating array with size equal to string length
        char[] arr = new char[text.length()];

        // Loop to extract each character from the string
        for (int i = 0; i < text.length(); i++) {
            // Extracting character at index i and storing in array
            arr[i] = text.charAt(i);
        }
        // Returning the character array
        return arr;
    }

    /**
     * Compares two character arrays for equality.
     * @param a First character array
     * @param b Second character array
     * @return true if arrays are equal, false otherwise
     */
    public static boolean compareArrays(char[] a, char[] b) {
        // Checking if arrays have different lengths
        if (a.length != b.length) {
            return false;
        }

        // Loop to compare each element
        for (int i = 0; i < a.length; i++) {
            // Returning false if any element differs
            if (a[i] != b[i]) {
                return false;
            }
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

        // Calling custom method to convert string to char array
        char[] customArray = getCharacters(text);
        // Using built-in method to convert string to char array
        char[] builtInArray = text.toCharArray();

        // Calling method to compare arrays and displaying result
        System.out.println("Are both arrays equal: " +
                compareArrays(customArray, builtInArray));
    }
}
