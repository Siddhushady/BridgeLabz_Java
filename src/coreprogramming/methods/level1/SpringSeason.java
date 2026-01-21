package Core_Programming.Methods.Level1;

/**
 * SpringSeason class determines if a given date falls within spring season using a method.
 * The program demonstrates method usage by creating a function that checks if a date
 * (month and day) falls between March 20 and June 20, which is considered spring season.
 * It takes command-line arguments for month and day.
 */
public class SpringSeason {
    /**
     * Checks if the given date falls within spring season (March 20 - June 20).
     * @param month The month (1-12)
     * @param day The day of the month
     * @return true if date is in spring season, false otherwise
     */
    public static boolean isSpring(int month, int day) {
        // Checking if date is in spring: March 20+, April, May, or June up to 20
        return (month == 3 && day >= 20) ||
                (month == 4 || month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        // Parsing month from command-line argument
        int month = Integer.parseInt(args[0]);
        // Parsing day from command-line argument
        int day = Integer.parseInt(args[1]);

        // Calling method to check if date is in spring season
        if (isSpring(month, day))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}
