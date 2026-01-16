package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * CountdownWhile class performs a countdown from a given number to 1 using a while loop.
 * The program reads a starting number from the user and displays all numbers from that
 * number down to 1 in descending order, demonstrating the use of while loops with
 * manual decrementing of the counter variable.
 */
public class CountdownWhile {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the starting number for countdown
        int counter = input.nextInt();

        // While loop to countdown from counter to 1
        while (counter >= 1) {
            // Printing the current countdown value
            System.out.println(counter);
            // Decrementing the counter for next iteration
            counter--;
        }
    }
}
