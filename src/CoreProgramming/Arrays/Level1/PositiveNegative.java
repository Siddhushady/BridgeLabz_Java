package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * PositiveNegative class analyzes an array of 5 integers to determine their sign and parity.
 * The program reads 5 integers from the user, stores them in an array, and then analyzes
 * each number to determine if it's positive, negative, or zero. For positive numbers, it
 * also determines if they are even or odd. Finally, it compares the second element (N2)
 * with the last element (N5) and displays the comparison result.
 */
public class PositiveNegative {
    static void main (String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Declaring array to store 5 integers
        int[] n = new int[5];
        // Loop to read 5 integers from the user
        for (int i = 0; i < n.length; i++) {
            // Prompting user to enter each number with its position
            System.out.print("Enter N" + (i + 1) + ": ");
            // Reading and storing the integer in the array
            n[i] = scan.nextInt();
        }
        // Printing a blank line for formatting
        System.out.println();

        // Loop to analyze each number in the array
        for (int i = 0; i < n.length; i++) {
            // Checking if the number is positive
            if (n[i] > 0) {
                // Displaying that the number is positive
                System.out.print("N" + (i + 1) + ": Positive, ");
                // Checking if the positive number is even
                if (n[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            }
            // Checking if the number is zero
            else if (n[i] == 0)
                System.out.println("N" + (i + 1) + ": Zero");
            // If not positive or zero, it must be negative
            else
                System.out.println("N" + (i + 1) + ": Negative");
        }
        // Printing a blank line for formatting
        System.out.println();

        // Comparing the second element (index 1) with the last element (index 4)
        if (n[1] > n[n.length - 1])
            System.out.println("N1 is greater than N5");
        else if (n[1] == n[n.length - 1])
            System.out.println("N1 is equal to N5");
        else
            System.out.println("N1 is less than N5");
    }
}
