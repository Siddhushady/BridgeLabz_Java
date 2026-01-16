package CoreProgramming.String.Level1;

import java.util.Scanner;

/**
 * IllegalArgumentExceptionDemo class demonstrates IllegalArgumentException handling.
 * The program demonstrates exception handling by creating methods that attempt to use
 * substring() with invalid arguments (start index > end index), which throws
 * IllegalArgumentException. It shows both generating the exception and handling it
 * using try-catch blocks.
 */
public class IllegalArgumentExceptionDemo {

    /**
     * Method that generates IllegalArgumentException by using invalid substring indices.
     * @param text String to process
     */
    public static void generateException(String text) {
        // Attempting substring with start > end (invalid), which throws exception
        System.out.println(text.substring(5, 2));
    }

    /**
     * Method that handles IllegalArgumentException using try-catch.
     * @param text String to process
     */
    public static void handleException(String text) {
        // Try block to attempt substring operation
        try {
            // Attempting substring with start > end (invalid), which throws exception
            System.out.println(text.substring(5, 2));
        } 
        // Catch block to handle IllegalArgumentException
        catch (IllegalArgumentException e) {
            // Displaying message when exception is caught
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Calling method to handle exception safely
        handleException(text);
    }
}
