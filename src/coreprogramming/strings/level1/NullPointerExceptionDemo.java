package coreprogramming.String.Level1;

/**
 * NullPointerExceptionDemo class demonstrates NullPointerException handling.
 * The program demonstrates exception handling by creating methods that attempt to call
 * a method on a null reference, which throws NullPointerException. It shows both generating
 * the exception and handling it using try-catch blocks. This exception occurs when trying
 * to access methods or properties of a null object.
 */
public class NullPointerExceptionDemo {

    /**
     * Method that generates NullPointerException by calling method on null reference.
     */
    public static void generateException() {
        // Creating null string reference
        String text = null;
        // Attempting to call length() on null, which throws exception
        System.out.println(text.length()); // Exception
    }

    /**
     * Method that handles NullPointerException using try-catch.
     */
    public static void handleException() {
        // Try block to attempt operation on null reference
        try {
            // Creating null string reference
            String text = null;
            // Attempting to call length() on null, which throws exception
            System.out.println(text.length());
        } 
        // Catch block to handle NullPointerException
        catch (NullPointerException e) {
            // Displaying message when exception is caught
            System.out.println("NullPointerException handled successfully");
        }
    }

    public static void main(String[] args) {

        // Calling method to handle exception safely
        handleException();
    }
}
