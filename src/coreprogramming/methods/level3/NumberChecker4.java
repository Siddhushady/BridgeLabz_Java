package Core_Programming.Methods.Level3;

/**
 * NumberChecker4 class checks various number properties using multiple methods.
 * The program demonstrates advanced method usage by creating functions to check
 * if a number is prime, neon, spy, automorphic, or buzz. Each method implements
 * a specific mathematical property check.
 */
public class NumberChecker4 {

    /**
     * Checks if a number is prime (divisible only by 1 and itself).
     * @param n The number to check
     * @return true if prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // Numbers <= 1 are not prime
        if (n <= 1) return false;
        // Loop to check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++)
            // Returning false if any divisor found
            if (n % i == 0) return false;
        // Returning true if no divisors found
        return true;
    }

    /**
     * Checks if a number is a neon number (sum of digits of square equals the number).
     * @param n The number to check
     * @return true if neon number, false otherwise
     */
    public static boolean isNeon(int n) {
        // Calculating square of the number
        int sq = n * n, sum = 0;
        // Loop to extract digits from square
        while (sq > 0) {
            // Adding last digit to sum
            sum += sq % 10;
            // Removing last digit
            sq /= 10;
        }
        // Returning true if sum equals original number
        return sum == n;
    }

    /**
     * Checks if a number is a spy number (sum of digits equals product of digits).
     * @param n The number to check
     * @return true if spy number, false otherwise
     */
    public static boolean isSpy(int n) {
        // Initializing sum and product
        int sum = 0, prod = 1;
        // Loop to extract digits
        while (n > 0) {
            // Extracting last digit
            int d = n % 10;
            // Adding digit to sum
            sum += d;
            // Multiplying digit to product
            prod *= d;
            // Removing last digit
            n /= 10;
        }
        // Returning true if sum equals product
        return sum == prod;
    }

    /**
     * Checks if a number is automorphic (square ends with the number itself).
     * @param n The number to check
     * @return true if automorphic, false otherwise
     */
    public static boolean isAutomorphic(int n) {
        // Calculating square of the number
        int sq = n * n;
        // Checking if square ends with the number
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    /**
     * Checks if a number is a buzz number (divisible by 7 or ends with 7).
     * @param n The number to check
     * @return true if buzz number, false otherwise
     */
    public static boolean isBuzz(int n) {
        // Returning true if divisible by 7 OR ends with 7
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        // Setting number to check
        int n = 7;
        // Calling methods to check various properties and display results
        System.out.println("Prime: " + isPrime(n));
        System.out.println("Neon: " + isNeon(n));
        System.out.println("Spy: " + isSpy(n));
        System.out.println("Automorphic: " + isAutomorphic(n));
        System.out.println("Buzz: " + isBuzz(n));
    }
}
