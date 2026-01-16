package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * Quadratic class solves quadratic equations using the quadratic formula.
 * The program demonstrates method usage by creating a function that calculates
 * roots of a quadratic equation ax^2 + bx + c = 0. It handles three cases:
 * no real roots (negative discriminant), one root (zero discriminant), and two roots.
 */
public class Quadratic {

    /**
     * Finds roots of quadratic equation using quadratic formula.
     * @param a Coefficient of x^2
     * @param b Coefficient of x
     * @param c Constant term
     * @return Array of roots (0, 1, or 2 roots depending on discriminant)
     */
    public static double[] findRoots(double a, double b, double c) {
        // Calculating discriminant: b^2 - 4ac
        double delta = b * b - 4 * a * c;
        // Checking if discriminant is negative (no real roots)
        if (delta < 0) return new double[0];

        // Checking if discriminant is zero (one repeated root)
        if (delta == 0) {
            // Returning single root: -b / (2a)
            return new double[]{-b / (2 * a)};
        }

        // Returning two distinct roots using quadratic formula
        return new double[]{
                // First root: (-b + sqrt(delta)) / (2a)
                (-b + Math.sqrt(delta)) / (2 * a),
                // Second root: (-b - sqrt(delta)) / (2a)
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading coefficient a (x^2 term)
        double a = sc.nextDouble();
        // Reading coefficient b (x term)
        double b = sc.nextDouble();
        // Reading coefficient c (constant term)
        double c = sc.nextDouble();

        // Calling method to find roots
        double[] roots = findRoots(a, b, c);
        // Displaying all roots found
        for (double r : roots) System.out.println(r);

        // Closing the Scanner to free resources
        sc.close();
    }
}
