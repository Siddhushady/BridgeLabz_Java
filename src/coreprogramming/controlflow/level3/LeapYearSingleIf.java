package Core_Programming.Control_Flow.Level3;

import java.util.Scanner;

/**
 * LeapYearSingleIf class determines if a given year is a leap year using a single if statement.
 * A leap year is divisible by 4, except for years divisible by 100, unless they are also
 * divisible by 400. The program validates that the year is >= 1582 and combines all leap year
 * conditions into a single boolean expression for more concise code.
 */
public class LeapYearSingleIf {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the year to check for leap year
        int year = input.nextInt();

        // Single condition checking: year >= 1582 AND (divisible by 400 OR (divisible by 4 AND not divisible by 100))
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            // Displaying that the year is a leap year
            System.out.println(year + " is a Leap Year");
        } else {
            // Displaying that the year is not a leap year
            System.out.println(year + " is not a Leap Year");
        }

        // Closing the Scanner to free resources
        input.close();
    }
}
