package coreprogramming.String.Level1;

/**
 * ArrayIndexOutOfBoundsDemo class demonstrates ArrayIndexOutOfBoundsException handling.
 * The program demonstrates exception handling by creating methods that attempt to access
 * an array index that is out of bounds. It shows both generating the exception and handling
 * it using try-catch blocks. This exception occurs when trying to access an array element
 * at an index that doesn't exist.
 */
public class ArrayIndexOutOfBoundsDemo {

    /**
     * Method that generates ArrayIndexOutOfBoundsException by accessing invalid index.
     * @param arr Array to access
     */
    public static void generateException(String[] arr) {
        // Attempting to access index 5, which may be out of bounds
        System.out.println(arr[5]);
    }

    /**
     * Method that handles ArrayIndexOutOfBoundsException using try-catch.
     * @param arr Array to access
     */
    public static void handleException(String[] arr) {
        // Try block to attempt array access
        try {
            // Attempting to access index 5, which may be out of bounds
            System.out.println(arr[5]);
        } 
        // Catch block to handle ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            // Displaying message when exception is caught
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        // Creating array with 3 elements (indices 0, 1, 2)
        String[] names = {"Java", "Python", "C++"};

        // Commented out: would generate exception
        // generateException(names);
        // Calling method to handle exception safely
        handleException(names);
    }
}
