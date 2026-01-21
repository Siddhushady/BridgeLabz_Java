package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * WindChill class calculates wind chill temperature using a method.
 * The program demonstrates method usage by creating a function that calculates wind chill
 * using the National Weather Service formula. Wind chill is the perceived temperature
 * when wind is factored in, making it feel colder than the actual temperature.
 */
public class WindChill {
    /**
     * Calculates wind chill temperature using NWS formula.
     * @param temp Temperature in Fahrenheit
     * @param windSpeed Wind speed in miles per hour
     * @return Calculated wind chill temperature
     */
    public static double calculateWindChill(double temp, double windSpeed) {
        // Calculating wind chill using National Weather Service formula
        return 35.74 + 0.6215 * temp +
                (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading temperature in Fahrenheit
        double temp = sc.nextDouble();
        // Reading wind speed in miles per hour
        double windSpeed = sc.nextDouble();

        // Calling method to calculate and display wind chill
        System.out.println("Wind Chill = " + calculateWindChill(temp, windSpeed));
        // Closing the Scanner to free resources
        sc.close();
    }
}
