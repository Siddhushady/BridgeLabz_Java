package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * LeapYear class determines if a given year is a leap year using multiple if-else conditions.
 * A leap year is divisible by 4, except for years divisible by 100, unless they are also
 * divisible by 400. The program validates that the year is >= 1582 (when Gregorian calendar
 * was introduced) and applies the leap year rules accordingly.
 */
public class LeapYear {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        // Reading the year to check for leap year
        int year = input.nextInt();

        // Validating that year is >= 1582 (Gregorian calendar start)
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        }
        // Checking if year is divisible by 400 (leap year)
        else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        // Checking if year is divisible by 100 but not 400 (not leap year)
        else if (year % 100 == 0) {
            System.out.println(year + " is not a Leap Year");
        }
        // Checking if year is divisible by 4 (leap year)
        else if (year % 4 == 0) {
            System.out.println(year + " is a Leap Year");
        }
        // If none of the above conditions, it's not a leap year
        else {
            System.out.println(year + " is not a Leap Year");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
