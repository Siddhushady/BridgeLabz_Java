package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * FactorOperations class performs various operations on factors of a number using multiple methods.
 * The program demonstrates advanced method usage by creating functions to find all factors,
 * calculate sum of factors, product of factors, and sum of squares of factors.
 * It reads a number and displays all factors along with these calculated statistics.
 */
public class FactorOperations {

    /**
     * Finds all factors of a given number.
     * @param number The number to find factors for
     * @return Array containing all factors of the number
     */
    public static int[] findFactors(int number) {
        // First pass: counting number of factors to determine array size
        int count = 0;
        for (int i = 1; i <= number; i++) {
            // Checking if i is a factor
            if (number % i == 0) count++;
        }

        // Creating array with exact size needed
        int[] factors = new int[count];
        int index = 0;
        // Second pass: storing all factors in the array
        for (int i = 1; i <= number; i++) {
            // Storing factor if it divides evenly
            if (number % i == 0) factors[index++] = i;
        }
        // Returning array of all factors
        return factors;
    }

    /**
     * Calculates the sum of all factors.
     * @param factors Array of factors
     * @return Sum of all factors
     */
    public static int sumOfFactors(int[] factors) {
        // Initializing sum to accumulate total
        int sum = 0;
        // Enhanced for loop to add each factor to sum
        for (int f : factors) sum += f;
        // Returning the calculated sum
        return sum;
    }

    /**
     * Calculates the product of all factors.
     * @param factors Array of factors
     * @return Product of all factors (using long to handle large values)
     */
    public static long productOfFactors(int[] factors) {
        // Initializing product to 1 (identity element for multiplication)
        long product = 1;
        // Enhanced for loop to multiply each factor
        for (int f : factors) product *= f;
        // Returning the calculated product
        return product;
    }

    /**
     * Calculates the sum of squares of all factors.
     * @param factors Array of factors
     * @return Sum of squares of all factors
     */
    public static double sumOfSquares(int[] factors) {
        // Initializing sum to accumulate squares
        double sum = 0;
        // Enhanced for loop to add square of each factor
        for (int f : factors) sum += Math.pow(f, 2);
        // Returning the calculated sum of squares
        return sum;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for factor operations
        int number = sc.nextInt();

        // Calling method to find all factors
        int[] factors = findFactors(number);

        // Displaying all factors
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        // Calling methods to calculate and display statistics
        System.out.println("Sum = " + sumOfFactors(factors));
        System.out.println("Product = " + productOfFactors(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));

        // Closing the Scanner to free resources
        sc.close();
    }
}
