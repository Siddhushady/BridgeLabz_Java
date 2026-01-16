package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * SimpleInterest class calculates simple interest using a method.
 * The program demonstrates the use of methods by creating a function that calculates
 * simple interest using the formula: (Principal * Rate * Time) / 100.
 * It reads principal, rate, and time from the user and displays the calculated interest.
 */
public class SimpleInterest {
    /**
     * Calculates simple interest based on principal, rate, and time.
     * @param principal The principal amount
     * @param rate The rate of interest
     * @param time The time period
     * @return The calculated simple interest
     */
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        // Calculating and returning simple interest using formula
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading principal amount from user
        double principal = sc.nextDouble();
        // Reading rate of interest from user
        double rate = sc.nextDouble();
        // Reading time period from user
        double time = sc.nextDouble();

        // Calling method to calculate simple interest
        double si = calculateSimpleInterest(principal, rate, time);

        // Displaying the calculated simple interest with all input values
        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        // Closing the Scanner to free resources
        sc.close();
    }
}
