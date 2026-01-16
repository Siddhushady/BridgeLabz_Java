package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * DivisibleByFive class checks if a given number is divisible by 5.
 * The program reads a number from the user and uses the modulo operator to determine
 * if the number is divisible by 5 (remainder is 0). It then displays the result
 * as a boolean value.
 */
public class DivisibleByFive {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to check for divisibility
        int number = input.nextInt();
        // Checking if number is divisible by 5 using modulo operator
        boolean result = (number % 5 == 0);

        // Displaying the number and divisibility result
        System.out.println("Is the number " + number + " divisible by 5? " + result);
    }
}
