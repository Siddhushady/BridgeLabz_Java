package Core_Programming.Methods.Level2;

import java.util.Scanner;

/**
 * FriendsCompare class finds the youngest and tallest among three friends using methods.
 * The program demonstrates method usage by creating functions that find the index of
 * the person with minimum age and maximum height. It uses parallel arrays to store
 * ages, heights, and names, then displays the youngest and tallest friends.
 */
public class FriendsCompare {

    /**
     * Finds the index of the youngest person (minimum age).
     * @param age Array of ages
     * @return Index of person with minimum age
     */
    public static int findYoungest(int[] age) {
        // Initializing index of minimum age to first person
        int min = 0;
        // Loop to compare ages and find minimum
        for (int i = 1; i < age.length; i++)
            // Updating min index if current age is smaller
            if (age[i] < age[min]) min = i;
        // Returning index of youngest person
        return min;
    }

    /**
     * Finds the index of the tallest person (maximum height).
     * @param height Array of heights
     * @return Index of person with maximum height
     */
    public static int findTallest(double[] height) {
        // Initializing index of maximum height to first person
        int max = 0;
        // Loop to compare heights and find maximum
        for (int i = 1; i < height.length; i++)
            // Updating max index if current height is larger
            if (height[i] > height[max]) max = i;
        // Returning index of tallest person
        return max;
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring arrays to store ages and heights of 3 friends
        int[] age = new int[3];
        double[] height = new double[3];
        // Initializing array with names of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Loop to read age and height for each friend
        for (int i = 0; i < 3; i++) {
            // Reading age for current friend
            age[i] = sc.nextInt();
            // Reading height for current friend
            height[i] = sc.nextDouble();
        }

        // Calling method to find youngest and displaying name
        System.out.println(names[findYoungest(age)]);
        // Calling method to find tallest and displaying name
        System.out.println(names[findTallest(height)]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
