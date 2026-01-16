package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * HarshadNumber class checks if a number is a Harshad number (also called Niven number).
 * A Harshad number is a number that is divisible by the sum of its digits.
 * For example, 18 is a Harshad number because 1+8=9 and 18 is divisible by 9.
 * The program reads a number, calculates the sum of its digits, and checks divisibility.
 */
public class HarshadNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to check for Harshad property
        int number = input.nextInt();
        // Storing original number for comparison later
        int originalNumber = number;
        // Initializing sum to accumulate digits
        int sum = 0;

        // Loop to extract digits and calculate their sum
        while (number != 0) {
            // Adding the last digit to sum
            sum += number % 10;
            // Removing the last digit by integer division
            number = number / 10;
        }

        // Checking if original number is divisible by sum of its digits
        if (originalNumber % sum == 0) {
            // Displaying that the number is a Harshad number
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            // Displaying that the number is not a Harshad number
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
