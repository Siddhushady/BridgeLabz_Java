package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * FizzBuzzArray class implements the FizzBuzz game using an array to store results.
 * For numbers from 0 to a given number, it stores "FizzBuzz" if divisible by both 3 and 5,
 * "Fizz" if divisible by 3, "Buzz" if divisible by 5, or the number itself otherwise.
 * The program validates input and displays all results with their positions.
 */
public class FizzBuzzArray {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the upper limit number for FizzBuzz game
        int number = sc.nextInt();

        // Validating that the input number is positive
        if (number <= 0) {
            // Displaying error message for invalid input
            System.out.println("Invalid Input");
            return;
        }

        // Declaring array to store FizzBuzz results (size is number+1 to include 0)
        String[] result = new String[number + 1];

        // Loop to process each number from 0 to the given number
        for (int i = 0; i <= number; i++) {
            // Checking if number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";
            // Checking if number is divisible by 3
            else if (i % 3 == 0)
                result[i] = "Fizz";
            // Checking if number is divisible by 5
            else if (i % 5 == 0)
                result[i] = "Buzz";
            // If not divisible by 3 or 5, store the number as string
            else
                result[i] = String.valueOf(i);
        }

        // Loop to display all results with their positions
        for (int i = 0; i <= number; i++) {
            // Printing position and corresponding FizzBuzz result
            System.out.println("Position " + i + " = " + result[i]);
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
