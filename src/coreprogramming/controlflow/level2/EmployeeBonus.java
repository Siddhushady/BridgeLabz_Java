package Core_Programming.Control_Flow.Level2;

import java.util.Scanner;

/**
 * EmployeeBonus class calculates bonus for an employee based on years of service.
 * The program reads an employee's salary and years of service, and if the employee
 * has worked for more than 5 years, calculates a 5% bonus on their salary.
 * Otherwise, no bonus is applicable. The bonus amount is displayed to the user.
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the employee's salary
        double salary = input.nextDouble();
        // Reading the employee's years of service
        int years = input.nextInt();

        // Checking if employee has more than 5 years of service
        if (years > 5) {
            // Calculating bonus as 5% of salary
            double bonus = salary * 0.05;
            // Displaying the calculated bonus amount
            System.out.println("Bonus amount is " + bonus);
        } else {
            // Displaying message when bonus is not applicable
            System.out.println("No bonus applicable");
        }
    }
}
