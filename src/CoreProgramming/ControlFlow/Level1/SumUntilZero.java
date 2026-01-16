package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * SumUntilZero class continuously reads numbers and sums them until zero is entered.
 * The program reads the first value before the loop, then continues reading and summing
 * values in a while loop until the value zero is entered. The total sum of all non-zero
 * values is displayed at the end.
 */
public class SumUntilZero {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Initializing total sum to zero
        double total = 0.0;
        // Reading the first value before entering the loop
        double value = input.nextDouble();

        // While loop that continues as long as value is not zero
        while (value != 0) {
            // Adding current value to the running total
            total += value;
            // Reading the next value for next iteration
            value = input.nextDouble();
        }

        // Displaying the accumulated total sum
        System.out.println("The total sum is " + total);
    }
}
