package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * OddEvenArray class separates numbers from 1 to a given number into odd and even arrays.
 * The program reads an integer from the user and then categorizes all numbers from 1 to that
 * integer into separate arrays for odd and even numbers. Finally, it displays both arrays
 * showing all odd numbers and all even numbers separately.
 */
public class OddEvenArray {
    static void main (String args[]) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter an integer
        System.out.print("Enter an integer: ");
        // Reading the upper limit integer
        int n = sc.nextInt();

        // Declaring array to store odd numbers (size n/2+1 to handle maximum possible odds)
        int[] odd = new int[n / 2 + 1];
        // Declaring array to store even numbers (size n/2+1 to handle maximum possible evens)
        int[] even = new int[n / 2 + 1];

        // Index variable to track position in odd array
        int oddIndex = 0;
        // Index variable to track position in even array
        int evenIndex = 0;

        // Loop to iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Checking if the number is even (divisible by 2)
            if (i % 2 == 0)
                // Storing even number in even array and incrementing index
                even[evenIndex++] = i;
            else
                // Storing odd number in odd array and incrementing index
                odd[oddIndex++] = i;
        }

        // Displaying label for odd numbers
        System.out.print("Odd numbers: ");
        // Loop to display all odd numbers stored in the array
        for (int i = 0; i < oddIndex; i++) {
            // Printing each odd number followed by a space
            System.out.print(odd[i] + " ");
        }

        // Moving to next line
        System.out.println();
        // Displaying label for even numbers
        System.out.print("Even numbers: ");
        // Loop to display all even numbers stored in the array
        for (int i = 0; i < evenIndex; i++) {
            // Printing each even number followed by a space
            System.out.print(even[i] + " ");
        }
    }
}
