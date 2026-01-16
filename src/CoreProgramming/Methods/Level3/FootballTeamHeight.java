package Core_Programming.Methods.Level3;

import java.util.Random;

/**
 * FootballTeamHeight class calculates statistics for a football team's heights using multiple methods.
 * The program demonstrates advanced method usage by creating functions to calculate sum, mean,
 * shortest, and tallest heights. It generates random heights for 11 players (150-250 cm) and
 * displays individual heights along with team statistics.
 */
public class FootballTeamHeight {

    /**
     * Calculates the sum of all player heights.
     * @param heights Array of player heights
     * @return Sum of all heights
     */
    public static int sumHeights(int[] heights) {
        // Initializing sum to accumulate total
        int sum = 0;
        // Enhanced for loop to add each height to sum
        for (int h : heights) sum += h;
        // Returning the calculated sum
        return sum;
    }

    /**
     * Calculates the mean (average) height of all players.
     * @param heights Array of player heights
     * @return Mean height as a double
     */
    public static double meanHeight(int[] heights) {
        // Calculating mean by dividing sum by number of players
        return (double) sumHeights(heights) / heights.length;
    }

    /**
     * Finds the shortest height among all players.
     * @param heights Array of player heights
     * @return Shortest height value
     */
    public static int shortestHeight(int[] heights) {
        // Initializing minimum to first player's height
        int min = heights[0];
        // Enhanced for loop to find minimum height
        for (int h : heights)
            // Updating min if current height is smaller
            if (h < min) min = h;
        // Returning the shortest height
        return min;
    }

    /**
     * Finds the tallest height among all players.
     * @param heights Array of player heights
     * @return Tallest height value
     */
    public static int tallestHeight(int[] heights) {
        // Initializing maximum to first player's height
        int max = heights[0];
        // Enhanced for loop to find maximum height
        for (int h : heights)
            // Updating max if current height is larger
            if (h > max) max = h;
        // Returning the tallest height
        return max;
    }

    public static void main(String[] args) {
        // Declaring array to store heights of 11 players
        int[] heights = new int[11];
        // Creating Random object to generate random heights
        Random r = new Random();

        // Loop to generate and display random heights for 11 players
        for (int i = 0; i < heights.length; i++) {
            // Generating random height between 150 and 250 cm
            heights[i] = 150 + r.nextInt(101); // 150–250
            // Displaying each player's height
            System.out.println("Player " + (i + 1) + " Height: " + heights[i]);
        }

        // Calling methods to calculate and display team statistics
        System.out.println("Shortest Height = " + shortestHeight(heights));
        System.out.println("Tallest Height = " + tallestHeight(heights));
        System.out.println("Mean Height = " + meanHeight(heights));
    }
}
