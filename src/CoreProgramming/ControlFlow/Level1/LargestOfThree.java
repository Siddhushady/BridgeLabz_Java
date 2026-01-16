package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * LargestOfThree class determines which of three numbers is the largest.
 * The program reads three integers from the user and checks each number to see
 * if it is larger than the other two. It displays boolean results indicating
 * whether each number is the largest among the three.
 */
public class LargestOfThree {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the first number
        int n1 = input.nextInt();
        // Reading the second number
        int n2 = input.nextInt();
        // Reading the third number
        int n3 = input.nextInt();

        // Checking if first number is larger than both second and third
        System.out.println("Is the first number the largest? " + (n1 > n2 && n1 > n3));
        // Checking if second number is larger than both first and third
        System.out.println("Is the second number the largest? " + (n2 > n1 && n2 > n3));
        // Checking if third number is larger than both first and second
        System.out.println("Is the third number the largest? " + (n3 > n1 && n3 > n2));
    }
}
