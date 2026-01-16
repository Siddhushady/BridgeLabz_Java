package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * ArmstrongNumber class checks if a number is an Armstrong number (3-digit).
 * An Armstrong number is a number that equals the sum of the cubes of its digits.
 * For example, 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 * The program reads a number, extracts its digits, calculates the sum of cubes,
 * and compares it with the original number.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to check for Armstrong property
        int number = input.nextInt();
        // Storing original number for comparison later
        int originalNumber = number;
        // Initializing sum to accumulate cubes of digits
        int sum = 0;

        // Loop to extract digits and calculate sum of cubes
        while (number != 0) {
            // Extracting the last digit
            int digit = number % 10;
            // Adding cube of the digit to sum
            sum += digit * digit * digit;
            // Removing the last digit by integer division
            number = number / 10;
        }

        // Checking if sum of cubes equals the original number
        if (sum == originalNumber) {
            // Displaying that the number is an Armstrong number
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            // Displaying that the number is not an Armstrong number
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
