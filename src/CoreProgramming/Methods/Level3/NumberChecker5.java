package Core_Programming.Methods.Level3;

/**
 * NumberChecker5 class checks various number classification properties using multiple methods.
 * The program demonstrates advanced method usage by creating functions to find factors,
 * check for perfect numbers (sum of proper divisors equals number), abundant numbers
 * (sum of proper divisors > number), deficient numbers (sum < number), and strong numbers
 * (sum of factorials of digits equals number).
 */
public class NumberChecker5 {

    /**
     * Finds all factors of a number.
     * @param n The number
     * @return Array containing all factors
     */
    public static int[] findFactors(int n) {
        // First pass: counting number of factors
        int count = 0;
        for (int i = 1; i <= n; i++)
            // Incrementing count if i is a factor
            if (n % i == 0) count++;

        // Creating array with exact size needed
        int[] factors = new int[count];
        int idx = 0;
        // Second pass: storing all factors
        for (int i = 1; i <= n; i++)
            // Storing factor if it divides evenly
            if (n % i == 0) factors[idx++] = i;

        // Returning array of factors
        return factors;
    }

    /**
     * Calculates the sum of all factors.
     * @param f Array of factors
     * @return Sum of all factors
     */
    public static int sumFactors(int[] f) {
        // Initializing sum to accumulate total
        int sum = 0;
        // Enhanced for loop to add each factor
        for (int x : f) sum += x;
        // Returning the calculated sum
        return sum;
    }

    /**
     * Checks if a number is perfect (sum of proper divisors equals the number).
     * @param n The number to check
     * @return true if perfect number, false otherwise
     */
    public static boolean isPerfect(int n) {
        // Initializing sum of proper divisors
        int sum = 0;
        // Loop to find proper divisors (excluding n itself)
        for (int i = 1; i < n; i++)
            // Adding divisor to sum if it divides evenly
            if (n % i == 0) sum += i;
        // Returning true if sum equals the number
        return sum == n;
    }

    /**
     * Checks if a number is abundant (sum of proper divisors > number).
     * @param n The number to check
     * @return true if abundant number, false otherwise
     */
    public static boolean isAbundant(int n) {
        // Initializing sum of proper divisors
        int sum = 0;
        // Loop to find proper divisors (excluding n itself)
        for (int i = 1; i < n; i++)
            // Adding divisor to sum if it divides evenly
            if (n % i == 0) sum += i;
        // Returning true if sum is greater than the number
        return sum > n;
    }

    /**
     * Checks if a number is deficient (sum of proper divisors < number).
     * @param n The number to check
     * @return true if deficient number, false otherwise
     */
    public static boolean isDeficient(int n) {
        // Initializing sum of proper divisors
        int sum = 0;
        // Loop to find proper divisors (excluding n itself)
        for (int i = 1; i < n; i++)
            // Adding divisor to sum if it divides evenly
            if (n % i == 0) sum += i;
        // Returning true if sum is less than the number
        return sum < n;
    }

    /**
     * Checks if a number is strong (sum of factorials of digits equals the number).
     * @param n The number to check
     * @return true if strong number, false otherwise
     */
    public static boolean isStrong(int n) {
        // Creating temporary copy to preserve original
        int temp = n, sum = 0;
        // Loop to extract digits
        while (temp > 0) {
            // Extracting last digit
            int d = temp % 10;
            // Calculating factorial of the digit
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            // Adding factorial to sum
            sum += fact;
            // Removing last digit
            temp /= 10;
        }
        // Returning true if sum equals original number
        return sum == n;
    }

    public static void main(String[] args) {
        // Setting number to check
        int n = 145;
        // Calling methods to check various properties and display results
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
