package coreprogramming.String.Level3;

import java.util.Scanner;

/**
 * CalendarDisplay class displays a calendar for a given month and year.
 * The program demonstrates string manipulation and date calculations by creating methods
 * to check for leap years and calculate the first day of the month using Zeller's congruence
 * algorithm. It displays a formatted calendar grid with days of the week.
 */
public class CalendarDisplay {

    /**
     * Checks if a year is a leap year.
     * @param year Year to check
     * @return true if leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        // Leap year: divisible by 400 OR (divisible by 4 AND not divisible by 100)
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    /**
     * Calculates the day of the week for the first day of a month using Zeller's congruence.
     * @param month Month (1-12)
     * @param year Year
     * @return Day of week (0=Sunday, 1=Monday, ..., 6=Saturday)
     */
    public static int getFirstDay(int month, int year) {
        // Zeller's congruence algorithm adjustments
        int y0 = year - (14 - month) / 12;
        // Calculating day of week components
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Adjusting month for algorithm
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Returning day of week (0=Sunday, 6=Saturday)
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {

        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompting user to enter month and year
        System.out.print("Enter month and year: ");
        // Reading month from user
        int month = sc.nextInt();
        // Reading year from user
        int year = sc.nextInt();

        // Array storing days in each month (non-leap year)
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Adjusting February for leap years
        if (month == 2 && isLeapYear(year)) days[1] = 29;

        // Displaying calendar header with day names
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Calling method to get first day of the month
        int firstDay = getFirstDay(month, year);
        // Loop to print spaces for days before the first day of month
        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        // Loop to print all days of the month
        for (int day = 1; day <= days[month - 1]; day++) {
            // Formatting and printing day number
            System.out.printf("%3d ", day);
            // Moving to next line after every 7 days (end of week)
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
    }
}
