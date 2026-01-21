package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * LargestDigits class finds the largest and second largest digits in a given number.
 * The program reads a number, extracts all its digits into an array (up to 10 digits),
 * and then finds the largest and second largest digits by iterating through the array
 * and comparing values. It displays both results at the end.
 */
public class LargestDigits {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for digit analysis
        int number = sc.nextInt();

        // Maximum size for digits array (handles up to 10 digits)
        int maxDigit = 10;
        // Declaring array to store extracted digits
        int[] digits = new int[maxDigit];
        // Index variable to track current number of digits stored
        int index = 0;

        // Loop to extract digits from the number (limited by maxDigit)
        while (number != 0 && index < maxDigit) {
            // Extracting last digit and storing in array, then incrementing index
            digits[index++] = number % 10;
            // Removing the last digit by integer division
            number /= 10;
        }

        // Initializing variables to track largest and second largest digits
        int largest = 0, secondLargest = 0;

        // Loop to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            // Checking if current digit is larger than the current largest
            if (digits[i] > largest) {
                // Updating second largest to previous largest
                secondLargest = largest;
                // Updating largest to current digit
                largest = digits[i];
            } 
            // Checking if current digit is larger than second largest but not equal to largest
            else if (digits[i] > secondLargest && digits[i] != largest) {
                // Updating second largest to current digit
                secondLargest = digits[i];
            }
        }

        // Displaying the largest digit found
        System.out.println("Largest = " + largest);
        // Displaying the second largest digit found
        System.out.println("Second Largest = " + secondLargest);

        // Closing the Scanner to free resources
        sc.close();
    }
}
