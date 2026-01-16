package Core_Programming.Methods.Level1;

import java.util.Scanner;

/**
 * MinMax class finds the smallest and largest among three numbers using a method.
 * The program demonstrates method usage by creating a function that uses Math.min
 * and Math.max to find the minimum and maximum values from three integers.
 * The results are returned as an array containing [smallest, largest].
 */
public class MinMax {
    /**
     * Finds the smallest and largest among three numbers.
     * @param a First number
     * @param b Second number
     * @param c Third number
     * @return Array containing [smallest, largest]
     */
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        // Finding smallest using nested Math.min calls
        int smallest = Math.min(a, Math.min(b, c));
        // Finding largest using nested Math.max calls
        int largest = Math.max(a, Math.max(b, c));
        // Returning array with smallest and largest values
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading first number
        int a = sc.nextInt();
        // Reading second number
        int b = sc.nextInt();
        // Reading third number
        int c = sc.nextInt();

        // Calling method to find smallest and largest
        int[] result = findSmallestAndLargest(a, b, c);
        // Displaying the smallest number
        System.out.println("Smallest = " + result[0]);
        // Displaying the largest number
        System.out.println("Largest = " + result[1]);

        // Closing the Scanner to free resources
        sc.close();
    }
}
