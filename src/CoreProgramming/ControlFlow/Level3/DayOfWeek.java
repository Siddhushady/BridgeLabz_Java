package Core_Programming.Control_Flow.Level3;

/**
 * DayOfWeek class calculates the day of the week for a given date using Zeller's congruence algorithm.
 * The program takes month, day, and year as command-line arguments and uses Zeller's formula
 * to determine which day of the week (0=Sunday, 1=Monday, ..., 6=Saturday) the date falls on.
 * This is a mathematical algorithm for calculating the day of the week for any date.
 */
public class DayOfWeek {
    public static void main(String[] args) {
        // Parsing month from command-line argument
        int m = Integer.parseInt(args[0]);
        // Parsing day from command-line argument
        int d = Integer.parseInt(args[1]);
        // Parsing year from command-line argument
        int y = Integer.parseInt(args[2]);

        // Zeller's congruence algorithm: adjusting year for January and February
        int y0 = y - (14 - m) / 12;
        // Calculating intermediate value x for Zeller's formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Adjusting month for Zeller's formula
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Calculating day of week (0=Sunday, 1=Monday, ..., 6=Saturday)
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Displaying the calculated day of the week
        System.out.println("Day of the week is: " + d0);
    }
}
