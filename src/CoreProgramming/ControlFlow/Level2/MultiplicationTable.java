package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * MultiplicationTable class generates a partial multiplication table for multipliers 6 to 9.
 * The program reads a number from the user and displays its multiplication with numbers
 * 6, 7, 8, and 9. Each multiplication expression and result is displayed in a formatted
 * manner using a for loop.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the number for which multiplication table will be generated
        int number = input.nextInt();

        // For loop to generate multiplication for multipliers 6 through 9
        for (int i = 6; i <= 9; i++) {
            // Displaying multiplication expression and calculated result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
