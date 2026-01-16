package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * FizzBuzzWhile class implements the FizzBuzz game using a while loop.
 * The program reads a positive number and for each number from 1 to that number,
 * it displays "FizzBuzz" if divisible by both 3 and 5, "Fizz" if divisible by 3,
 * "Buzz" if divisible by 5, or the number itself otherwise.
 */
public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the upper limit number for FizzBuzz game
        int number = input.nextInt();
        // Initializing loop counter
        int i = 1;

        // Validating that the number is positive
        if (number > 0) {
            // While loop to process each number from 1 to the given number
            while (i <= number) {
                // Checking if number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                // Checking if number is divisible by 3
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                // Checking if number is divisible by 5
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                // If not divisible by 3 or 5, display the number itself
                else
                    System.out.println(i);
                // Incrementing loop counter for next iteration
                i++;
            }
        }
    }
}
