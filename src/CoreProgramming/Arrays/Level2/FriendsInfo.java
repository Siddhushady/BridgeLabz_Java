package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * FriendsInfo class manages information about three friends and finds the youngest and tallest.
 * The program stores names of three friends (Amar, Akbar, Anthony) and reads their ages and heights.
 * It then determines which friend is the youngest and which is the tallest by comparing values
 * in the arrays, and displays the results.
 */
public class FriendsInfo {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Declaring array to store ages of 3 friends
        int[] age = new int[3];
        // Declaring array to store heights of 3 friends
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

        // Initializing index to track youngest friend (starting with first friend)
        int youngestIndex = 0;
        // Initializing index to track tallest friend (starting with first friend)
        int tallestIndex = 0;

        // Loop to compare friends and find youngest and tallest
        for (int i = 1; i < 3; i++) {
            // Comparing ages to find the youngest friend
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            // Comparing heights to find the tallest friend
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        // Displaying the name of the youngest friend
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        // Displaying the name of the tallest friend
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
