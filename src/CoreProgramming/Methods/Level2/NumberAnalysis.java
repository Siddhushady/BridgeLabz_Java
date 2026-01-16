package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * NumberAnalysis class performs various number analysis operations using multiple methods.
 * The program demonstrates method usage by creating functions to check if a number is
 * positive, even, and to compare two numbers. It reads 5 numbers, analyzes each one,
 * and compares the first and last numbers.
 */
public class NumberAnalysis {

    /**
     * Checks if a number is positive.
     * @param n The number to check
     * @return true if positive, false otherwise
     */
    public static boolean isPositive(int n) {
        // Returning true if number is greater than 0
        return n > 0;
    }

    /**
     * Checks if a number is even.
     * @param n The number to check
     * @return true if even, false otherwise
     */
    public static boolean isEven(int n) {
        // Returning true if number is divisible by 2
        return n % 2 == 0;
    }

    /**
     * Compares two numbers.
     * @param a First number
     * @param b Second number
     * @return 1 if a > b, 0 if a == b, -1 if a < b
     */
    public static int compare(int a, int b) {
        // Returning 1 if first number is greater
        if (a > b) return 1;
        // Returning 0 if numbers are equal
        if (a == b) return 0;
        // Returning -1 if first number is smaller
        return -1;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Declaring array to store 5 numbers
        int[] arr = new int[5];

        // Loop to read and analyze 5 numbers
        for (int i = 0; i < 5; i++) {
            // Reading number from user
            arr[i] = sc.nextInt();
            // Checking if number is positive
            if (isPositive(arr[i])) {
                // Displaying "Even" or "Odd" based on method result
                System.out.println(isEven(arr[i]) ? "Even" : "Odd");
            } else {
                // Displaying "Negative" for non-positive numbers
                System.out.println("Negative");
            }
        }

        // Calling method to compare first and last numbers and displaying result
        System.out.println(compare(arr[0], arr[4]));
        // Closing the Scanner to free resources
        sc.close();
    }
}
