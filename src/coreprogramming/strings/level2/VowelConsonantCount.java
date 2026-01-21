package coreprogramming.String.Level2;

import java.util.Scanner;

/**
 * VowelConsonantCount class counts vowels and consonants in a string using custom methods.
 * The program demonstrates string manipulation by creating methods to check if a character
 * is a vowel, consonant, or not a letter, and then counting the total number of vowels
 * and consonants in the entire string. It displays the counts for both categories.
 */
public class VowelConsonantCount {

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

    /**
     * Counts the number of vowels and consonants in a string.
     * @param text Input string
     * @return Array containing [vowel count, consonant count]
     */
    public static int[] countVowelsAndConsonants(String text) {

        // Initializing counters for vowels and consonants
        int vowels = 0, consonants = 0;

        // Loop to process each character in the string
        for (int i = 0; i < text.length(); i++) {
            // Calling method to check character type
            String result = checkChar(text.charAt(i));

            // Incrementing vowel count if character is a vowel
            if (result.equals("Vowel")) vowels++;
            // Incrementing consonant count if character is a consonant
            if (result.equals("Consonant")) consonants++;
        }
        // Returning array with vowel and consonant counts
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to count vowels and consonants
        int[] result = countVowelsAndConsonants(text);

        // Displaying vowel count
        System.out.println("Vowels : " + result[0]);
        // Displaying consonant count
        System.out.println("Consonants : " + result[1]);
    }
}
