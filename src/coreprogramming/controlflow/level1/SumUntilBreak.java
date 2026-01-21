package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * SumUntilBreak class continuously reads numbers and sums them until a non-positive value is entered.
 * The program uses an infinite while loop that breaks when a value less than or equal to zero
 * is entered. All positive values are accumulated and the total sum is displayed at the end.
 * This demonstrates the use of break statement to exit a loop conditionally.
 */
public class SumUntilBreak {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Initializing total sum to zero
        double total = 0.0;

        // Infinite loop that continues until break is called
        while (true) {
            // Reading the next double value from user
            double value = input.nextDouble();
            // Checking if value is non-positive (termination condition)
            if (value <= 0) {
                // Breaking out of the loop when non-positive value is entered
                break;
            }
            // Adding positive value to the running total
            total += value;
        }

        // Displaying the accumulated total sum
        System.out.println("The total sum is " + total);
    }
}
