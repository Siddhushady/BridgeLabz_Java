package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * FactorialWhile class calculates the factorial of a number using a while loop.
 * The program reads a natural number from the user, validates it is positive,
 * and then calculates its factorial by multiplying all numbers from 1 to n
 * using a while loop. Factorial is the product of all positive integers up to that number.
 */
public class FactorialWhile {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number for factorial calculation
        int n = input.nextInt();

        // Validating that the number is a natural number (positive)
        if (n > 0) {
            // Initializing factorial result to 1
            int fact = 1;
            // Initializing loop counter
            int i = 1;

            // While loop to multiply all numbers from 1 to n
            while (i <= n) {
                // Multiplying current factorial by the loop counter
                fact *= i;
                // Incrementing loop counter for next iteration
                i++;
            }

            // Displaying the calculated factorial
            System.out.println("Factorial of " + n + " is " + fact);
        } else {
            // Displaying error message for non-natural numbers
            System.out.println("Not a natural number");
        }
    }
}
