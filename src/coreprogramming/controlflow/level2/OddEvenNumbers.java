package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * OddEvenNumbers class classifies numbers from 1 to a given number as odd or even.
 * The program reads a natural number from the user and then displays each number
 * from 1 to that number along with its classification as "Odd" or "Even".
 * Numbers divisible by 2 are even, others are odd.
 */
public class OddEvenNumbers {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the upper limit number
        int number = input.nextInt();

        // Validating that the number is a natural number (positive)
        if (number > 0) {
            // For loop to process each number from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Checking if the number is even (divisible by 2)
                if (i % 2 == 0) {
                    // Displaying that the number is even
                    System.out.println(i + " is Even");
                } else {
                    // Displaying that the number is odd
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            // Displaying error message for non-natural numbers
            System.out.println("Not a natural number");
        }
    }
}
