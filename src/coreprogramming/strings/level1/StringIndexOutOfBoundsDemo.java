package coreprogramming.String.Level1;

import java.util.Scanner;

/**
 * StringIndexOutOfBoundsDemo class demonstrates StringIndexOutOfBoundsException handling.
 * The program demonstrates exception handling by creating methods that attempt to access
 * a character at an index equal to the string length (which is out of bounds, as valid
 * indices are 0 to length-1). It shows both generating the exception and handling it
 * using try-catch blocks.
 */
public class StringIndexOutOfBoundsDemo {

    /**
     * Method that generates StringIndexOutOfBoundsException by accessing invalid index.
     * @param text String to access
     */
    public static void generateException(String text) {
        // Attempting to access character at index equal to length (out of bounds)
        System.out.println(text.charAt(text.length()));
    }

    /**
     * Method that handles StringIndexOutOfBoundsException using try-catch.
     * @param text String to access
     */
    public static void handleException(String text) {
        // Try block to attempt character access
        try {
            // Attempting to access character at index equal to length (out of bounds)
            System.out.println(text.charAt(text.length()));
        } 
        // Catch block to handle StringIndexOutOfBoundsException
        catch (StringIndexOutOfBoundsException e) {
            // Displaying message when exception is caught
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter text
        System.out.print("Enter the text : ");
        // Reading text from user
        String text = sc.nextLine();

        // Commented out: would generate exception
        // generateException(text);
        // Calling method to handle exception safely
        handleException(text);
    }
}
