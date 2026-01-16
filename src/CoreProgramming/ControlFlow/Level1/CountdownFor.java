package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * CountdownFor class performs a countdown from a given number to 1 using a for loop.
 * The program reads a starting number from the user and displays all numbers from that
 * number down to 1 in descending order, demonstrating the use of for loops with
 * decrementing iteration.
 */
public class CountdownFor {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the starting number for countdown
        int counter = input.nextInt();

        // For loop to countdown from counter to 1 (decrementing)
        for (int i = counter; i >= 1; i--) {
            // Printing the current countdown value
            System.out.println(i);
        }
    }
}
