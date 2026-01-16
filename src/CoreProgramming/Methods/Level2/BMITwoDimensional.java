package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * BMITwoDimensional class calculates BMI for multiple people using 2D arrays and methods.
 * The program uses a 2D array where each row represents a person with columns for weight,
 * height, and BMI. It demonstrates method usage by creating functions to calculate BMI
 * and determine health status categories. The program processes 10 people's data.
 */
public class BMITwoDimensional {

    /**
     * Calculates BMI for all people in the 2D array.
     * Modifies the array in place, storing BMI in the third column.
     * @param data 2D array with [weight, height in cm, BMI] for each person
     */
    public static void calculateBMI(double[][] data) {
        // Loop to process each person's data
        for (int i = 0; i < data.length; i++) {
            // Converting height from centimeters to meters
            double heightMeters = data[i][1] / 100;
            // Calculating BMI and storing in third column: weight / (height^2)
            data[i][2] = data[i][0] / (heightMeters * heightMeters);
        }
    }

    /**
     * Determines health status category for each person based on BMI.
     * @param data 2D array containing BMI values in third column
     * @return Array of status strings for each person
     */
    public static String[] getStatus(double[][] data) {
        // Creating array to store status for each person
        String[] status = new String[data.length];

        // Loop to categorize each person's BMI
        for (int i = 0; i < data.length; i++) {
            // Extracting BMI value from array
            double bmi = data[i][2];
            // Categorizing BMI into health status ranges
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        // Returning array of status categories
        return status;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Declaring 2D array: 10 people, 3 columns [weight, height, BMI]
        double[][] data = new double[10][3];

        // Loop to read weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            // Reading weight and storing in column 0
            data[i][0] = sc.nextDouble(); // weight
            // Reading height in cm and storing in column 1
            data[i][1] = sc.nextDouble(); // height cm
        }

        // Calling method to calculate BMI for all people
        calculateBMI(data);
        // Calling method to get health status for all people
        String[] status = getStatus(data);

        // Loop to display all people's data
        for (int i = 0; i < 10; i++) {
            // Displaying height, weight, BMI, and status for each person
            System.out.println(data[i][1] + " " + data[i][0] + " " + data[i][2] + " " + status[i]);
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
