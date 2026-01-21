package Core_Programming.Arrays.Level2;

import java.util.Scanner;

/**
 * DynamicLargestDigits class finds the largest and second largest digits in a number using dynamic array resizing.
 * The program reads a number, extracts all its digits into an array with automatic resizing when needed,
 * and then finds the largest and second largest digits. The array dynamically grows by 10 elements
 * whenever it reaches capacity to handle numbers of any length.
 */
public class DynamicLargestDigits {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Reading the number for digit analysis
        int number = sc.nextInt();

        // Initial maximum size for the digits array
        int maxDigit = 10;
        // Declaring array to store extracted digits
        int[] digits = new int[maxDigit];
        // Index variable to track current number of digits stored
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {
            // Checking if array is full and needs resizing
            if (index == maxDigit) {
                // Increasing array size by 10
                maxDigit += 10;
                // Creating a new temporary array with increased size
                int[] temp = new int[maxDigit];
                // Copying all existing digits to the new array
                for (int i = 0; i < digits.length; i++) temp[i] = digits[i];
                // Reassigning digits array to the new larger array
                digits = temp;
            }
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
