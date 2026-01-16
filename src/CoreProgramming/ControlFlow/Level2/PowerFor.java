package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * PowerFor class calculates the power of a number using a for loop.
 * The program reads a base number and an exponent, then calculates the result
 * by multiplying the base by itself for the number of times specified by the exponent.
 * For example, 2^3 = 2 * 2 * 2 = 8.
 */
public class PowerFor {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the base number
        int number = input.nextInt();
        // Reading the exponent (power)
        int power = input.nextInt();

        // Initializing result to 1 (identity element for multiplication)
        int result = 1;

        // For loop to multiply base by itself 'power' number of times
        for (int i = 1; i <= power; i++) {
            // Multiplying result by base number
            result *= number;
        }

        // Displaying the calculated power result
        System.out.println("Result is " + result);
    }
}
