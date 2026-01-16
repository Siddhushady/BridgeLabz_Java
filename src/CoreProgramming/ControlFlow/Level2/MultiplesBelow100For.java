package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * MultiplesBelow100For class finds all multiples of a given number that are below 100.
 * The program reads a number between 1 and 99, then searches from 100 down to 1 to find
 * all numbers that are multiples of the given number. The multiples are displayed in
 * descending order using a for loop.
 */
public class MultiplesBelow100For {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the number for which multiples need to be found
        int number = input.nextInt();

        // Validating that number is between 1 and 99
        if (number > 0 && number < 100) {
            // For loop to search from 100 down to 1
            for (int i = 100; i >= 1; i--) {
                // Checking if i is a multiple of the given number
                if (i % number == 0) {
                    // Displaying the multiple
                    System.out.println(i);
                }
            }
        }
    }
}
