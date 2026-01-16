package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * UnitConvertor3 class provides unit conversion methods for temperature, weight, and volume.
 * The program demonstrates method usage by creating conversion functions for
 * Fahrenheit/Celsius, Pounds/Kilograms, and Gallons/Liters. It uses a switch statement
 * to select the appropriate conversion based on user choice and displays the converted value.
 */
public class UnitConvertor3 {

    /**
     * Converts Fahrenheit to Celsius.
     * @param f Temperature in Fahrenheit
     * @return Temperature in Celsius
     */
    public static double convertFarhenheitToCelsius(double f) {
        // Converting using formula: (F - 32) * 5/9
        return (f - 32) * 5 / 9;
    }

    /**
     * Converts Celsius to Fahrenheit.
     * @param c Temperature in Celsius
     * @return Temperature in Fahrenheit
     */
    public static double convertCelsiusToFarhenheit(double c) {
        // Converting using formula: (C * 9/5) + 32
        return (c * 9 / 5) + 32;
    }

    /**
     * Converts pounds to kilograms.
     * @param p Weight in pounds
     * @return Weight in kilograms
     */
    public static double convertPoundsToKilograms(double p) {
        // Converting using conversion factor: 1 pound = 0.453592 kg
        return p * 0.453592;
    }

    /**
     * Converts kilograms to pounds.
     * @param k Weight in kilograms
     * @return Weight in pounds
     */
    public static double convertKilogramsToPounds(double k) {
        // Converting using conversion factor: 1 kg = 2.20462 pounds
        return k * 2.20462;
    }

    /**
     * Converts gallons to liters.
     * @param g Volume in gallons
     * @return Volume in liters
     */
    public static double convertGallonsToLiters(double g) {
        // Converting using conversion factor: 1 gallon = 3.78541 liters
        return g * 3.78541;
    }

    /**
     * Converts liters to gallons.
     * @param l Volume in liters
     * @return Volume in gallons
     */
    public static double convertLitersToGallons(double l) {
        // Converting using conversion factor: 1 liter = 0.264172 gallons
        return l * 0.264172;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Displaying menu options for unit conversion
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");

        // Reading user's choice
        int choice = sc.nextInt();
        // Reading value to convert
        double value = sc.nextDouble();
        // Initializing result variable
        double result = 0;

        // Switch statement to call appropriate conversion method
        switch (choice) {
            case 1: result = convertFarhenheitToCelsius(value); break;
            case 2: result = convertCelsiusToFarhenheit(value); break;
            case 3: result = convertPoundsToKilograms(value); break;
            case 4: result = convertKilogramsToPounds(value); break;
            case 5: result = convertGallonsToLiters(value); break;
            case 6: result = convertLitersToGallons(value); break;
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
