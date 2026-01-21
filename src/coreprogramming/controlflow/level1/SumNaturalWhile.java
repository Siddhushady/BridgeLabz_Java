package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * SumNaturalWhile class calculates the sum of first n natural numbers using both
 * a mathematical formula and a while loop, demonstrating two different approaches.
 * The program reads a natural number, validates it, and then calculates the sum
 * using the formula n*(n+1)/2 and also by iterating through numbers 1 to n with a while loop.
 * Both results are displayed to show they produce the same answer.
 */
public class SumNaturalWhile {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number of natural numbers to sum
        int n = input.nextInt();

        // Validating that the number is a natural number (positive)
        if (n > 0) {
            // Calculating sum using mathematical formula: n * (n + 1) / 2
            int sumFormula = n * (n + 1) / 2;
            // Initializing sum variable for loop-based calculation
            int sumLoop = 0;
            // Initializing loop counter
            int i = 1;

            // While loop to add all numbers from 1 to n
            while (i <= n) {
                // Adding current number to the running sum
                sumLoop += i;
                // Incrementing loop counter for next iteration
                i++;
            }

            // Displaying sum calculated using formula
            System.out.println("Sum using formula = " + sumFormula);
            // Displaying sum calculated using while loop
            System.out.println("Sum using while loop = " + sumLoop);
        } else {
            // Displaying error message for non-natural numbers
            System.out.println("Not a natural number");
        }
    }
}
