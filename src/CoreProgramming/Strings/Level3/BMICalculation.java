package CoreProgramming.String.Level3;

import java.util.Scanner;

/**
 * BMICalculation class calculates BMI (Body Mass Index) for multiple people using string arrays.
 * The program demonstrates string manipulation and array operations by creating methods to
 * calculate BMI from weight and height, determine BMI status (Underweight, Normal, Overweight, Obese),
 * and display results in a formatted table. It processes data for 10 people.
 */
public class BMICalculation {

    /**
     * Determines BMI status based on BMI value.
     * @param bmi BMI value
     * @return Status string: "Underweight", "Normal", "Overweight", or "Obese"
     */
    public static String getStatus(double bmi) {
        // Checking BMI ranges and returning appropriate status
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        // Returning "Obese" for BMI >= 30
        return "Obese";
    }

    /**
     * Calculates BMI for all people and creates result table.
     * @param data 2D array with [weight, height] for each person
     * @return 2D array with [height, weight, BMI, status] for each person
     */
    public static String[][] calculateBMI(double[][] data) {

        // Creating result array: same number of people, 4 columns [height, weight, BMI, status]
        String[][] result = new String[data.length][4];

        // Loop to calculate BMI for each person
        for (int i = 0; i < data.length; i++) {
            // Extracting weight from data
            double weight = data[i][0];
            // Converting height from cm to meters
            double heightMeters = data[i][1] / 100;

            // Calculating BMI: weight / (height in meters)^2
            double bmi = weight / (heightMeters * heightMeters);

            // Storing height (in cm) as string
            result[i][0] = String.valueOf(data[i][1]);
            // Storing weight (in kg) as string
            result[i][1] = String.valueOf(weight);
            // Formatting BMI to 2 decimal places
            result[i][2] = String.format("%.2f", bmi);
            // Getting and storing BMI status
            result[i][3] = getStatus(bmi);
        }
        // Returning array with calculated results
        return result;
    }

    /**
     * Displays the BMI calculation table.
     * @param table 2D array containing [height, weight, BMI, status] for each person
     */
    public static void display(String[][] table) {
        // Displaying table header
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        // Enhanced for loop to display each person's data
        for (String[] row : table) {
            // Displaying formatted row with all BMI information
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Creating array to store input for 10 people, 2 columns [weight, height]
        double[][] input = new double[10][2];

        // Loop to read weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            // Prompting user to enter weight
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            // Reading weight from user
            input[i][0] = sc.nextDouble();
            // Prompting user to enter height
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            // Reading height from user
            input[i][1] = sc.nextDouble();
        }

        // Calling method to calculate BMI for all people
        String[][] result = calculateBMI(input);
        // Calling method to display results table
        display(result);
    }
}
