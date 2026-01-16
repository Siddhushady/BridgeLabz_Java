package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * LeapYearCheck class determines if a year is a leap year using a method.
 * The program demonstrates method usage by creating a function that implements
 * the leap year rules: divisible by 400, or divisible by 4 but not by 100.
 * Years before 1582 (Gregorian calendar start) are considered invalid.
 */
public class LeapYearCheck {

    /**
     * Checks if a year is a leap year.
     * @param year The year to check
     * @return true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // Checking if year is before Gregorian calendar (invalid)
        if (year < 1582) return false;
        // Checking leap year condition: divisible by 400 OR (divisible by 4 AND not divisible by 100)
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the year to check
        int year = sc.nextInt();

        // Calling method to check if year is leap year and displaying result
        if (isLeapYear(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        // Closing the Scanner to free resources
        sc.close();
    }
}
