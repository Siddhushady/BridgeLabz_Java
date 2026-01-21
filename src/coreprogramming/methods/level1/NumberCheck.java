package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * NumberCheck class determines the sign of a number using a method.
 * The program demonstrates method usage by creating a function that returns 1 for
 * positive numbers, -1 for negative numbers, and 0 for zero. This is a signum function
 * implementation that classifies numbers based on their sign.
 */
public class NumberCheck {
    /**
     * Checks the sign of a number and returns corresponding value.
     * @param number The number to check
     * @return 1 if positive, -1 if negative, 0 if zero
     */
    public static int checkNumber(int number) {
        // Returning 1 if number is positive
        if (number > 0) return 1;
        // Returning -1 if number is negative
        if (number < 0) return -1;
        // Returning 0 if number is zero
        return 0;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number to check
        int number = sc.nextInt();

        // Calling method to check number sign and displaying result
        System.out.println(checkNumber(number));
        // Closing the Scanner to free resources
        sc.close();
    }
}
