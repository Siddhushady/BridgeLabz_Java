package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * SumNaturalRecursive class calculates sum of natural numbers using recursion and formula.
 * The program demonstrates recursive method usage by creating a function that recursively
 * calculates the sum, and also provides a formula-based method. Both approaches produce
 * the same result, showing different ways to solve the same problem.
 */
public class SumNaturalRecursive {

    /**
     * Calculates sum of natural numbers using recursion.
     * @param n The upper limit (number of natural numbers to sum)
     * @return Sum of numbers from 1 to n
     */
    public static int recursiveSum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) return 0;
        // Recursive case: add n to sum of numbers from 1 to (n-1)
        return n + recursiveSum(n - 1);
    }

    /**
     * Calculates sum of natural numbers using mathematical formula.
     * @param n The upper limit (number of natural numbers to sum)
     * @return Sum of numbers from 1 to n
     */
    public static int formulaSum(int n) {
        // Using formula: n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number of natural numbers to sum
        int n = sc.nextInt();

        // Validating that n is positive
        if (n <= 0) return;

        // Calling recursive method to calculate sum
        int sum1 = recursiveSum(n);
        // Calling formula method to calculate sum
        int sum2 = formulaSum(n);

        // Displaying sum calculated using recursion
        System.out.println(sum1);
        // Displaying sum calculated using formula
        System.out.println(sum2);

        // Closing the Scanner to free resources
        sc.close();
    }
}
