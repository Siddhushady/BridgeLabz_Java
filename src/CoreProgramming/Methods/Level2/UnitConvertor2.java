package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * UnitConvertor2 class provides unit conversion methods for length measurements.
 * The program demonstrates method usage by creating conversion functions for
 * yards/feet, meters/inches, and inches/centimeters. It uses a switch statement
 * to select the appropriate conversion based on user choice and displays the converted value.
 */
class UnitConvertor2 {

    /**
     * Converts yards to feet.
     * @param yards Length in yards
     * @return Length in feet
     */
    public static double convertYardsToFeet(double yards) {
        // Converting using conversion factor: 1 yard = 3 feet
        return yards * 3;
    }

    /**
     * Converts feet to yards.
     * @param feet Length in feet
     * @return Length in yards
     */
    public static double convertFeetToYards(double feet) {
        // Converting using conversion factor: 1 foot = 1/3 yard
        return feet * 0.333333;
    }

    /**
     * Converts meters to inches.
     * @param meters Length in meters
     * @return Length in inches
     */
    public static double convertMetersToInches(double meters) {
        // Converting using conversion factor: 1 meter = 39.3701 inches
        return meters * 39.3701;
    }

    /**
     * Converts inches to meters.
     * @param inches Length in inches
     * @return Length in meters
     */
    public static double convertInchesToMeters(double inches) {
        // Converting using conversion factor: 1 inch = 0.0254 meters
        return inches * 0.0254;
    }

    /**
     * Converts inches to centimeters.
     * @param inches Length in inches
     * @return Length in centimeters
     */
    public static double convertInchesToCentimeters(double inches) {
        // Converting using conversion factor: 1 inch = 2.54 cm
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Displaying menu options for unit conversion
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");

        // Reading user's choice
        int choice = sc.nextInt();
        // Reading value to convert
        double value = sc.nextDouble();
        // Initializing result variable
        double result = 0;

        // Switch statement to call appropriate conversion method
        switch (choice) {
            case 1: result = convertYardsToFeet(value); break;
            case 2: result = convertFeetToYards(value); break;
            case 3: result = convertMetersToInches(value); break;
            case 4: result = convertInchesToMeters(value); break;
            case 5: result = convertInchesToCentimeters(value); break;
            default:
                // Displaying error for invalid choice
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        // Displaying the converted value
        System.out.println("Converted Value = " + result);
        // Closing the Scanner to free resources
        sc.close();
    }
}
