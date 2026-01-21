package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * NaturalNumberSum class calculates the sum of first n natural numbers using a formula.
 * The program reads a natural number from the user, validates it is positive,
 * and then calculates the sum using the mathematical formula: n * (n + 1) / 2.
 * This formula efficiently computes the sum without using loops.
 */
public class NaturalNumberSum {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number of natural numbers to sum
        int n = input.nextInt();

        // Validating that the number is a natural number (positive)
        if (n > 0) {
            // Calculating sum using formula: n * (n + 1) / 2
            int sum = n * (n + 1) / 2;
            // Displaying the calculated sum
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            // Displaying error message for non-natural numbers
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
