package Core_Programming.Arrays.Level1;

import java.util.Scanner;

/**
 * MeanHeight class calculates the average (mean) height from 11 height measurements.
 * The program reads 11 height values from the user, stores them in an array,
 * calculates their sum, and then computes and displays the mean height.
 */
public class MeanHeight {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring array to store 11 height measurements
        double[] heights = new double[11];
        // Initializing sum variable to accumulate total height
        double sum = 0;

        // Loop to read 11 height values from the user
        for (int i = 0; i < 11; i++) {
            // Reading height value and storing in array
            heights[i] = sc.nextDouble();
            // Adding the height to the running sum
            sum += heights[i];
        }

        // Calculating the mean by dividing sum by number of measurements (11)
        double mean = sum / 11;
        // Displaying the calculated mean height
        System.out.println("Mean Height = " + mean);
        // Closing the Scanner to free resources
        sc.close();
    }
}
