package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * GreatestFactorFor class finds the greatest factor (excluding the number itself) of a given number.
 * The program reads a number and searches from (number-1) down to 1 to find the largest
 * number that divides evenly into it. It uses a for loop with break statement to stop
 * as soon as the first (and largest) factor is found, since we're searching in descending order.
 */
public class GreatestFactorFor {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the number for which greatest factor needs to be found
        int number = input.nextInt();
        // Initializing greatest factor to 1 (minimum possible factor)
        int greatestFactor = 1;

        // For loop to search from (number-1) down to 1 in descending order
        for (int i = number - 1; i >= 1; i--) {
            // Checking if i is a factor (divides evenly into number)
            if (number % i == 0) {
                // Storing the factor as greatest factor
                greatestFactor = i;
                // Breaking the loop since we found the largest factor (searching top-down)
                break;
            }
        }

        // Displaying the greatest factor found
        System.out.println("Greatest factor is " + greatestFactor);
    }
}
