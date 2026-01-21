package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * MultiplicationTableSixToNine class generates a partial multiplication table for multipliers 6 to 9.
 * The program reads a number from the user and calculates its multiplication with numbers
 * 6, 7, 8, and 9, storing the results in an array. It then displays these four
 * multiplication operations with their results.
 */
public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for which partial multiplication table will be generated
        int number = sc.nextInt();

        // Declaring array to store 4 multiplication results (for multipliers 6, 7, 8, 9)
        int[] result = new int[4];

        // Loop to calculate multiplication for multipliers 6 through 9
        for (int i = 6; i <= 9; i++) {
            // Storing the product (number * i) in array at index (i-6) to map 6->0, 7->1, etc.
            result[i - 6] = number * i;
        }

        // Loop to display the multiplication results for multipliers 6 through 9
        for (int i = 6; i <= 9; i++) {
            // Printing each multiplication expression and result
            System.out.println(number + " * " + i + " = " + result[i - 6]);
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
