package Core_Programming.Methods.Level3;

/**
 * CalendarDisplay class displays a calendar for a given month and year using methods.
 * The program demonstrates advanced method usage by creating functions to check leap years
 * and calculate the day of week for the first day of a month using Zeller's congruence.
 * It displays a formatted calendar with proper spacing and alignment.
 */
public class CalendarDisplay {

    /**
     * Checks if a year is a leap year.
     * @param y The year to check
     * @return true if leap year, false otherwise
     */
    static boolean isLeapYear(int y) {
        // Checking leap year condition: divisible by 400 OR (divisible by 4 AND not divisible by 100)
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    /**
     * Calculates the day of week for the first day of a month using Zeller's congruence.
     * @param m The month (1-12)
     * @param y The year
     * @return Day of week (0=Sunday, 1=Monday, ..., 6=Saturday)
     */
    static int getFirstDay(int m, int y) {
        // Zeller's congruence algorithm: adjusting year for January and February
        int y0 = y - (14 - m) / 12;
        // Calculating intermediate value x for Zeller's formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Adjusting month for Zeller's formula
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Calculating day of week for first day of month
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        // Setting month and year to display
        int month = 7, year = 2005;

        // Array of month abbreviations
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        // Array of days in each month (non-leap year)
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Adjusting February days for leap year
        if (month == 2 && isLeapYear(year)) days[1] = 29;

        // Displaying month and year header
        System.out.println(months[month - 1] + " " + year);
        // Displaying day names header
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Getting day of week for first day of month
        int start = getFirstDay(month, year);
        // Adding spaces to align first day correctly
        for (int i = 0; i < start; i++)
            System.out.print("    ");

        // Loop to display all days of the month
        for (int d = 1; d <= days[month - 1]; d++) {
            // Displaying day number with formatting
            System.out.printf("%3d ", d);
            // Moving to next line after every 7 days
            if ((d + start) % 7 == 0) System.out.println();
        }
    }
}
