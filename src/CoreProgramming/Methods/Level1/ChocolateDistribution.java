package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * ChocolateDistribution class distributes chocolates among children using a method.
 * The program demonstrates method usage by creating a function that calculates how many
 * chocolates each child gets (quotient) and how many remain (remainder) when distributing
 * a given number of chocolates equally among a given number of children.
 */
public class ChocolateDistribution {
    /**
     * Calculates quotient and remainder when distributing chocolates among children.
     * @param chocolates Total number of chocolates
     * @param children Number of children
     * @return Array containing [quotient, remainder]
     */
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        // Returning array with quotient (chocolates per child) and remainder (leftover)
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading total number of chocolates
        int chocolates = sc.nextInt();
        // Reading number of children
        int children = sc.nextInt();

        // Calling method to calculate distribution
        int[] result = findRemainderAndQuotient(chocolates, children);
        // Displaying chocolates each child gets (quotient)
        System.out.println("Each child gets " + result[0]);
        // Displaying remaining chocolates (remainder)
        System.out.println("Remaining chocolates " + result[1]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
