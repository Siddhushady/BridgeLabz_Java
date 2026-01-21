package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * PrimeNumber class checks if a number is prime.
 * A prime number is a natural number greater than 1 that has no positive divisors
 * other than 1 and itself. The program reads a number, checks if it's <= 1 (not prime),
 * then tests divisibility from 2 up to number/2. If any divisor is found, the number
 * is not prime. The loop breaks early when a divisor is found for efficiency.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to check for prime property
        int number = input.nextInt();
        // Initializing flag to track if number is prime
        boolean isPrime = true;

        // Checking if number is less than or equal to 1 (not prime)
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop to check divisibility from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                // Checking if i divides evenly into number
                if (number % i == 0) {
                    // Setting flag to false if divisor found
                    isPrime = false;
                    // Breaking loop early since we found a divisor
                    break;
                }
            }
        }

        // Displaying result based on prime status
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
