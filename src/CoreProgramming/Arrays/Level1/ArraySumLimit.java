package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * ArraySumLimit class is designed to calculate the sum of positive numbers entered by the user.
 * The program reads double values from the user until a non-positive value is entered or
 * the maximum array size (10 elements) is reached. It then calculates and displays the sum
 * of all valid positive numbers stored in the array.
 */
public class ArraySumLimit {
    static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring an array to store up to 10 double values
        double[] n = new double[10];
        // Initializing sum variable to accumulate the total
        double sum = 0.0;
        // Index variable to track the current position in the array
        int index = 0;

        // Loop to continuously read values until a stopping condition is met
        while (true) {
            // Reading the next double value from user input
            double value = sc.nextDouble();
            // Checking if value is non-positive or array is full (index 9 means 10th element)
            if (value <= 0 || index == 9)
                break;
            // Storing the valid value in the array and incrementing index
            n[index++] = value;
        }

        // Loop to iterate through all stored values and calculate the sum
        for (int i = 0; i < index; i++) {
            // Adding each array element to the sum
            sum += n[i];
        }

        // Displaying the calculated sum to the user
        System.out.println("\nSum: " + sum);
    }
}
