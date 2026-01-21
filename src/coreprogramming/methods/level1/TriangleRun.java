package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * TriangleRun class calculates how many rounds can be completed around a triangular track.
 * The program demonstrates method usage by creating a function that takes three sides of
 * a triangle, calculates the perimeter, and determines how many rounds of 5000 units
 * can be completed around the triangular track.
 */
public class TriangleRun {
    /**
     * Calculates number of rounds possible around a triangular track.
     * @param a First side of triangle
     * @param b Second side of triangle
     * @param c Third side of triangle
     * @return Number of rounds (5000 / perimeter)
     */
    public static double calculateRounds(double a, double b, double c) {
        // Calculating perimeter of the triangle
        double perimeter = a + b + c;
        // Calculating and returning number of rounds (total distance / perimeter)
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading first side of triangle
        double a = sc.nextDouble();
        // Reading second side of triangle
        double b = sc.nextDouble();
        // Reading third side of triangle
        double c = sc.nextDouble();

        // Calling method to calculate and display rounds needed
        System.out.println("Rounds needed = " + calculateRounds(a, b, c));
        // Closing the Scanner to free resources
        sc.close();
    }
}
