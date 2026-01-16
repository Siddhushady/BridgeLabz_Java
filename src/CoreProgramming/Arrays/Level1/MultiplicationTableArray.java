package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * MultiplicationTableArray class generates and stores a multiplication table in an array.
 * The program reads a number from the user and calculates its multiplication table
 * from 1 to 10, storing all results in an array. It then displays the complete
 * multiplication table with formatted output.
 */
public class MultiplicationTableArray {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for which multiplication table will be generated
        int number = sc.nextInt();

        // Declaring array to store multiplication table results (10 elements)
        int[] table = new int[10];

        // Loop to calculate multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            // Storing the product (number * i) in the array at index (i-1)
            table[i - 1] = number * i;
        }

        // Loop to display the complete multiplication table
        for (int i = 1; i <= 10; i++) {
            // Printing each multiplication expression and result
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
