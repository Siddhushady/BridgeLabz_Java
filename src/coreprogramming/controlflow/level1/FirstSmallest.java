package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * FirstSmallest class checks if the first of three numbers is the smallest.
 * The program reads three integers from the user and compares them to determine
 * if the first number is smaller than both the second and third numbers.
 * It displays the result as a boolean value.
 */
public class FirstSmallest {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the first number
        int n1 = input.nextInt();
        // Reading the second number
        int n2 = input.nextInt();
        // Reading the third number
        int n3 = input.nextInt();

        // Checking if first number is smaller than both second and third numbers
        boolean result = (n1 < n2 && n1 < n3);

        // Displaying the comparison result
        System.out.println("Is the first number the smallest? " + result);
    }
}
