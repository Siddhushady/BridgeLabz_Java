package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * UnitConvertor1 class provides unit conversion methods for distance measurements.
 * The program demonstrates method usage by creating conversion functions for
 * kilometers/miles and meters/feet. It uses a switch statement to select the
 * appropriate conversion based on user choice and displays the converted value.
 */
public class UnitConvertor1 {

    /**
     * Converts kilometers to miles.
     * @param km Distance in kilometers
     * @return Distance in miles
     */
    public static double convertKmToMiles(double km) {
        // Converting using conversion factor: 1 km = 0.621371 miles
        return km * 0.621371;
    }

    /**
     * Converts miles to kilometers.
     * @param miles Distance in miles
     * @return Distance in kilometers
     */
    public static double convertMilesToKm(double miles) {
        // Converting using conversion factor: 1 mile = 1.60934 km
        return miles * 1.60934;
    }

    /**
     * Converts meters to feet.
     * @param meters Distance in meters
     * @return Distance in feet
     */
    public static double convertMetersToFeet(double meters) {
        // Converting using conversion factor: 1 meter = 3.28084 feet
        return meters * 3.28084;
    }

    /**
     * Converts feet to meters.
     * @param feet Distance in feet
     * @return Distance in meters
     */
    public static double convertFeetToMeters(double feet) {
        // Converting using conversion factor: 1 foot = 0.3048 meters
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Displaying menu options for unit conversion
        System.out.println("1. KM to Miles");
        System.out.println("2. Miles to KM");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");

        // Reading user's choice
        int choice = sc.nextInt();
        // Reading value to convert
        double value = sc.nextDouble();
        // Initializing result variable
        double result = 0;

        // Switch statement to call appropriate conversion method
        switch (choice) {
            case 1: result = convertKmToMiles(value); break;
            case 2: result = convertMilesToKm(value); break;
            case 3: result = convertMetersToFeet(value); break;
            case 4: result = convertFeetToMeters(value); break;
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
