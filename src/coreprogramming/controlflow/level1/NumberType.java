package Core_Programming.Control_Flow.Level1;

import java.util.Scanner;

/**
 * NumberType class determines whether a number is positive, negative, or zero.
 * The program reads an integer from the user and uses if-else statements to
 * classify the number based on its value. It displays "positive", "negative",
 * or "zero" accordingly.
 */
public class NumberType {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Reading the number to classify
        int number = input.nextInt();

        // Checking if the number is positive
        if (number > 0) {
            System.out.println("positive");
        } 
        // Checking if the number is negative
        else if (number < 0) {
            System.out.println("negative");
        } 
        // If neither positive nor negative, it must be zero
        else {
            System.out.println("zero");
        }
    }
}
