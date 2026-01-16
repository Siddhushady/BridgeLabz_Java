package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * FactorsWhile class finds and displays all factors of a given number using a while loop.
 * The program reads a positive number from the user and finds all numbers that divide
 * evenly into it (excluding the number itself). All factors are displayed one per line.
 * This demonstrates the use of while loops for iterative factor checking.
 */
public class FactorsWhile {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the number for which factors need to be found
        int number = input.nextInt();
        // Initializing loop counter
        int i = 1;

        // Validating that the number is positive
        if (number > 0) {
            // While loop to check all numbers from 1 to (number-1)
            while (i < number) {
                // Checking if i is a factor (divides evenly into number)
                if (number % i == 0) {
                    // Displaying the factor
                    System.out.println(i);
                }
                // Incrementing loop counter for next iteration
                i++;
            }
        }
    }
}
