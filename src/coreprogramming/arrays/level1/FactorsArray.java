package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * FactorsArray class finds and stores all factors of a given number in an array.
 * The program reads a number from the user and calculates all its factors (numbers
 * that divide evenly into it). It uses dynamic array resizing to accommodate any
 * number of factors, doubling the array size when needed. Finally, it displays all
 * the factors found.
 */
public class FactorsArray {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for which factors need to be found
        int number = sc.nextInt();

        // Initial maximum size for the factors array
        int maxSize = 10;
        // Declaring array to store factors with initial capacity
        int[] factors = new int[maxSize];
        // Index variable to track the current number of factors stored
        int index = 0;

        // Loop to check all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Checking if i is a factor (divides evenly into the number)
            if (number % i == 0) {
                // Checking if array is full and needs resizing
                if (index == maxSize) {
                    // Doubling the maximum size
                    maxSize *= 2;
                    // Creating a new temporary array with doubled size
                    int[] temp = new int[maxSize];
                    // Copying all existing factors to the new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    // Reassigning the factors array to the new larger array
                    factors = temp;
                }
                // Storing the factor in the array and incrementing index
                factors[index++] = i;
            }
        }

        // Loop to display all factors found
        for (int i = 0; i < index; i++) {
            // Printing each factor followed by a space
            System.out.print(factors[i] + " ");
        }
        // Closing the Scanner to free resources
        sc.close();
    }
}
