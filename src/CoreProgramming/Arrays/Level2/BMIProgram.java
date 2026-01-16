package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * BMIProgram class calculates Body Mass Index (BMI) for multiple people using arrays.
 * The program reads the number of people, then for each person it reads their weight
 * and height, calculates their BMI, and categorizes them as Underweight, Normal,
 * Overweight, or Obese based on standard BMI ranges. All data is stored in parallel
 * arrays and displayed at the end.
 */
public class BMIProgram {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number of people for BMI calculation
        int n = sc.nextInt();

        // Declaring array to store weights of all people
        double[] weight = new double[n];
        // Declaring array to store heights of all people
        double[] height = new double[n];
        // Declaring array to store calculated BMI values
        double[] bmi = new double[n];
        // Declaring array to store BMI status categories
        String[] status = new String[n];

        // Loop to process each person's data
        for (int i = 0; i < n; i++) {
            // Reading weight for the current person
            weight[i] = sc.nextDouble();
            // Reading height for the current person
            height[i] = sc.nextDouble();

            // Calculating BMI using formula: weight / (height^2)
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Categorizing BMI status based on standard ranges
            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Loop to display all people's data
        for (int i = 0; i < n; i++) {
            // Printing height, weight, BMI, and status for each person
            System.out.println(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i]);
        }

        // Closing the Scanner to free resources
        sc.close();
    }
}
