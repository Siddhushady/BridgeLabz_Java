package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * MultiplesBelow100While class finds all multiples of a given number that are below 100.
 * The program reads a number between 1 and 99, then searches from 100 down to 1 to find
 * all numbers that are multiples of the given number. The multiples are displayed in
 * descending order using a while loop.
 */
public class MultiplesBelow100While {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the number for which multiples need to be found
        int number = input.nextInt();
        // Initializing counter to start from 100
        int counter = 100;

        // Validating that number is between 1 and 99
        if (number > 0 && number < 100) {
            // While loop to search from 100 down to 1
            while (counter > 1) {
                // Checking if counter is a multiple of the given number
                if (counter % number == 0) {
                    // Displaying the multiple
                    System.out.println(counter);
                }
                // Decrementing counter for next iteration
                counter--;
            }
        }
    }
}
