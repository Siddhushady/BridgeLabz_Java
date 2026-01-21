package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * EmployeeBonus class calculates bonuses and new salaries for 10 employees based on their years of service.
 * The program reads salary and years of service for each employee, validates the input, calculates
 * bonuses (5% for employees with more than 5 years, 2% for others), computes new salaries,
 * and displays the total bonus, total old salary, and total new salary across all employees.
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring array to store salaries of 10 employees
        double[] salary = new double[10];
        // Declaring array to store years of service for 10 employees
        double[] years = new double[10];
        // Declaring array to store calculated bonuses
        double[] bonus = new double[10];
        // Declaring array to store new salaries after bonus
        double[] newSalary = new double[10];

        // Initializing variables to accumulate totals across all employees
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to read employee data with input validation
        for (int i = 0; i < 10; i++) {
            // Prompting user to enter employee data
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            // Reading salary for current employee
            salary[i] = sc.nextDouble();
            // Reading years of service for current employee
            years[i] = sc.nextDouble();

            // Validating that salary is positive and years is non-negative
            if (salary[i] <= 0 || years[i] < 0) {
                // Displaying error message for invalid input
                System.out.println("Invalid input. Re-enter.");
                // Decrementing index to re-enter data for this employee
                i--;
                continue;
            }
        }

        // Loop to calculate bonuses and new salaries for all employees
        for (int i = 0; i < 10; i++) {
            // Calculating bonus: 5% if years > 5, otherwise 2%
            bonus[i] = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            // Calculating new salary by adding bonus to original salary
            newSalary[i] = salary[i] + bonus[i];

            // Accumulating totals for summary statistics
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Displaying total bonus across all employees
        System.out.println("Total Bonus = " + totalBonus);
        // Displaying total of all original salaries
        System.out.println("Total Old Salary = " + totalOldSalary);
        // Displaying total of all new salaries after bonuses
        System.out.println("Total New Salary = " + totalNewSalary);

        // Closing the Scanner to free resources
        sc.close();
    }
}
