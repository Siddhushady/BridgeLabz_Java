package coreprogramming.String.Level2;

import java.util.Scanner;

/**
 * CharacterTypeDisplay class classifies each character in a string as vowel, consonant, or not a letter.
 * The program demonstrates string manipulation by creating a method that checks each character,
 * converts uppercase to lowercase if needed, and determines if it's a vowel (a, e, i, o, u),
 * consonant, or not a letter. It displays a table showing each character and its type.
 */
public class CharacterTypeDisplay {

    /**
     * Checks the type of a character (vowel, consonant, or not a letter).
     * @param ch Character to check
     * @return "Vowel", "Consonant", or "Not a Letter"
     */
    public static String checkChar(char ch) {

        // Converting uppercase to lowercase for easier checking
        if (ch >= 'A' && ch <= 'Z') {
            // Converting by adding 32 (ASCII difference)
            ch = (char) (ch + 32);
        }

        // Checking if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            // Checking if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            // Returning consonant if it's a letter but not a vowel
            return "Consonant";
        }
        // Returning not a letter if character is not alphabetic
        return "Not a Letter";
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Displaying table header
        System.out.println("Character\tType");
        // Loop to process each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Displaying character and its type
            System.out.println(text.charAt(i) + "\t\t" +
                    checkChar(text.charAt(i)));
        }
    }
}
