package Core_Programming.Methods.Level3;

/**
 * NumberChecker3 class performs palindrome and duck number checks using multiple methods.
 * The program demonstrates advanced method usage by creating functions to store digits,
 * reverse arrays, compare arrays, check for palindromes, and check for duck numbers.
 * A palindrome number reads the same forwards and backwards.
 */
public class NumberChecker3 {

    /**
     * Stores all digits of a number in an array.
     * @param n The number
     * @return Array containing all digits
     */
    public static int[] storeDigits(int n) {
        // Creating array with size equal to number of digits
        int[] d = new int[String.valueOf(n).length()];
        // Loop to extract digits from right to left
        for (int i = d.length - 1; i >= 0; i--) {
            // Extracting last digit
            d[i] = n % 10;
            // Removing last digit
            n /= 10;
        }
        // Returning array of digits
        return d;
    }

    /**
     * Reverses an array.
     * @param arr Input array
     * @return Reversed array
     */
    public static int[] reverseArray(int[] arr) {
        // Creating array to store reversed elements
        int[] rev = new int[arr.length];
        // Loop to copy elements in reverse order
        for (int i = 0; i < arr.length; i++)
            // Copying element from end to beginning
            rev[i] = arr[arr.length - 1 - i];
        // Returning reversed array
        return rev;
    }

    /**
     * Compares two arrays for equality.
     * @param a First array
     * @param b Second array
     * @return true if arrays are equal, false otherwise
     */
    public static boolean compareArrays(int[] a, int[] b) {
        // Loop to compare each element
        for (int i = 0; i < a.length; i++)
            // Returning false if any element differs
            if (a[i] != b[i]) return false;
        // Returning true if all elements match
        return true;
    }

    /**
     * Checks if a number is a palindrome (reads same forwards and backwards).
     * @param digits Array of digits
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(int[] digits) {
        // Comparing original array with its reverse
        return compareArrays(digits, reverseArray(digits));
    }

    /**
     * Checks if a number is a duck number (contains at least one non-zero digit).
     * @param digits Array of digits
     * @return true if duck number, false otherwise
     */
    public static boolean isDuckNumber(int[] digits) {
        // Enhanced for loop to check each digit
        for (int d : digits)
            // Returning true if any digit is non-zero
            if (d != 0) return true;
        // Returning false if all digits are zero
        return false;
    }

    public static void main(String[] args) {
        // Setting number to analyze
        int number = 121;
        // Calling method to store digits
        int[] digits = storeDigits(number);

        // Calling methods to check number properties and display results
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuckNumber(digits));
    }
}
