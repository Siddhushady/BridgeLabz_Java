package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * AbundantNumber class checks if a number is an abundant number.
 * An abundant number is a number for which the sum of its proper divisors
 * (all divisors except the number itself) is greater than the number itself.
 * The program reads a number, calculates the sum of its proper divisors,
 * and determines if it is abundant.
 */
public class AbundantNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to check for abundance
        int number = input.nextInt();
        // Initializing sum to accumulate proper divisors
        int sum = 0;

        // Loop to find all proper divisors (from 1 to number-1)
        for (int i = 1; i < number; i++) {
            // Checking if i is a divisor of the number
            if (number % i == 0) {
                // Adding the divisor to the sum
                sum += i;
            }
        }

        // Checking if sum of proper divisors is greater than the number
        if (sum > number) {
            // Displaying that the number is abundant
            System.out.println(number + " is an Abundant Number");
        } else {
            // Displaying that the number is not abundant
            System.out.println(number + " is not an Abundant Number");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
