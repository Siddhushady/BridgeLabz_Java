package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * SumNatural class calculates the sum of first n natural numbers using a method.
 * The program demonstrates method usage by creating a function that uses a for loop
 * to iterate from 1 to n and accumulate the sum. The method returns the total sum
 * of all natural numbers from 1 to the given number.
 */
public class SumNatural {
    /**
     * Calculates the sum of first n natural numbers using a loop.
     * @param n The upper limit (number of natural numbers to sum)
     * @return The sum of numbers from 1 to n
     */
    public static int sumOfNaturalNumbers(int n) {
        // Initializing sum to accumulate total
        int sum = 0;
        // Loop to add all numbers from 1 to n
        for (int i = 1; i <= n; i++) sum += i;
        // Returning the calculated sum
        return sum;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number of natural numbers to sum
        int n = sc.nextInt();

        // Calling method to calculate and display sum
        System.out.println("Sum = " + sumOfNaturalNumbers(n));
        // Closing the Scanner to free resources
        sc.close();
    }
}
