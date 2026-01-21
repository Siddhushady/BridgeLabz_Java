package Core_Programming.Control_Flow.Level1;

/**
 * SpringSeason class determines if a given date falls within the spring season.
 * The program takes month and day as command-line arguments and checks if the date
 * falls between March 20 and June 20 (inclusive), which is considered spring season.
 * It displays whether the given date is in spring season or not.
 */
public class SpringSeason {
    public static void main(String[] args) {
        // Parsing month from command-line argument (first argument)
        int month = Integer.parseInt(args[0]);
        // Parsing day from command-line argument (second argument)
        int day = Integer.parseInt(args[1]);

        // Checking if date falls within spring season (March 20 - June 20)
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            // Displaying that it's spring season
            System.out.println("Its a Spring Season");
        } else {
            // Displaying that it's not spring season
            System.out.println("Not a Spring Season");
        }
    }
}
