package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * Trigonometry class calculates trigonometric functions (sin, cos, tan) using a method.
 * The program demonstrates method usage by creating a function that takes an angle in degrees,
 * converts it to radians, and calculates sine, cosine, and tangent values using Math class methods.
 * All three values are returned as an array.
 */
public class Trigonometry {
    /**
     * Calculates sin, cos, and tan for a given angle in degrees.
     * @param angle The angle in degrees
     * @return Array containing [sin, cos, tan] values
     */
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle from degrees to radians (required for Math functions)
        double radians = Math.toRadians(angle);
        // Returning array with sin, cos, and tan values
        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading angle in degrees
        double angle = sc.nextDouble();

        // Calling method to calculate trigonometric functions
        double[] result = calculateTrigonometricFunctions(angle);
        // Displaying sine value
        System.out.println("Sin = " + result[0]);
        // Displaying cosine value
        System.out.println("Cos = " + result[1]);
        // Displaying tangent value
        System.out.println("Tan = " + result[2]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
