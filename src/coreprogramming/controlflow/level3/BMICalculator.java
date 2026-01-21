package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * BMICalculator class calculates Body Mass Index (BMI) and categorizes the result.
 * The program reads weight in kilograms and height in centimeters, converts height
 * to meters, calculates BMI using the formula weight/(height^2), and then categorizes
 * the result into Underweight, Normal, Overweight, or Obese based on standard ranges.
 */
public class BMICalculator {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading weight in kilograms
        double weight = input.nextDouble();
        // Reading height in centimeters
        double heightCm = input.nextDouble();

        // Converting height from centimeters to meters
        double heightMeter = heightCm / 100;
        // Calculating BMI using formula: weight / (height in meters)^2
        double bmi = weight / (heightMeter * heightMeter);

        // Displaying the calculated BMI value
        System.out.println("BMI is: " + bmi);

        // Categorizing BMI into health status categories
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 40) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
