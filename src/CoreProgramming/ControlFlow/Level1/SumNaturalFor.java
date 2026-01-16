package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * SumNaturalFor class calculates the sum of first n natural numbers using both
 * a mathematical formula and a for loop, demonstrating two different approaches.
 * The program reads a natural number, validates it, and then calculates the sum
 * using the formula n*(n+1)/2 and also by iterating through numbers 1 to n.
 * Both results are displayed to show they produce the same answer.
 */
public class SumNaturalFor {
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

            // For loop to add all numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                // Adding current number to the running sum
                sumLoop += i;
            }

            // Displaying sum calculated using formula
            System.out.println("Sum using formula = " + sumFormula);
            // Displaying sum calculated using for loop
            System.out.println("Sum using for loop = " + sumLoop);
        } else {
            // Displaying error message for non-natural numbers
            System.out.println("Not a natural number");
        }
    }
}
