package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * BMITwoDimension class calculates Body Mass Index using a 2D array to store person data.
 * The program uses a 2D array where each row represents a person with columns for weight,
 * height, and BMI. It reads weight and height for multiple people, calculates BMI for each,
 * categorizes them into health status categories, and displays all results.
 */
public class BMITwoDimension {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number of people for BMI calculation
        int n = sc.nextInt();

        // Declaring 2D array: each row is a person, columns are [weight, height, BMI]
        double[][] personData = new double[n][3];
        // Declaring array to store BMI status categories for each person
        String[] status = new String[n];

        // Loop to process each person's data
        for (int i = 0; i < n; i++) {
            // Reading weight and storing in column 0
            personData[i][0] = sc.nextDouble(); // weight
            // Reading height and storing in column 1
            personData[i][1] = sc.nextDouble(); // height

            // Calculating BMI and storing in column 2: weight / (height^2)
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            // Extracting BMI value for easier comparison
            double bmi = personData[i][2];

            // Categorizing BMI status based on standard ranges
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Loop to display all people's data
        for (int i = 0; i < n; i++) {
            // Printing height, weight, BMI, and status for each person
            System.out.println(personData[i][1] + " " +
                    personData[i][0] + " " +
                    personData[i][2] + " " +
                    status[i]);
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
