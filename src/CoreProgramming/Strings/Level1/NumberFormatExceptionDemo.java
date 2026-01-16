package CoreProgramming.String.Level1;

import java.util.Scanner;

/**
 * NumberFormatExceptionDemo class demonstrates NumberFormatException handling.
 * The program demonstrates exception handling by creating methods that attempt to parse
 * a string to an integer using Integer.parseInt(). If the string doesn't contain a valid
 * integer, it throws NumberFormatException. It shows both generating the exception and
 * handling it using try-catch blocks.
 */
public class NumberFormatExceptionDemo {

    /**
     * Method that generates NumberFormatException by parsing invalid string.
     * @param text String to parse
     */
    public static void generateException(String text) {
        // Attempting to parse string to integer, may throw exception if invalid
        int num = Integer.parseInt(text);
        // Displaying parsed number
        System.out.println(num);
    }

    /**
     * Method that handles NumberFormatException using try-catch.
     * @param text String to parse
     */
    public static void handleException(String text) {
        // Try block to attempt string parsing
        try {
            // Attempting to parse string to integer, may throw exception if invalid
            int num = Integer.parseInt(text);
            // Displaying parsed number
            System.out.println(num);
        } 
        // Catch block to handle NumberFormatException
        catch (NumberFormatException e) {
            // Displaying message when exception is caught
            System.out.println("NumberFormatException handled");
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter a value
        System.out.print("Enter a value : ");
        // Reading text from user
        String text = sc.nextLine();

        // Commented out: would generate exception if invalid input
        // generateException(text);
        // Calling method to handle exception safely
        handleException(text);
    }
}
